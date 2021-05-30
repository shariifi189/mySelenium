package seleniumBasic;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 
		 driver.manage().window().maximize();
		 
		 driver.get("http://omayo.blogspot.com/");
		
		String firstWondow = driver.getWindowHandle();
		System.out.println(firstWondow);
		
		
		driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		 
		Set<String > windows = driver.getWindowHandles();
		 System.out.println(windows);
		 
		 Iterator<String> itr = windows.iterator();
		 
		 while(itr.hasNext()) {
			 
			 String window = itr.next();
			 driver.switchTo().window(window);
			 
			 if (driver.getTitle().equals("selenium143")) {
				 driver.close();
			 }
			 
			 driver.switchTo().window(firstWondow);
			 
			 
		 }
		 
		 
		 
	}

}
