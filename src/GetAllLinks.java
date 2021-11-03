import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConn;

public class GetAllLinks 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		 System.out.println("Total links :"+links.size());
		
		String str[] = new String[links.size()];
		
		
		int c =0;
		
		for(WebElement link : links)
		{
			if(!link.getText().equals(""))
			{
			str[c]= link.getText();
			c++;
			}
			// System.out.println(link.getText());
		}
		
		for(String s :str)
		{
			System.out.println(s);
		}
		
		
		
	}

}
