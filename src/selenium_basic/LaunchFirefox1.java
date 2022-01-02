package selenium_basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\Desktop\\Selenium_Batch_Sep_25\\Drivers\\geckodriver.exe");
		// It will launch Firefox Browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
	}
}
