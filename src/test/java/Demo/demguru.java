package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demguru {
	WebDriver driver;

	@BeforeTest
	public void bt() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	@Test
	public void testcase1() throws InterruptedException {
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("user");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("user");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		Thread.sleep(2000);
		
	}
	@Test
	public void testcase2() throws InterruptedException{
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Guru");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("zee");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("984868092");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("gurusuru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Guru");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("deva");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("deva");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name ='userName']")).sendKeys("Guru");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("deva");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	Thread.sleep(5000);
		}
	
	@AfterTest
	public void at()throws InterruptedException{ {
		
		String UrL= driver.getCurrentUrl();
		driver.quit();
		System.out.println(UrL);
		

}
	}
}