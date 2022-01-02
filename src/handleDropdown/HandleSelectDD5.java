package handleDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSelectDD5 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		String month_dd ="//select[@name='birthday_month']/option";
		String day_dd ="//select[@name='birthday_day']/option";
		String year_dd ="//select[@name='birthday_year']/option";
		
		selectDropdown(driver,month_dd,"Apr");
		selectDropdown(driver,day_dd,"22");
		selectDropdown(driver, year_dd, "1981");
		
		driver.quit();
	}
	
	public static void selectDropdown(WebDriver driver, String xpath, String selectvalue) {
		
		List<WebElement> dd_list = driver.findElements(By.xpath(xpath));
		for (WebElement ele : dd_list) {
			String month = ele.getText();
			if(month.equals(selectvalue)) {
				ele.click();
				break;
			}
		}
		
	}

}
