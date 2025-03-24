package tekPyramid;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithIframe {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/iframe.html");
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("desktop");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("mokshith");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		driver.findElement(By.xpath("//input[@name='q']")).clear();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println("parent");
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.tagName("a"))).perform();
		action.sendKeys(Keys.ARROW_DOWN).click().perform();
		Thread.sleep(2000);
		//driver.close();
		
		
	}

}
