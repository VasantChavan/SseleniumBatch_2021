package testNGFramework;

import org.testng.annotations.Test;

public class DisabledTestInTestNG {

	@Test(enabled = true) // it is optional to use
	public void test1() {
		System.out.println("test1() ");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("test2() ");
	}

	@Test
	public void test3() {
		System.out.println("test3() ");
	}

}
