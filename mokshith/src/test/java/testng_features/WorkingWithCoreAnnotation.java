package testng_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithCoreAnnotation {
	
	@Test
	public void TC1() {
		System.out.println("executing TC1");
	}
	@Test
	public void TC2() {
		System.out.println("executing TC2");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("executing before class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("executing after class");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("executing before suit");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("executing after suit");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("executing before test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("executing after test");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("executing before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("executing after method");
	}

}
