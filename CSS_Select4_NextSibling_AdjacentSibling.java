package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Select4_NextSibling_AdjacentSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("i[class='hm-icon nav-sprite']+span[class='hm-icon-label']")).click();
		/* or it can also be used as i[class='hm-icon nav-sprite']+span  
		(+) is used to select the only adjacent sibling that is it select the sebling which is next to i[class='hm-icon nav-sprite'] and it doesn't select any other sibling those are next to next of that
		*/
		
		
		
		
	}

}
