package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class delete {
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
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
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(10).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class = 'oxd-icon bi-check oxd-checkbox-input-icon']")).get(10).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(10).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin')]")).click();
		Thread.sleep(2000);
		driver.quit();
	
	}
	@AfterTest(enabled=false)
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//i[contains(@class,'oxd-icon bi-caret-down-fill')])[1]")).click();
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		//driver.findElement(By.linkText("Logout")).click();
		

		
	}
}
