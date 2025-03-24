package tekPyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithImplicitWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		WebElement searchText = driver.findElement(By.name("q"));
		action.moveToElement(searchText).click().sendKeys("compu").perform();
		
		action.moveToElement(driver.findElement(By.id("ui-id-5"))).click().perform();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("bata");
		
		driver.findElement(By.xpath("(//span[text()='bata'])[2]")).click();
		
		driver.quit();
	}

}
