package tekPyramid;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Set<String> childWindows = driver.getWindowHandles();
		for(String window:childWindows) {
			driver.switchTo().window(window);
			Thread.sleep(3000);
			if(driver.getTitle().contains("Facebook")) {
				driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("m@123.cpm");
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.name("q")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.quit();
	}

}
