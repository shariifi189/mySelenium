package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.get("https://www.aa.com/homePage.do");
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//window.scrollTo(0,800)
		//alert('running')
		
		ScrollDown.scrollDownOnThePage(driver);
	}

	public static void scrollDownOnThePage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void clickOnElementWithJS(WebDriver driver,WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", e);
	}
	


	
}
