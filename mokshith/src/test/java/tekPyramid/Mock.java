package tekPyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mock {
	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shine.com/");
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		driver.findElement(By.id("id_name")).sendKeys("mokshith");
		driver.findElement(By.id("id_email")).sendKeys("moka@gmail.com");
		driver.findElement(By.id("id_cell_phone")).sendKeys("9879879870");
		driver.findElement(By.xpath("//input[@type='Password']")).clear();
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Mokiii@1234");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.id("id_gender_1")).click();
		driver.findElement(By.name("Bangalore")).click();
		driver.findElement(By.xpath("(//button)[1]")).click();
		driver.findElement(By.id("id_experience_fresher")).click();
		driver.findElement(By.xpath("//a[contains(text(),'B.Tech')]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Marine')]")).click();
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.id("id_institute")).sendKeys("qspider hebbal");
		driver.findElement(By.id("id_institute")).sendKeys(Keys.ENTER);
		//Actions action=new Actions(driver);
		driver.findElement(By.id("id_institute_year")).click();
		//action.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'2021')])"))).click();
		Thread.sleep(4000);
		driver.findElement(By.id("id_course_type_1")).click();
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marine')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hindi')]")).click();
		driver.findElement(By.xpath("//button")).click();
		driver.navigate().to("https://www.shine.com/");
		//driver.findElement(by.)
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
		
		
		
		
		
		
		
	}

}
