import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb {

 @Test
 public void testCase1() {
  System.out.println("This is the Test Case 1");
  
  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	   
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com");
	driver.close();
 }

 
}