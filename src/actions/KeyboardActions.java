package actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Actions action = new Actions(driver);
		// action.sendKeys(Keys.ENTER).perform();
		// action.sendKeys(Keys.TAB).perform();
		// action.sendKeys("vasant@gmail.com").sendKeys(Keys.TAB).build().perform();

		action.sendKeys("Vasant@gmail.com").pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
				.sendKeys("Vasant@123").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();

	}

}
