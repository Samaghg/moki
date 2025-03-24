package tekPyramid;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mock1 {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shine.com/");
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		if(driver.getTitle().contains("Register")) {
			System.out.println("registration page displayed");
		}
		else {
			System.out.println("registration page failed to display");
			driver.quit();
		}
		driver.findElement(By.id("id_name")).sendKeys("mokshith");
		driver.findElement(By.id("id_email")).sendKeys("moka@gmail.com");
		driver.findElement(By.id("id_cell_phone")).sendKeys("9879879870");
		driver.findElement(By.xpath("//input[@type='Password']")).clear();
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Mokiii@1234");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		System.out.println(driver.getTitle().contains("Login")?"Login page loaded successfully":"login page failed to load");
		driver.findElement(By.id("id_email_login")).sendKeys("moka@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Mokiii@1234");
		driver.findElement(By.xpath("(//button[contains(text(),'Login')])[1]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
		Thread.sleep(3000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		//driver.quit();
	}

}
