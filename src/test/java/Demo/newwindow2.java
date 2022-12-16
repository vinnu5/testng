package Demo;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;

public class newwindow2 {
	String orl ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 
	String yrl ="https://www.youtube.com";
	String frl="https://www.facebook.com/";
	WebDriver driver;


@BeforeTest
public void bt() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(orl);
    Thread.sleep(3000);
	}

@Test
public void T() throws InterruptedException{
	Set<String> PT =driver.getWindowHandles();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get(frl);
	
	System.out.println("YOU ARE in Parent tab");
	Set<String>CT=driver.getWindowHandles();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get(yrl);
	Thread.sleep(2000);
	System.out.println("YOU ARE in child tab"+ driver.getTitle());
}
	@Test
	public void T2()throws InterruptedException{
		
		ArrayList<String> newtb = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(newtb);
		driver.switchTo().window(newtb.get(0));
		System.out.println("page title of parent "+driver.getTitle());
		driver.switchTo().window(newtb.get(2));
		System.out.println("page title of child "+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		System.out.println("child window is closed ");
		Thread.sleep(3000);
		driver.close();
		System.out.println("Parent window is closed ");}
}

