package Practice_task;

import org.openqa.selenium.WebDriver;

public class TestCase1 {

	
	public static WebDriver driver=null;
	
	public static void main(String[] args) 
	{
		
		
		Homepage.clickOnsignButton(driver).sendKeys("kjhk");
	
		
	}
	
	
}
