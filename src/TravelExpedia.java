import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class TravelExpedia {

	public static void main(String[] args) 
	{
		WebDriver driver = DriverConn.getDriver();
		
		System.out.println("Hello");
		
		driver.get("https://www.expedia.com/");
		
		driver.findElement(By.xpath("//ul[@role='tablist']/li[2]")).click();
		driver.findElement(By.linkText("1 traveler")).click();
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.xpath("//label[@for=\"adult-input-0\"] /following-sibling::div/button[2]")).click();
		}
		
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div[2]/button")).click();
		driver.findElement(By.linkText("Economy")).click();
		driver.findElement(By.linkText("Business class")).click();
		
		
		driver.findElement(By.linkText("One-way")).click();
		
		
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//*[@aria-label=\"Leaving from\"]"));
		builder.click(from).sendKeys("c").build().perform();
		List<WebElement> fCity = driver.findElements(By.cssSelector("[class=\"truncate\"]"));
		System.out.println("t : " + fCity.size());
		for (WebElement city : fCity) {
			System.out.println(city.getAttribute("class"));
		}
		 
	
		driver.findElement(By.className("Dates")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//*[@class=\"uitk-date-picker-day-number\"]/button"));
		System.out.println(dates.size());
		for(int i=0;i<dates.size();i++)
		{
			String dt = dates.get(i).getAttribute("data-day");
			String lb = dates.get(i).getAttribute("aria-label");
			System.out.println(lb);
			if(lb.contains("Nov"))
			{
				if(dt.equals("29"))
				{
					
					dates.get(i).click();
				}
			}
			
		}
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-oneway\"]/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();
		
		
		
		

	}

}
