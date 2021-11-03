import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.DriverConn;

public class PracticeForm 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = DriverConn.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Sanket");
		driver.findElement(By.id("lastName")).sendKeys("Rajpara");
		driver.findElement(By.id("userEmail")).sendKeys("ABC@gmail.com");
		
		/*List<WebElement> gender = driver.findElements(By.name("gender"));
		
		gender.get(0).click();*/
		
		driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		
		// WebElement dob = driver.findElement(By.cssSelector("#dateOfBirthInput"));
		/*dob.clear();
		dob.sendKeys("11 Feb 1994");*/
		
		Actions builder = new Actions(driver);
		/*Action dobclick = builder.click(dob).doubleClick().sendKeys("11 Feb 1994").build();
		dobclick.perform();*/
		
		String y = "1994";
		String m = "February";
		String d = "11";
		
		
		
		WebElement bdate = driver.findElement(By.id("dateOfBirthInput"));
		bdate.clear();
		// bdate.click();
		
		
		
		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText(m);
		
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText(y);
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@role=\"option\"]"));
		
		for(int i=0;i<dates.size();i++)
		{
			String val = dates.get(i).getAttribute("aria-label");
			// System.out.println(val);
			if(val.contains(m))
			{
				String text = dates.get(i).getText();
				if(text.equals(d))
				{
					dates.get(i).click();
					break;
				}
			}
			
		}
		
		
		
		// driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)")).click();
		
		
		WebElement file = driver.findElement(By.id("uploadPicture"));
		file.sendKeys("C:\\Users\\srajpara2\\OneDrive - DXC Production\\Desktop\\FFS or MCO.xlsx");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Dallas, Texas");
		
		
		WebElement state = driver.findElement(By.cssSelector("#state > div"));
		
		Action st = builder.click(state).sendKeys("Haryana").sendKeys(Keys.ENTER).build();
		st.perform();
		
		
		WebElement city = driver.findElement(By.cssSelector("#city > div"));
		
		Action ci = builder.click(city).sendKeys("Panipat").sendKeys(Keys.ENTER).build();
		ci.perform();
		
		
		
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		System.out.println("Program Ended...");
		
	}

}
