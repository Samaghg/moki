package tekPyramid;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_findElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		int count=0;
		for(int i=0;i<links.size();i++) {
			//System.out.println(links.get(i).getText());
			count++;
		}
		System.out.println("========");
		Thread.sleep(2000);
		System.out.println("========");
		System.out.println(count);
		for(WebElement element: links) {
			String url = element.getAttribute("href");
			//System.out.println(url);
		}
		System.out.println("=========");
		Thread.sleep(2000);
		List<WebElement> textField = driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement element:textField) {
			element.sendKeys("mokshith");
		}
		List<WebElement> radio_button = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement element:radio_button) {
			if(element.isEnabled()) {
				System.out.println("radio button enabled");
				element.click();
				System.out.println(element.isSelected());
					
				}
			}
		List<WebElement> button = driver.findElements(By.xpath("//input[@type='button']"));
		
		for(WebElement element:button) {
			System.out.println(element.isDisplayed());
		}
		System.out.println("no of buttons "+button.size());
		Thread.sleep(2000);
		driver.quit();
	}

}
