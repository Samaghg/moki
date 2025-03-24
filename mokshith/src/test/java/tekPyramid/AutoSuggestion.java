package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement searchText = driver.findElement(By.name("q"));
		action.moveToElement(searchText).click().sendKeys("compu").perform();
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.id("ui-id-5"))).click().perform();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("bata");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='bata'])[2]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
