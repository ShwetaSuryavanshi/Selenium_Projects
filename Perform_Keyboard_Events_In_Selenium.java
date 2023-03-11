package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_Keyboard_Events_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement copytextbox= driver.findElement(By.xpath("//*[@id=\"result\"]/div[4]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre[2]"));
		Actions action= new Actions(driver);
		
		action.keyDown(copytextbox, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		
		WebElement pastetextbox = driver.findElement(By.xpath("//*[@id=\"result\"]/div[5]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre[8]"));
		 action.keyDown(pastetextbox, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		 Thread.sleep(2000);
		
		
		
	}

}
