package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_mouse_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
         driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com.au/");
		
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(6) > a"));
       Actions action= new Actions(driver);
       
       action.moveToElement(element).perform();
}
}