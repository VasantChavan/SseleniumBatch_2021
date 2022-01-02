package locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnTagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement language = driver.findElement(By.partialLinkText("UK"));
		language.click();
				
		List<WebElement> list_a = driver.findElements(By.tagName("a"));
		int totalLink = list_a.size();
		System.out.println("Total Num of Links On Facebook login page are : "+ totalLink);
	// By using for loop	
		
//		for(int i =0; i< totalLink ;i++) {
//			String linkText =list_a.get(i).getText();
//			System.out.println("LinkText for the link is : "+ linkText);
//			if(linkText.equals("Developers")) {
//				list_a.get(i).click();
//				break;
//			}
//		}
					
		// by using for each loop
//		for (WebElement ele : list_a) {
//			
//			String linkText =ele.getText();
//			System.out.println(linkText);
//			if(linkText.equals("Sign Up")) {
//				ele.click();
//				break;
//			}
//		}
		
		// By using Iterator		
		
		Iterator<WebElement> itr = list_a.iterator();
		
		while(itr.hasNext()) {
			WebElement ele = itr.next();
			String linkText = ele.getText();
			System.out.println(linkText);
			if(linkText.equals("Cookies")) {
				ele.click();
				break;
			}
		}
		
	}

}
