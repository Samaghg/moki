package testng_features;

import org.testng.annotations.Test;

public class WorkingWithHelperAttribute {
	@Test(priority = 2)
	public void LoginTest() {
		System.out.println("executing login test case");
	}
	@Test(priority = 3)
	public void SearchTest() {
		System.out.println("executing search test case");
	}
	@Test(priority = 1)
	public void RegisterTest() {
		System.out.println("executing register test case");
	}
	@Test(priority = 4)
	public void SubscribeTest() {
		System.out.println("executing subscribe test case");
	}
	
}
