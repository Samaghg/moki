package tekPyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WorkingWithFluentWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchTxt = driver.findElement(By.xpath("//input[@name='q']"));
		
		FluentWait wait = new FluentWait(driver);
		
		wait.pollingEvery(Duration.ofSeconds(1));
		
		wait.withTimeout(Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(searchTxt));
		
		searchTxt.sendKeys("desktop");
		searchTxt.submit();
		WebElement searchpage = driver.findElement(By.xpath("//h1"));
		
		wait.pollingEvery(Duration.ofSeconds(1));
		
		wait.withTimeout(Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(searchpage));
		
		driver.close();
		
	}

}

