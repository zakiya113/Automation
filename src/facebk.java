import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebk {

	
	WebDriver driver= new ChromeDriver();
	
	
	@BeforeTest
	public void startbrowser() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.get("http://fb.com/");
		Thread.sleep(1000);	
		
	}
	@Test
	public void fbsignup() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Anam");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Khan");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("123anam");	
	}
	
	@AfterTest
	public static void skip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
		driver.close();
	}
	}
	
