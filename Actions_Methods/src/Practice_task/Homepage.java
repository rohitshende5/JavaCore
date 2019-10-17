package Practice_task;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	
	static WebElement element;
	
	public  static WebElement clickOnsignButton(WebDriver driver)
	{
		element = driver.findElement(By.id("kjhj3"));
		return element;
	}
	
	
}
