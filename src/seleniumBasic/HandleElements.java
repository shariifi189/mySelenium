package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandleElements {

	public static void main(String[] args) throws InterruptedException {
	
	
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);		 driver.manage().window().maximize();
		 
	 driver.get("http://tek-school.com/retail");
	 WebElement mac= driver.findElement(By.linkText("MacBook"));
		mac.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='row']"));
		System.out.println(list.size());
		for (WebElement e : list) {
			e.click();
			Thread.sleep(2000);
			driver.navigate().back();
			System.out.println(e);
			
		}
		
		Thread.sleep(2000);
		Actions action = new Actions (driver);
		
		WebElement desktopTab = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		action.contextClick(desktopTab).perform();
		
		
		
		Thread.sleep(2000);
//		driver.close();
	
	WebElement appleCinema = driver.findElement(By.partialLinkText("Apple Cinema 30\""));
	appleCinema.click();
	
	
	WebElement monitorSizeMedium = driver.findElement(By.xpath("(//input[@name = 'option[218]'])[3]"));
	monitorSizeMedium.click();
	

	List<WebElement> checkBoxes = driver.findElements(By.xpath("//div[@id = 'input-option223']//label//input"));
	
	System.out.println(checkBoxes.size());
	
//	checkBoxes.get(3).click();
//	checkBoxes.get(2).click();
	
	for (WebElement e : checkBoxes) {
		
		e.click();
	}
	
	WebElement text = driver.findElement(By.xpath("//input[@id='input-option208']"));
	text.clear();
	text.sendKeys("this is test");
	
	Select select = new Select(driver.findElement(By.xpath("//select[@id='input-option217']")));
	select.selectByIndex(4);
	
	//td[@class = 'day' and text()='12'] to select the day on calander 
	
	
	WebElement callander = driver.findElement(By.xpath("//input[@id='input-option219']"));
	callander.clear();
	callander.sendKeys("2011-02-09");
	
	WebElement time = driver.findElement(By.xpath("//input[@id='input-option221']"));
	time.clear();
	time.sendKeys("21:01");
	
	driver.findElement(By.xpath("(//button[@class ='btn btn-default'])[5]")).click();
	
	WebElement callander2 = driver.findElement(By.xpath("WebElement callander = driver.findElement(By.xpath(\"//input[@id='input-option219']\"));"));
	callander2.click();
	
	
	
	
	
	
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}finally {
		driver.close();
	}
	
	}
	

}
