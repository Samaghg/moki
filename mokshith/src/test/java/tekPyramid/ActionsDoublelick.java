package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoublelick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement rightlick = driver.findElement(By.xpath("//span[contains(text(),'right click')]"));
		action.contextClick(rightlick).build().perform();
		driver.quit();
	}

}
