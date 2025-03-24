package tekPyramid;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenshotPage {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		TakesScreenshot ts = (TakesScreenshot)driver;
		driver.get("https://demowebshop.tricentis.com/");
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/page/homepage.png");
		FileHandler.copy(src, dest);
		System.out.println("home page launched successfully");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@name='q']")).submit();
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./screenshots/page/searchpage.png");
		FileHandler.copy(scr, dest1);
		driver.quit();
	}

}
