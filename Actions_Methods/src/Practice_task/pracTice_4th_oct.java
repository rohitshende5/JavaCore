package Practice_task;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pracTice_4th_oct {

	static WebDriver driver=new ChromeDriver();
	
	public static void main(String[] args) {
		
		
		//Single and MultiWindow Handle 
		String mainWind=driver.getWindowHandle();
		
		System.out.println(mainWind);
		
		Set<String > s=driver.getWindowHandles();
		
		Iterator<String > itr=s.iterator();
		while(itr.hasNext())
		{
			String child=itr.next();
			
			if(!mainWind.equals(child))
			{
				String childName=driver.switchTo().window(child).getTitle();
				System.out.println(childName);
			}
		}
		
		
		//Synchronized wait
		WebDriverWait wait=new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("path "))));
		
		driver.findElement(By.id("lkjkljlkj")).sendKeys("kjkjk");
		driver.findElement(By.name("lkjlkj")).click();
		
		
		
		//fluent wait
		
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
		
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement web=wait1.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver t)
			{
				return null;
			}
			
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
