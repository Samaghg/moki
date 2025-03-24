package testng_features;

import org.testng.annotations.Test;

public class WorkingWithGroups1 {
	@Test(groups = "smoketest")
	public void AddToCartTest() {
		System.out.println("executing Add To Cart test");
	}
	@Test(groups = "smoketest")
	public void SubscribeTest() {
		System.out.println("executing subscribe test");
	}
	@Test
	public void VoteTest() {
		System.out.println("executing vote test");
	}
	
}
