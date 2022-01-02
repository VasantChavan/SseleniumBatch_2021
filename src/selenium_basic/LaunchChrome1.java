package selenium_basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome1 {

	public static void main(String[] args) {
		// Set environment path for chrome driver exe 
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Batch_Sep_25\\Drivers\\chromedriver.exe");
		// it will launch Chrome browser
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com");
		
	}
}
 