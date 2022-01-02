package handleDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSelectDD6 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		
		List<WebElement> dd_list = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for (WebElement ele : dd_list) {
			if(ele.getText().equals("Apr")) {
				ele.click();
				break;
			}
		}
		
		driver.quit();
	}

}
