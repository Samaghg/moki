package tekPyramid;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithScreenshotElement2 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.co.in/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ssc = ts.getScreenshotAs(OutputType.FILE);
		File destin=new File("./screenshots/google.jpg");
		FileHandler.copy(ssc, destin);
		WebElement searchtxt = driver.findElement(By.className("gLFyf"));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
		searchtxt.sendKeys("mokshith");
		WebElement searchfield = driver.findElement(By.className("SDkEP"));
		
		
		File src = searchfield.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/searchtextfield1.png");
		FileHandler.copy(src, dest);
		driver.quit();
		
	}

}
