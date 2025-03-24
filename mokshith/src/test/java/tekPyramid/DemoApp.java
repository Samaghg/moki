package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp {
	public static void main(String[] args) throws InterruptedException {
		String expectedUrl="https://demoapps.qspiders.com/ui?scenario=1";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("mokshith");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mokshith@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mokshith@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("mokshith@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("mokshith@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register Now")).click();
		Thread.sleep(2000);
		String acualURL=driver.getCurrentUrl();
		if(acualURL.equals(expectedUrl)) {
			System.out.println("register page displayed");
		}else {
			System.out.println("register page is not displayed");
		}
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
