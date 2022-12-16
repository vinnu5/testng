package Demo;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class newwind {
String orl ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 
String yrl ="https://www.youtube.com";
WebDriver driver;

	
@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	
	driver.get(orl);
	driver.manage().window().maximize();
	Thread.sleep(3000);}
	
@Test

	public void newwindow () throws InterruptedException{
	driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to(yrl);
	}
}
