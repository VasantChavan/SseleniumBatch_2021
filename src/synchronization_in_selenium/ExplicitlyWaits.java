package synchronization_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlyWaits {

	@Test
	public void waitsInSelenium() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();

		WebDriverWait waits = new WebDriverWait(driver, 10);
		

		waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign Up")))).click();
		waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("firstname")))).sendKeys("Vasant");

		WebElement ele = waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("lastname"))));
		ele.sendKeys("Chavan");

		driver.close();

	}
}
