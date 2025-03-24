package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("text-box")).sendKeys("Mokshith");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("narekodi");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("Mokshith123@test12.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("12345678");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.name("register-button")).click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
