package Demo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class printing_selected_list {

	
	public class bt {
		WebDriver driver;
		@BeforeTest
		public void beforetest() throws InterruptedException{
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
		@Test
		public void testcase1() throws InterruptedException {
			//WebDriver driver = new ChromeDriver();
		
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(3000);
		}
		@Test
		public void testcase2() throws InterruptedException {
			driver.findElement(By.linkText("Admin")).click();
			 List<WebElement> PT=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
			  System.out.println(PT.size());
			driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[@class = 'oxd-icon bi-check oxd-checkbox-input-icon']")).get(3).click();
			Thread.sleep(5000);
		    System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).getText());
		    driver.quit();
		
		}
	
}

}
