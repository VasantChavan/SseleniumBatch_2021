package handleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.linkText("Sign Up")).click();

		WebElement dob_dd = driver.findElement(By.name("birthday_day"));
		WebElement dom_dd = driver.findElement(By.name("birthday_month"));
		WebElement doy_dd = driver.findElement(By.name("birthday_year"));
		// We select drop down value by using three ways

		Select sel_dob = new Select(dob_dd);
		sel_dob.selectByIndex(25); // selectByIndex
		sel_dob.selectByValue("16"); // selectByValue
		sel_dob.selectByVisibleText("22"); // selectByVisibleText

		Select sel_dom = new Select(dom_dd);
		Select sel_doy = new Select(doy_dd);

		sel_dob.selectByIndex(20); // it will select day of birth
		sel_dom.selectByVisibleText("Apr"); // it will select birth month
		sel_doy.selectByValue("1994"); // It will select birth year

		driver.quit();
	}

}
