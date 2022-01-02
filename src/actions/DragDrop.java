package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement capital_Washington = driver.findElement(By.id("box3"));
		WebElement country_UnitedStates = driver.findElement(By.id("box103"));

		Actions action = new Actions(driver);
		action.dragAndDrop(capital_Washington, country_UnitedStates).build().perform();

		driver.quit();

	}

}
