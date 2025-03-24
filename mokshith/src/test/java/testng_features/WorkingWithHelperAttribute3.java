package testng_features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithHelperAttribute3 {
	@Test(invocationCount = 3,threadPoolSize =1 )
	public void TC1() {
		//System.out.println("Invocation");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.name("q")).submit();
		driver.quit();
	}
	

}
