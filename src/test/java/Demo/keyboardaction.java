package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class keyboardaction {
	WebDriver driver;
	

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	}
	@Test(enabled=true,priority = 0)
	public void testcase1() throws InterruptedException
	{
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
  //Thread.sleep(5000);
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	@Test(enabled=true,priority = 1)
	public void testcase2() throws InterruptedException
	{
	     	driver.findElement(By.xpath("//*[text()='Admin']")).click();
	     	Actions act = new Actions(driver);
	     	WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
	     	act.click(ele).build().perform();
	     	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
	     	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
	     	act.sendKeys(ele,Keys.ENTER).click().build().perform();
}
}