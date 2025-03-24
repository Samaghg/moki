package testng_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VotingTestCase {
	WebDriver driver;
	@Test(groups = "smoke 1")
	public void votingTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("application launched successfully");
		driver.findElement(By.id("pollanswers-2")).click();
		driver.findElement(By.id("vote-poll-1")).click();
		Reporter.log("voting test case completed");
		driver.close();
		
	}
	@Test
	public void LoginTest() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("123er6dtd@zxc.com");
		driver.close();
		
	}

}
