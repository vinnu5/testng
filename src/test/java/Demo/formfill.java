package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formfill {
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
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]")).sendKeys("George");
		Actions act = new Actions(driver);
     	WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
     	act.click(ele).build().perform();
     	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
     	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
     	act.sendKeys(ele,Keys.ENTER).click().build().perform();
     	driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("George bush");
     	WebElement st = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[2]"));
     	act.click(st).build().perform();
     	//act.sendKeys(st,Keys.ARROW_DOWN).click().build().perform();
     	act.sendKeys(st,Keys.ARROW_DOWN).click().build().perform();
     	act.sendKeys(st,Keys.ENTER).click().build().perform(); 
     	Thread.sleep(2000);
     	WebElement S = driver.findElement(By.xpath("//button[text()=' Search ']"));
		act.moveToElement(S).doubleClick().build().perform();
    	Thread.sleep(3000);
     
     	System.out.println(driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]")).getText());
	}
}