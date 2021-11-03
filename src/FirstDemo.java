import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srajpara2\\OneDrive - DXC Production\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement account = driver.findElement(By.linkText("Create New Account"));
		
		account.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("Tops");
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("Technology");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("Tops123@gmail.com");
		
		WebElement confirm = driver.findElement(By.name("reg_email_confirmation__"));
		confirm.sendKeys("Tops123@gmail.com");
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("Test1234");
		
		Select mm = new Select(driver.findElement(By.id("month")));
		
		mm.selectByIndex(5);
		
		Select dd = new Select(driver.findElement(By.name("birthday_day")));
		dd.selectByValue("11");
		
		Select yy = new Select(driver.findElement(By.name("birthday_year")));
		yy.selectByVisibleText("1994");
		
		
		List<WebElement> gender =	driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		
		
		
		
		// driver.close();
	
		// driver.quit();
		
		
		
	}

}
