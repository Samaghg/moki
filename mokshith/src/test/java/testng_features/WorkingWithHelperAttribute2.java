package testng_features;

import org.testng.annotations.Test;

public class WorkingWithHelperAttribute2 {
	@Test(dependsOnMethods = "RegisterTest")
	public void LoginTest() {
		System.out.println("executing login test case");
	}
	@Test
	public void SearchTest() {
		System.out.println("executing search test case");
	}
	@Test
	public void RegisterTest() {
		System.out.println("executing register test case");
	}
	@Test(dependsOnMethods = "SearchTest")
	public void SubscribeTest() {
		System.out.println("executing subscribe test case");
	}

}
