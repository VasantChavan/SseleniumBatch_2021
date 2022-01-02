package switchTo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldeFrames2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		List<WebElement> iframes = driver.findElements(By.tagName("frame"));
		System.out.println("Total number of iframes : " + iframes.size());

		driver.switchTo().frame("frame-top");		

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-bottom");
	

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-top").switchTo().frame("frame-left");

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-top").switchTo().frame("frame-right");

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().defaultContent();

		driver.quit();

	}
}
