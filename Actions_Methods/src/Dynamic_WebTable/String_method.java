package Dynamic_WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class String_method {
	
	
	public static void main(String[] args) {
		
		
		//split method
		String s="javatpoint";
		String arr[]=s.split("t",0);
		
		for(String w:arr)
		{
			System.out.println(w);
		}
		
		
		System.out.println("------------------1-----------");
		
		String s1="my name is khaN";
		
		String []word=s1.split("\\s",0);
		
		for(String wd:word)
		{
			System.out.println(wd);
		}
		
		System.out.println("----------------2------------");
		
		String s2="Java t point guru";
		String [] words=s2.split("\\s",1);
		
		for(String w1:words)
		{
			System.out.println(w1);
		}
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.switchTo().alert().sendKeys("kjhjkhk");
		
		
		
		
		
		
		
	}

}
