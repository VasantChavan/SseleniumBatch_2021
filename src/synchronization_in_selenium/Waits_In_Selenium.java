package synchronization_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Waits_In_Selenium {

	@Test
	public void waitsInSelenium() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.facebook.com/");		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);		// it will wait for 2 second 
		driver.findElement(By.linkText("Sign Up")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Vasant");
		
		Thread.sleep(6000);
		driver.findElement(By.name("lastname")).sendKeys("Chavan");
		
		Thread.sleep(4000);
		driver.findElement(By.name("reg_email__")).sendKeys("Vasant@gmail.com");
		Thread.sleep(8000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Vasant@234%$");
		
		Thread.sleep(10000);
				
		driver.quit();
	
	}
}
