import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dodo {

public static void main(String[] args) throws IOException {		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
		   
driver.manage().window().maximize();
driver.get("https://www.fb.com");
}
}