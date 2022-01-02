package hanldeAuthiWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthi {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		// syntax:
		// https://username:password@url
		// https://admin:admin@the-internet.herokuapp.com/basic_auth

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String authText = driver.findElement(By.xpath("//div[@id='content']/div/p")).getText();
		System.out.println(authText);

	}

}
