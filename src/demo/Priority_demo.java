package demo;

import org.testng.annotations.Test;

public class Priority_demo {
	@Test(priority=3)
	public void testcase1() {
		System.out.println("test case 1 executed");
	}
	@Test(priority=2)
	public void testcase3() {
		System.out.println("test case 3 executed");
	}
	@Test(priority=3)
	public void testcase2() {
		System.out.println("test case 2 executed");
	}
	@Test(priority=1)
	public void testcase4() {
		System.out.println("test case 4 executed");
	}
}
