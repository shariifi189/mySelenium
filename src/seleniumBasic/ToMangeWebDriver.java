package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ToMangeWebDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		String driverToUse = "IE";
		
		WebDriver driver;
		
		
		
		if (driverToUse.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(driverToUse.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}else if(driverToUse.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		driver.get("http://tek-school.com/retail");
		
		
		
	}

}
