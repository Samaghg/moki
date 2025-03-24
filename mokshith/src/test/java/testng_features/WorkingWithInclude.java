package testng_features;

import org.testng.annotations.Test;

public class WorkingWithInclude {
	
		@Test
		public void LoginTest() {
			System.out.println("executing login test");
		}
		@Test
		public void RegisterTest() {
			System.out.println("executing register test");
		}
		@Test
		public void SearchTest() {
			System.out.println("executing search test");
		}
		@Test
		public void SubscribeTest() {
			System.out.println("executing subscribe test");
		}
		
}

