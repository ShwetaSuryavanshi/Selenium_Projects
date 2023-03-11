package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Handling_Auto_Suggestion_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
         driver= new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).click();
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("atha");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
		
		//Scroll down till particular webelement
		WebElement scrolldown= driver.findElement(By.xpath("//h5[text()='About Us']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(scrolldown);
		actions.perform();
		
		
		
	}

}
