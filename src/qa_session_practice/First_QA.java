package qa_session_practice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class First_QA {

	static WebDriver driver ; // null
	
	public static void main(String[] args) throws IOException {
		 
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com/");
	
	
//	driver = new FirefoxDriver();
//	driver = new InternetExplorerDriver();
//	driver = new EdgeDriver();
//	driver = new OperaDriver();
//	driver = new SafariDriver();
	
//	WebElement ele = driver.findElement(By.linkText(""));
//	List<WebElement> ele1 = driver.findElements(By.linkText(""));
	
//	String parent_window_id = driver.getWindowHandle();	
//	Set<String> window_ids = driver.getWindowHandles();
	
//	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
//	File dest = new File("./Screenshot/image.png");
	
//	FileUtils.copyFile(scrFile, dest);
	

	Actions actions = new Actions(driver);
	
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	alert.dismiss();
	alert.getText();
	
	alert.sendKeys("Type Text");
	
	
	driver.switchTo().window("");
	driver.switchTo().frame(0);
	
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	driver.quit();

	}
}
