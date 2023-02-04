package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector2_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver;
        
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("span[class^='nav-line-2 '][id$='ingress-line2']")).click();
		driver.findElement(By.cssSelector("input[class*='_Full_Width a-'][id^='GLUX']")).sendKeys("Athani");
		/*
		 ^= Prefix
		 $= Suffix
		 *= Substring(Middle words)
		 */
		
	}

}
