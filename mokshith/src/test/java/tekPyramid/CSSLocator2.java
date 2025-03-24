package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("mobiles");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
