package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithShadowRoot {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow')])[2]")).click();
		
		SearchContext shadowhost = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadowhost.findElement(By.cssSelector("input[type='text']")).sendKeys("abcd");
	
		SearchContext shadowhost2 = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		shadowhost2.findElement(By.cssSelector("input[input='text']")).sendKeys("sdfg");
		
		
	}

}
