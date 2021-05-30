package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LonginToGmail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 driver.manage().window().maximize();
		 
	 driver.get("https://www.gmail.com");
	 
	WebElement emailFiel = driver.findElement(By.xpath("//input[@type='email']"));
	emailFiel.sendKeys("shariifi189");
	WebElement nextBtn = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
	nextBtn.click();
		
		
	
	}

}
