package testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertInTestNG {

	@Test
	public void hardAssert() {
		System.out.println("hardAssert()   ");
		Assert.assertTrue(true);
		System.out.println("statement after hardAssert() pass   ");
		
		Assert.assertTrue(false);
		System.out.println("statement after hardAssert() fail   ");
	}
	
	@Test
	public void softAssert() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert()   ");
		softAssert.assertTrue(true);
		System.out.println("statement after softAssert() pass   ");
		
		softAssert.assertTrue(false);
		System.out.println("statement after softAssert() fail   ");
		
		softAssert.assertAll();
	}
	
}
