package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesMethod_Ancestor_AncestorOrSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Xpath Axes Methods( Ancestor, Ancestor-or-self)
		
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']//ancestor-or-self::i")).click(); //Ancestor-or-self
		/*i[@class='hm-icon nav-sprite']//ancestor-or-self::div[@id='a-page']  --Ancestor-or-self can also be written like this
		  i[@class='hm-icon nav-sprite']//ancestor::div --Ancestor
		 */

		
		driver.findElement(By.xpath("//a[text()='Echo & Alexa']")).click();
		//xpath Axes (Following, Following-sibling)
		driver.findElement(By.xpath("a[@class='hmenu-item']//following::a[text()='Echo Dot (3rd Gen)']")).click();
		/*
           a[@class='hmenu-item']//following::a   -- Following can also be written like this
            a[@class='hmenu-item']//following::li
            
             a[@class='hmenu-item']//following-sibling::li --Following-sibling
             a[@class='hmenu-item']//following-sibling::a[text()='Echo Dot (3rd Gen)']
            
		*/
		
		//Xpath Axes method (Preceding, Preceding-sibling
		driver.findElement(By.xpath("//a[text()='Movers and Shakers']//preceding::a[text()='Best Sellers']")).click();
		/* //a[text()='Movers and Shakers']//preceding::a[text()='Best Sellers']  -- Preceding
		  //a[text()='Movers and Shakers']//preceding::li  -- Preceding
		 //a[text()='Movers and Shakers']//preceding::li  -- Preceding
		  //a[text()='Movers and Shakers']//preceding-sibling::li  -- Preceding-sibling
		 //a[text()='Movers and Shakers']//preceding-sibling::a[text()='Best Sellers']  -- Preceding-sibling
		  */
		
		
	}

}
