package handleDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldeBootstrapDD1 {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/boottrap.html#");

		driver.findElement(By.xpath("//button[@type='button']")).click();

		// driver.findElement(By.xpath("//a[text()='Facebook']")).click();

		List<WebElement> dd_list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		handleBootstrap(dd_list,"Facebook");

		driver.quit();

	}
	
	public static void handleBootstrap(List<WebElement> ddList, String selectvalue) {

		for (WebElement ele : ddList) {
			if (ele.getText().equals(selectvalue)) {
				ele.click();
				break;
			}
		}

	}

}
