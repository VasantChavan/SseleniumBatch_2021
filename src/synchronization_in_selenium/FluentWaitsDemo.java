package synchronization_in_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitsDemo {
	
	@Test
	public void fluentWaits() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);	
		
		
		String exp_text = "Selenium Tutorial - javatpoint";
				
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(10, TimeUnit.SECONDS)
		       .pollingEvery(1, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			   
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//h3[text()='Selenium Tutorial - javatpoint']"));
		     }
		   });

		   	if(element.isDisplayed()) {
		   		String ActualText = element.getText();
		   		if(ActualText.equals(exp_text)) {
		   			System.out.println(exp_text +":  matchhed with  :"+ ActualText);
		   		}
		   	}
		
		
		driver.quit();
	}

}
