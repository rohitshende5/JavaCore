package Amazom;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionS_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		//Title of WebPage
		String title=driver.getTitle();
		System.out.println("Title of Amazon WebPage is:"+title);
		
		//getCurrent Url
		String url=driver.getCurrentUrl();
		System.out.println("Current Url Is:"+url);
		
		//No of HyperLinks On Webpage
		List<WebElement> ls=driver.findElements(By.tagName("a"));
		int count=ls.size();
		System.out.println("The no of HyperLinks on WebPage Are:"+count);
		
		//doubleClick
		WebElement youramzon=driver.findElement(By.id("nav-your-amazon"));
		Actions action=new Actions(driver);
		action.doubleClick(youramzon).build().perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title1=driver.getTitle();
		System.out.println("The title of webPage is:"+title1);
		
		driver.navigate().back();
		
		//Right click
		WebElement amazonpay=driver.findElement(By.linkText("Amazon Pay"));
		Actions action1=new Actions(driver);
		Action rightclick=action1.contextClick(amazonpay).build();
		rightclick.perform();
		
		//moveTOelement
		Thread.sleep(5000);
		WebElement youracc=driver.findElement(By.id("nav-link-yourAccount"));
		Actions action2=new Actions(driver);
		action2.moveToElement(youracc).build().perform();
		
		/*Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.sendKeys(Keys.TAB);
		*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='nav-text'][.='Your Orders']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")));
		
		WebElement email=driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
		boolean flag=email.isDisplayed();
		if(flag==true)
		{
			driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("9960880572");
		} 
		
		driver.findElement(By.xpath("//input[@aria-labelledby='continue-announce']")).click();
		
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("77777778");
		
		driver.findElement(By.cssSelector("input.a-button-input")).click();
	
		//function fail screenshot
		/*EventFiringWebDriver drive=new EventFiringWebDriver(driver);
		File src=drive.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src.new File("kkkhjh"))
		String win=driver.getWindowHandle();
		System.out.println("the name of window: "+win);*/

		driver.close();		
		
	}
	
	
}   
