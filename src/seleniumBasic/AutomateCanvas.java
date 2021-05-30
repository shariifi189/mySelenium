package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateCanvas {

	public static void main(String[] args) {

		// Negative test case
		// go to https://canvas.instructure.com/login/canvas
		// enter invalid user name "the name"
		// enter invalid password "the password"
		// clidk on the login button
		// you should not see the dash board
		// you should see the error massage
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 driver.manage().window().maximize();
		 
	 driver.get("https://canvas.instructure.com/login/canvas");
		
		WebElement emailfield = driver.findElement(By.id("pseudonym_session_unique_id"));
		emailfield.clear();
		emailfield.sendKeys("shar1234");
		
		WebElement passwordField = driver.findElement(By.id("pseudonym_session_password"));
		passwordField.clear();
		passwordField.sendKeys("hiey3434");
		
		WebElement loginBtn = driver.findElement(By.xpath("(//button[@class ='Button Button--login'])[1]"));
		loginBtn.click();
		
		WebElement errorMassage = driver.findElement(By.xpath("//li[@class='ic-flash-error']"));
		
		
		System.out.println(errorMassage.getText());
		
		driver.close();
		
		
	}

}
