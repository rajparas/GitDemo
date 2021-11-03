import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class Expedia {

	public static void main(String[] args) 
	
	{
		WebDriver driver = DriverConn.getDriver();
		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div[2]/div/div/ul/li[2]/a/span")).click();
		
		Actions builder = new Actions(driver);
		
		/*WebElement fr = driver.findElement(By.xpath("//input[@id='location-field-leg1-origin']"));
		Action from = builder.click(fr).sendKeys("EWR").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		from.perform();
		*/
		
		
		/*WebElement to = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]"));
		Action t = builder.click(to).sendKeys(to, "Amd").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		t.perform();*/
		
		driver.findElement(By.linkText("1 traveler")).click();
		
		
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/section/div[1]/div[1]/div/button[2]")).click();
		}
		
		driver.findElement(By.linkText("Economy")).click();
		driver.findElement(By.linkText("Business class")).click();
		
		
		WebElement oneway = driver.findElement(By.linkText("One-way"));
		oneway.click();
		
		
		driver.findElement(By.id("d1-btn")).click();;
		
		// List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-oneway\"]/button"));
		List<WebElement> dates = driver.findElements(By.xpath("//*[@class=\"uitk-date-picker-day-number\"]/button"));
		
		System.out.println("Size of dates:"+dates.size());
		
		
		
		for(int i=0;i<dates.size();i++)
		{
			String dt = dates.get(i).getAttribute("data-day");
			String lb = dates.get(i).getAttribute("aria-label");
			System.out.println(lb);
			
			if(lb.contains("Dec"))
			{
				if(dt.equals("25"))
				{
					dates.get(i).click();
					
				}
			}
			
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-oneway\"]/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();
		
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		System.out.println("Operation Completed...");
		

	}

}
