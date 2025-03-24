package tekPyramid;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='name']"))));
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//section[text()='Dropdown']"))).click().perform();
		WebElement countrycode = driver.findElement(By.id("select1"));
		Select objsel=new Select(countrycode);
		objsel.selectByValue("+91");
		WebElement gender = driver.findElement(By.id("select2"));
		Select gensel=new Select(gender);
		List<WebElement> allgen = gensel.getOptions();
		for(WebElement gen:allgen) {
			System.out.println(gen.getText());
		}
		int countofoptions=allgen.size();
		System.out.println(countofoptions);
		action.moveToElement(driver.findElement(By.id("select3"))).click().perform();
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();
		
		

		
		
		driver.quit();
		
	}

}
