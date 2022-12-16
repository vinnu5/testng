package Demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;   
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse {
WebDriver driver;

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
     
     	Thread.sleep(2000);
     	WebElement ele1 = driver.findElement(By.xpath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
     	Actions action = new Actions(driver);
    	Thread.sleep(3000);
    	
     	action.moveToElement(ele1).click().build().perform();
     	
     	
     	//Es.click();
     	//driver.quit();
     	
}
}