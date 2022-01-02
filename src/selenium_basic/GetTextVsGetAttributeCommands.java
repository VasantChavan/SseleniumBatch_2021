package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttributeCommands {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("UK")).click();
		
		String email_textBox_ev ="Email address or phone number";
		String pass_txtbox_ev ="Password";
		
		String email_textBox_av = driver.findElement(By.name("email")).getAttribute("aria-label");
		System.out.println(email_textBox_av);
		
		if(email_textBox_av.equals(email_textBox_ev)) {
			System.out.println("Area label for email text box is verified");
		}
		else {
			System.out.println("Area label for email text box is not matched");
		}
		
		String pass_txtbox_av = driver.findElement(By.name("pass")).getAttribute("aria-label");
		System.out.println(pass_txtbox_av);
		
		if(pass_txtbox_av.equals(pass_txtbox_ev)) {
			System.out.println("Area label for Password text box is verified");
		}
		else {
			System.out.println("Area label for Password text box is not matched");
		}
		
		String actualText = driver.findElement(By.xpath("//input[@id='email']")).getText();
		System.out.println(actualText);
		
		String actualText1 = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("innerHHTML");
		System.out.println(actualText1);
		
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		String actualText2 = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		
		if(expectedText.equals(actualText2)) {
			System.out.println("On Login Page expected Text is verified...");
		}
		else {
			System.out.println("On Login Page expected Text is not matched with actual Text...");
		}
		
		String actualText3 = driver.findElement(By.xpath("//h2[@class='_8eso']")).getAttribute("innerHTML");
		
		if(actualText3.equals(expectedText)) {
			System.out.println("On Login Page expected Text is verified...");
		}
		else {
			System.out.println("On Login Page expected Text is not matched with actual Text...");
		}
				
		driver.quit();
		
	}
}
