package tekPyramid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select objsel=new Select(sort_by);
		objsel.selectByVisibleText("Price: High to Low");
		
		//
		WebElement pagesize = driver.findElement(By.name("products-pagesize"));
		Select objsel1=new Select(pagesize);
		System.out.println(objsel1.isMultiple());
		//objsel1.selectByVisibleText("12");
		List<WebElement> selectedOption = objsel1.getOptions();
		for(WebElement element:selectedOption) {
			System.out.println(element.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
