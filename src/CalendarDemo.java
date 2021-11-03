import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConn;

public class CalendarDemo {

	public static void main(String[] args) 
	{
		
		WebDriver driver = DriverConn.getDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		
		String date = "11";
		
		while(!driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > thead > tr:nth-child(1) > th.datepicker-switch")).getText().contains("February 2022"))
		{
			driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > thead > tr:nth-child(1) > th.next")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));

		for(int i=0;i<dates.size();i++)
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			// System.out.println(text);
			
			if(text.equals(date))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
		
	}

}
