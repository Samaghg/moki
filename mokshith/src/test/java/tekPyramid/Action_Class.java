package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement computer = driver.findElement(By.partialLinkText("Computers"));
		action.moveToElement(computer).perform();
		Thread.sleep(2000);
		
		//WebElement desktop = driver.findElement(By.xpath("(//a[contains(text(),'Desktop')])[1]"));
		//action.moveToElement(desktop).click().build().perform();
		//Thread.sleep(2000);
	
		Thread.sleep(2000);
		driver.close();
	}

}
