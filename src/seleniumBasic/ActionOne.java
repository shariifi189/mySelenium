package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionOne {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
		 WebDriver driver = new FirefoxDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 
		 driver.get("https://www.google.com/");
	
	Actions action = new Actions(driver);
		
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("how generate report in cucumber ");
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();;
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys("z").build().perform();
		
		driver.close();
		
		
		
		
	}

}
