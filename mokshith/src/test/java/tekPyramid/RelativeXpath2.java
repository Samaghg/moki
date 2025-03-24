package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("computer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'Search')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gender-male' and @value='M']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'FirstN')]")).sendKeys("adssdss");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[9]/../../div[3]/input")).sendKeys("gabsc");
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
