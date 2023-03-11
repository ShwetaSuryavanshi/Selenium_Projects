package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate_Slider_in_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#hotelrooms");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement slider= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(slider);
		
		WebElement button = driver.findElement(By.cssSelector("span[class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(button, 200, 250).perform();
		
	}

}
