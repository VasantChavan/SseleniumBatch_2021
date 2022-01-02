package testNGFramework;

import org.testng.annotations.Test;

public class GroupsInTestNGTest {
	
	@Test(groups = {"smoke"} )
	public void loginTest() {
		System.out.println("Smoke Test group");
	}
	@Test(groups = {"regression"} )
	public void register() {
		System.out.println("regression Test group");
	}
	@Test(groups = {"sanity"} )
	public void createAaccout() {
		System.out.println("sanity Test group");
	}
}
