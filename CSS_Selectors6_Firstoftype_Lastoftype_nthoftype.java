package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors6_Firstoftype_Lastoftype_nthoftype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("span[class='nav-line-2']>div:first-of-type")).click();
		//driver.findElement(By.cssSelector("span[class='nav-text']>span:last-of-type")).click();
		//driver.findElement(By.cssSelector("span[class='nav-text']>a:nth-of-type(2)")).click();
		
	}

}
