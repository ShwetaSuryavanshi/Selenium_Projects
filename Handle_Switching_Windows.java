package Project1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Switching_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
         driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		
		driver.findElement(By.id("privacy-link")).click();
		
		Set<String> windowhandles= driver.getWindowHandles();
		System.out.println(windowhandles);
		
	Iterator<String> iterator1	= windowhandles.iterator();
	String parentWindow =iterator1.next();
	System.out.println("parentWindow" +parentWindow);
	String childWindow =iterator1.next();   //one more tab called data is open that's y added one more next() method because in here data is treated as parent and salesforce.com is treated as child1 and further as child2
	String childWindow1 =iterator1.next();
	System.out.println(childWindow1);
	
	driver.switchTo().window(childWindow1);
	System.out.println("childWindow" + driver.getWindowHandle());
	
	driver.findElement(By.cssSelector("#main > div.columnContainer.parbase.section > div > div.container > div.row.columns-wrapper > div > div > div > div.row.columns-wrapper > div.col.text-left.col-xs-12.col-sm-9.col-md-9.col-lg-9 > div:nth-child(2) > div > div.row.columns-wrapper > div > div.buttonCTAComponent.parbase.section > div > div > div > a")).click();
	
	
		
		
		
	}

}
