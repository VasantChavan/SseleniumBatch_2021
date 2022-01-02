package testNGFramework;

import org.testng.annotations.Test;

public class DependsOnTestInTestNG {

	@Test
	public void loginTest() {
		System.out.println("login Test");
	}

	@Test(dependsOnMethods = {"loginTest"})
	public void createAccoutTest() {
		System.out.println("createAccoutTest");
	}

	@Test(dependsOnMethods = {"loginTest","createAccoutTest"})
	public void logoutTest() {
		System.out.println("logoutTest");
	}

}
