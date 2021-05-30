package seleniumBasic;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.get("https://www.aa.com/homePage.do");
	
	 Actions action = new Actions(driver);
	 
	 
	 // just to show how to move to a specific element
	 
	 WebElement bookTrip = driver.findElement(By.xpath("(//p[@class='feature-call'])[1]"));
	action.moveToElement(bookTrip).perform();
	
	// using gesture on action class
	// difference between build and perfor is that in build we will chian action 
	// perform we do one action
	
	Thread.sleep(3000);
	
	WebElement  searchBar = driver.findElement(By.xpath("//input[@id='aa-search-field']"));
	action.sendKeys(searchBar, "san fransisco").perform();
	
	Thread.sleep(2000);
		action.sendKeys(Keys.CONTROL).sendKeys("z").build().perform();
	 
//		 action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));

		Thread.sleep(2000);
		action.clickAndHold(searchButton).perform();
		
	
		
		
		
	
	}

}
