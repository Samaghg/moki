package testng_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	WebDriver driver;
	@BeforeMethod
	public void launchapplication() {
		//launch application code
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("execution of before test");
		
	}
	@AfterMethod
	public void closeapplication() {
		//code to close the application
		driver.quit();
		System.out.println("execution of after test");
	}
	@Test(invocationCount = 2)
	public void searchtestcase() {
		//search application code
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.name("q")).submit();
		System.out.println("execution of search test");
	}
	@Test
	public void logintest() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("123er6dtd@zxc.com");
		System.out.println("execution of login test");
	}

}
