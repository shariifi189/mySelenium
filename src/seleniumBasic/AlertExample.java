package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.get("https://tekschool.us");
		
	 // alert ('testing')
	 // confirm ('confirm')
	 // prompt ('enter you name')
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("alert ('alert')"); 
//	 Thread.sleep(2000);
//	 Alert alert = driver.switchTo().alert();
//	 alert.accept();

	 
	 js.executeScript("comfirm ('trying to figure it out')");
	 Alert alert2 = driver.switchTo().alert();
	 Thread.sleep(2000);
	 alert2.dismiss();
	 
	 
	 Thread.sleep(2000);
	 js.executeScript("prompt ('yourName')");
	 Alert alert3 = driver.switchTo().alert();
	 Thread.sleep(2000);
//	 alert3.sendKeys("khan");
	 alert3.dismiss();
		
		
	}

}
