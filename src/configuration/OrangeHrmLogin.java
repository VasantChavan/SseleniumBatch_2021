package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) throws Exception {

		File fs = new File("./Config/config.properties");
		FileInputStream fins = new FileInputStream(fs);
		Properties prop = new Properties();
		prop.load(fins);
		
		
		System.setProperty(prop.getProperty("driver_key"), prop.getProperty("driver_value"));
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

		driver.findElement(By.name("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("Submit")).click();
		
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
