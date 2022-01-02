package testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuteFailedTestINTestNG {

	@Test
	public void test1() {
		System.out.println("test1()   ");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("test2()   ");
		Assert.assertTrue(false);
	}

	@Test
	public void test3() {
		System.out.println("test3()   ");
		Assert.assertTrue(true);
	}

	@Test
	public void test4() {
		System.out.println("test4()   ");
		Assert.assertTrue(false);
	}

}
