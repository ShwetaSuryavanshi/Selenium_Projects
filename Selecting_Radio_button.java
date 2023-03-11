package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selecting_Radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();	
	
	driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
	
	driver.manage().window().maximize();
	WebElement Scrolldown= driver.findElement(By.cssSelector("input[id='returnDate1']"));
	Actions action = new Actions(driver);
	action.moveToElement(Scrolldown);
	action.perform();
	
	WebElement driver1= driver.findElement(By.cssSelector("input[id='bookFlights']"));
	driver1.click();
	System.out.println(driver1.isSelected());
	
	WebElement driver2= driver.findElement(By.cssSelector("input[id='redeemFlights']"));
	driver2.click();
	System.out.println(driver2.isSelected());
	
	List<WebElement> radio_count= driver.findElements(By.cssSelector("input[class='input__radio']"));
	System.out.println(radio_count.size());
	}

}
