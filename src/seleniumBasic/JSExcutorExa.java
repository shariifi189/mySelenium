package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSExcutorExa {

	public static void main(String[] args) {
		
		// to deal with dropdown it depends on the way it is build the structure
		// with drop down if it is select class we create object of select class
		// then we pass the index number to select the desired index
		// if it is not selcet class then we can create a list of webelement
		// and loop throug to select the desired element
		// with dynamic drop down we use javascriptExcuetor 
		// to interact with the drop down 
		//

		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.get("https://www.aa.com/homePage.do");
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("alert('testing is fun')");
	
	WebElement originText = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
	originText.clear();
	originText.sendKeys("Wash");
	
	// we use List to store all elements and the xpath should from parant to childs to element
	List<WebElement> origin = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//a"));
	
	for( WebElement e : origin) {
		
		System.out.println(e.getText());
		
		if(e.getText().contains("IAD")) {
//			e.click();
			// if click do not work we us javascriptExcuetor to click on it 
			js.executeScript("arguments[0].click();", e);
		}
	}
	
	

	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}finally {
		driver.close();
	}
	
	
	
	 
	}

}
