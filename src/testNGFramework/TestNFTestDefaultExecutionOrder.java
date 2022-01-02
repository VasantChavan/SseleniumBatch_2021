package testNGFramework;

import org.testng.annotations.Test;

public class TestNFTestDefaultExecutionOrder {

	@Test
	public void loginTest() {
		System.out.println("login Test");
	}

	@Test
	public void createAccoutTest() {
		System.out.println("createAccoutTest");
	}

	@Test
	public void updateAccoutTest() {
		System.out.println("updateAccoutTest");
	}

	@Test
	public void logoutTest() {
		System.out.println("logoutTest");
	}

}
