package Demo;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Iterator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;


public class brokenlink {
	
WebDriver driver ;

@BeforeTest 

public void bt ()throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

 driver.get("https://demo.guru99.com/test/newtours/");
 driver.manage().window().maximize();
 Thread.sleep(3000);
}
@Test
public void t() throws InterruptedException {
	 //Storing the links in a list and traversing through the links
    List<WebElement> links = driver.findElements(By.tagName("a"));

    // This line will print the count of links.
    System.out.println("No of links are "+ links.size());  
  
    //checking the links fetched.
    for(int i=0;i<links.size();i++)
    {
        WebElement E1= links.get(i);
        String url= E1.getAttribute("href");
        verifylinks(url);
    }
}
        public static void verifylinks(String linkUrl) {
        try
        {
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()==200)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }    
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
             }
         } catch (Exception e) {

      }
    }
}

 

