package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnBasedOnCompleteXpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// Locate WebElement Based on complete xpath
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/"
				+ "div[3]/div[2]/div[2]/form[1]/div[2]/input[1]")).sendKeys("Admin");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/"
				+ "div[3]/div[2]/div[2]/form[1]/div[3]/input[1]")).sendKeys("admin123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/"
				+ "div[2]/div[2]/form[1]/div[5]/input[1]")).click();
				
		driver.quit();
		
	}

}
