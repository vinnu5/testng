package Demo;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class assertions {
	WebDriver driver;

@Test
public void testAssertFunctions() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
driver.navigate().to("https://www.browserstack.com/");
String ActualTitle = driver.getTitle();
String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
Assert.assertEquals(ExpectedTitle, ActualTitle);
}
}



