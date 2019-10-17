package Dynamic_WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.gicko.driver", "exe.path");
		
		driver=new FirefoxDriver();
		
		driver.navigate().to("xyz_webtable_side");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//locate table
		WebElement table=driver.findElement(By.xpath("html/body/table"));
		
		//find row of table
		List<WebElement> rows_table=table.findElements(By.tagName("tr"));
		
		int count_row=rows_table.size();
		
		for(int row=0; row<count_row; row++)
		{
			
			List<WebElement> colum_row=rows_table.get(row).findElements(By.tagName("td"));
			
			int count_column=colum_row.size();
			
			for(int column=0; column<count_column; column++)
			{
				String cellText=colum_row.get(column).getText();
				
				System.out.println("cell of row no"+row+" and column no"+column+" is "+cellText);
				
			}
			
			System.out.println("-----------------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
