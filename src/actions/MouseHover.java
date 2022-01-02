package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebElement menu_admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement userManagement = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement viewSystemUsers = driver.findElement(By.id("menu_admin_viewSystemUsers"));

		Actions action = new Actions(driver);

		action.moveToElement(menu_admin).
		moveToElement(userManagement).
		moveToElement(viewSystemUsers).
		click().build().perform();

	}
}
