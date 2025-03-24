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

public class WorkingWithScreenshotElement {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchTxt = driver.findElement(By.xpath("//input[@name='q']"));
		searchTxt.sendKeys("desktop");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = searchTxt.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/searchtextelement.png");
		FileHandler.copy(src, dest);
		WebElement searcButton = driver.findElement(By.xpath("//input[@type='submit']"));
		File scr = searcButton.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./screenshots/searchbutton.png");
		FileHandler.copy(scr, dest1);
		driver.close();
		
	}

}
