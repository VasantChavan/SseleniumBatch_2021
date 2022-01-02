package selenium_basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");

		String parent = driver.getWindowHandle();
		System.out.println("parent window id : " + parent);

		Set<String> windowIds = driver.getWindowHandles();
		Object[] arr = windowIds.toArray();

		driver.switchTo().window((String) arr[1]);

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(parent);

		driver.switchTo().window((String) arr[2]);

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.close();
		
		driver.switchTo().window(parent);
		
		driver.close();
//				
//		Iterator<String> itr = windowIds.iterator();
//		
//		while(itr.hasNext()) {
//			String childwondow = itr.next();
//			if(!parent.equals(childwondow)) {
//				driver.switchTo().window(childwondow);
//				driver.manage().window().maximize();
//				System.out.println(driver.getTitle());
//				driver.close();
//			}
//		}
//		
//		driver.switchTo().window(parent);
		driver.quit();
	}

}
