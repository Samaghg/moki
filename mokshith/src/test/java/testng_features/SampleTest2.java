package testng_features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest2 {
	@Test
	public void Demo() {
		System.out.println("executing demo test case");
	}
	@Test
	public void RegisterTest() {
		System.out.println("executing register test case");
	}
	@Test
	public void LoginTest() {
		System.out.println("executing login test case");
	}
	@Test
	public void SearchTest() {
		System.out.println("executing search test case");
	}

}
