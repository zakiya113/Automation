import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Facebook {

	@Test (enabled=true)
	public static void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Anam");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Khan");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("123anam");
		driver.findElement(By.xpath(".//*[@id='day']")).click();
		driver.findElement(By.xpath(".//*[@id='day']/option[13]")).click();
		driver.findElement(By.xpath(".//*[@id='month']")).click();
		driver.findElement(By.xpath(".//*[@id='month']/option[7]")).click();
		driver.findElement(By.xpath(".//*[@id='year']")).click();
		driver.findElement(By.xpath(".//*[@id='year']/option[29]")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_z']/span[1]/label")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_11']")).click();
		//driver.findElement(By.xpath(".//*[@id='js_b']/div/div/div[2]/div/div")).click();
		
		
		driver.close();
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
