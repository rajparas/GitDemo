import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Open Chrome:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srajpara2\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open Firefox:
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\srajpara2\\Desktop\\Selenium\\Drivers\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\srajpara2\\Desktop\\Selenium\\Drivers\\IEDriverServer.exe");
		 WebDriver driver = new InternetExplorerDriver();*/
		
		// driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
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
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		
		pass.sendKeys("Test1234");
		
		
	}

}
