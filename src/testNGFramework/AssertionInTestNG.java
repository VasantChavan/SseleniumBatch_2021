package testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {
	
	@Test
	public void test1() {
		System.out.println("test1() ");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		System.out.println("test2() ");
		Assert.assertTrue(false, "Expecting true but gets false condition");
	}
	
	@Test
	public void test3() {
		System.out.println("test3() ");
		String s1 ="Vasant";
		String s2 = "vasant";
		Assert.assertEquals(s1,s2,"s1 and s2 are not matching "); // fail
	}
	
	@Test
	public void test4() {
		System.out.println("test3() ");
		String s1 ="Vasant";
		String s2 = "Vasant";
		Assert.assertEquals(s1,s2); // pass
	}
	
	@Test
	public void test5() {
		System.out.println("test5() ");
		Assert.assertFalse(true," Expecting false condition but gets true");
	}
	
	@Test
	public void test6() {
		System.out.println("test6() ");
		Assert.assertFalse(false, "Expecting true but gets false condition");
	}

}
