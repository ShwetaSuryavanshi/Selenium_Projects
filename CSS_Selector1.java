package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	//css selector
	            // finding webelements by Class  attribute
	driver.findElement(By.cssSelector("a[class='nav-a  ']")).click();  
	
               /*  it can also be written as below
                driver.findElement(By.cssSelector("a.class=nav-a  ")).click();  
                driver.findElement(By.cssSelector("i.hm-icon nav-sprite").click(); 
                  driver.findElement(By.cssSelector("div.nav-fill").click(); 
                (.) dot represents class
                */
	
	 // finding webelements by id  attribute
	driver.findElement(By.cssSelector("input[id='nav-search-keywords']")).sendKeys("Phones");
	/*  it can also be written as below
	 driver.findElement(By.id("id#nav-search-keywords").sendKeys("Phones"); 
	 driver.findElement(By.id("#nav-search-keywords").sendKeys("Phones"); 
	(#) hash represents ID
	 */
	
	
	//CSS selector with multiple attributes
	driver.findElement(By.cssSelector("input#twotabsearchtextbox[type='text'][name='field-keywords']")).click();
	
	
	}

}
