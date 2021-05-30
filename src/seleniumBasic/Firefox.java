package seleniumBasic;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.QualifiedNameable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
		
		 WebDriver driver = new FirefoxDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		 driver.get("http://tek-school.com/retail");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,500)");
		 
		 Thread.sleep(4000);
		 
		 WebElement canon = driver.findElement(By.xpath("//a[text()='Canon EOS 5D']"));
		 canon.click();
		 Thread.sleep(4000);
		 Select select =  new Select(driver.findElement(By.xpath("//select[@id='input-option226']")));
//		 select.deselectByIndex(1);
		 
		 select.selectByValue("15");
		 
		 WebElement quantity = driver.findElement(By.name("quantity"));
		 quantity.clear();
		 quantity.sendKeys("4");
		 
		 WebElement addToCart = driver.findElement(By.id("button-cart"));
		 addToCart.click();
		 driver.close();
		 
		 
		
	}
}
	
		




