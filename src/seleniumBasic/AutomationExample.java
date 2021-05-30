package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationExample {
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 driver.manage().window().maximize();
		 
	 driver.get("http://tek-school.com/retail");
		
	 WebElement eos5D = driver.findElement(By.partialLinkText("Canon EOS 5D"));
	 eos5D.click();
	 WebElement option = driver.findElement(By.id("input-option226"));
	 
	 // create an object of Select Class to interact with dropDown
	 Select availbleOption = new Select(driver.findElement(By.id("input-option226")));
	 availbleOption.selectByIndex(1);
	 // clear the quntity 
	 // add the quantity
	 WebElement quantity = driver.findElement(By.id("input-quantity"));
	 quantity.clear();
	 quantity.sendKeys("3");
	 // add to cart 
	 WebElement addToCart = driver.findElement(By.id("button-cart"));
	 addToCart.click();
		
	 WebElement cart = driver.findElement(By.xpath("(//button[@type ='button'])[5]"));
	 cart.click();
		
	 WebElement crossBtn = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
	 
	 driver.close();
	}

}
