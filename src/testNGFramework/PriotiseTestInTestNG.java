package testNGFramework;

import org.testng.annotations.Test;

public class PriotiseTestInTestNG {

	@Test(priority  =1)
	public void loginTest() {
		System.out.println("login Test");
	}
	
	@Test(priority  =2)
	public void createAccoutTest() {
		System.out.println("createAccoutTest");
	}

	@Test(priority  =3)
	public void updateAccoutTest() {
		System.out.println("updateAccoutTest");
	}

	@Test(priority  =4)
	public void logoutTest() {
		System.out.println("logoutTest");
	}
}
