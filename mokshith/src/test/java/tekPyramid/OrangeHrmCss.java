package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmCss {
	public static void main(String[] args) throws InterruptedException {
		String expectedURL="dashboard";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String acualURL=driver.getCurrentUrl();
		if(acualURL.contains(expectedURL)) {
			System.out.println("dashboard page displayed");
		}else {
			System.out.println("dasboard page is not displayed");
		}
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
}
