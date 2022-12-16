package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Iterator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkprint {
	WebDriver driver;

	@BeforeTest
	public void bt() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/");
	//String url="";
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	@Test
	public void at() throws InterruptedException{
	 List<WebElement> A =driver.findElements(By.tagName("a"));
     System.out.println(A.size());
     
       for(int i1 =0;i1<A.size();i1++) {
    	 String c = A.get(i1).getText();
//    	 String h = A.get(i1).getAttribute("href");
    	 System.out.println(c);
//    	 System.out.println(h);
//     Iterator<WebElement> iterator = A.iterator();
//     while (iterator.hasNext()) {
//   	  String url = iterator.next().getText();
//   	  System.out.println(url);
     }
     
     }
}
