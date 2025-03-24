package testng_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchTestCase {
	@Test(groups = "smoke 1")
	public void searchTestCase() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("application launched successfully");
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.name("q")).submit();
		Reporter.log("search test case completed");
		driver.close();
	}

}
