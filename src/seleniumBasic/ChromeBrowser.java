package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		// step 1
	// to open chrome browser we need to set up   
	// system.setproperty to open chrome driver file
	// syntax for system.setproperty ("webdriver.chrome.driver","<path to file>
	// for window user we add .exe extension no need for mac user
		
				
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
	// step 2
	//we need to create a reference to webdriver interface
	//then create obj of chromeDriver class
	
				
	 WebDriver driver = new ChromeDriver();
	 WebDriverWait wait = new WebDriverWait(driver, 5);
				
	 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
	 
	// we need to open this URL
	// http://tek-school.com
	// to open a website with selenium webdriver we need to use 
	// .get() method and pass url as a parameter
				
	// to maximize the page
		driver.manage().window().maximize();
				
	// we need to define the pageload timeout so webdriver should not 
	// throw an exception for this issue.
					
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS );
				
	// Global wait or implicit wait
		// implicit wait tell the webdriver to wait for certain amount of time
					
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
				
		// Delete cookies with selenium will delete the browser histories
		//driver.manage().deleteAllCookies();
				
				
				
	// .get() will open website
	driver.get("http://tek-school.com/retail");
	
	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");;
	
	
	WebElement searchBtn = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
	// explecit wait we use to the webdriver to wait for a defined conditon to 
	// happens before it throw exception 
	
	wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
	// i want to print page title or website title
	// i want to print the url of page which i am on it.
	
	String pageUrl  = driver.getCurrentUrl();
	System.out.println(" current page url: "+pageUrl);
	String pageTitle = driver.getTitle();
	System.out.println("cuarrent page title: " + pageTitle);
	
	// to close an open browser with webdriver we can use two methods
	// .close()  this will close the current tab
	// .quite() this will close all the tabs


	driver.wait();
	driver.close();
	
		
	}

	public static void clickOnBtn(WebElement btn, WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		
	}
	
	
}
