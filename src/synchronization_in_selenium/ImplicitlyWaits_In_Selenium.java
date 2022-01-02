package synchronization_in_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitlyWaits_In_Selenium {

	@Test
	public void waitsInSelenium() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.linkText("Sign Up")).click();

		driver.findElement(By.name("firstname")).sendKeys("Vasant");

		driver.findElement(By.name("lastname")).sendKeys("Chavan");

		driver.findElement(By.name("reg_email__")).sendKeys("Vasant@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Vasant@234%$");
		
		
		driver.close();

	}
}
