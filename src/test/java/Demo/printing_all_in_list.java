package Demo;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
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

public class printing_all_in_list {
WebDriver driver;
	

	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
}
@Test
public void testcase1() throws InterruptedException
{
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@type='submit']")).click();
}
@Test 
public void testcase2() throws InterruptedException
{
//	driver.findElement(By.xpath("//*[text()='Admin']")).click();
//  List<WebElement> PT=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
//  System.out.println(PT.size());
//  // iterate over list
//  for(int i = 0; i< PT.size(); i++) {
//     //obtain text
//     String s = PT.get(i).getText();
//     System.out.println("Text is: " + s);}
//    
     List<WebElement> A =driver.findElements(By.tagName("a"));
     System.out.println(A.size());
     
     for(int i1 =0;i1<A.size();i1++) {
    	 String c = A.get(i1).getText();
    	 String h = A.get(i1).getAttribute("href");
    	 System.out.println(c);
    	 System.out.println(h);
    	 
     }
     
  }
}



