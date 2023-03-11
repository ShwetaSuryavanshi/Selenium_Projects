package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/dialog/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement  box= driver.findElement(By.cssSelector("span[class='ui-dialog-title']"));
		Actions action = new Actions(driver);
		action.contextClick(box).perform();

	}

}
