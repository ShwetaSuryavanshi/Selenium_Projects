package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
         driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
	Actions action= new Actions(driver);
	action.dragAndDrop(drag, drop).perform();
	
		
	}

}
