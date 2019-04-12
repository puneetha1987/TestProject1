package practice.Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTrial1 {

	static WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver(); 
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void Test1() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	    String Title1 =  driver.getTitle();
	    System.out.println(Title1);	
	}
	
	@Test(enabled = false)
	public void Test2() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	    String Title1 =  driver.getTitle();
	    System.out.println(Title1);	
	}
	
	@Test(priority = 1)
	public void Test3() throws InterruptedException {
		driver.get("https://www.twitter.com/");
		Thread.sleep(3000);
	    String Title1 =  driver.getTitle();
	    System.out.println(Title1);	
	    String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
	}
	@AfterMethod
	 public void QuitBrowser() {
		driver.quit();		
	}
}
