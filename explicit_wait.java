package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com.au/");
		
		driver.manage().window().maximize();
		
		WebElement mousehover= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
		Actions action= new Actions(driver);
		
		action.moveToElement(mousehover).perform();
		
		//WebDriverWait explicitwait = new  WebDriverWait(driver,10);
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
		
	}

}
