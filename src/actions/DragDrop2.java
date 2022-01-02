package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement capital_Washington = driver.findElement(By.id("box3"));
		WebElement country_UnitedStates = driver.findElement(By.id("box103"));
				
		WebElement capital_Rome = driver.findElement(By.id("box6"));
		WebElement country_Italy = driver.findElement(By.id("box106"));
		
		WebElement capital_Madrid = driver.findElement(By.id("box7"));
		WebElement country_Spain = driver.findElement(By.id("box107"));
		
		
		DragDrop2.dragDropActions(capital_Washington, country_UnitedStates, driver);
		DragDrop2.dragDropActions(capital_Rome, country_Italy, driver);
		DragDrop2.dragDropActions(capital_Madrid, country_Spain, driver);
		
		driver.quit();
		

	}
	
	
	public static void dragDropActions(WebElement source, WebElement target, WebDriver driver) {
		new Actions(driver).dragAndDrop(source, target).build().perform();
	}

}
