package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//i[@class=\"hm-icon nav-sprite\"]")).click();
		 // Xpath axes methods: Child
		driver.findElement(By.xpath("//a[@data-menu-id=\"7\"]//child::i[1]]")).click();
		driver.findElement(By.xpath("//a[text()='Amazon Smart Home']")).click();
		 // Xpath axes methods: Parent
		driver.findElement(By.xpath("//option[@value=\"search-alias=aps\"]//parent::select")).click();
		
		
		
		
	
		

	}

}
