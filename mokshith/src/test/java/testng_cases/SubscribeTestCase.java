package testng_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubscribeTestCase {
	@Test
	public void subscribeTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("application launched successfully");
		driver.findElement(By.id("newsletter-email")).sendKeys("123asdh@123.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		Reporter.log("subscribe test case completed");
		driver.close();
		
		
	}

}
