package selenium_basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {

		// It will launch Firefox Browser
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.quit();
	}
}
//Exception in thread "main" java.lang.IllegalStateException: