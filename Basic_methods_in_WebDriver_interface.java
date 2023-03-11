package Project1;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Basic_methods_in_WebDriver_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");

driver= new ChromeDriver();
driver.get("https://www.amazon.in/");

driver.manage().window().maximize();

String currentUrl= driver.getCurrentUrl();
System.out.println("currentUrl: "+currentUrl);

//String pageSource= driver.getPageSource();
//System.out.println("pageSource: "+pageSource);

String Title= driver.getTitle();
System.out.println("Title: "+Title);

driver.navigate().to("https://google.com");


driver.get("https://www.amazon.in/");
  List<WebElement> webelements= driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
  System.out.println("webelements ="+ webelements);


  driver.navigate().to("https://google.com");
  String WindowHandle = driver.getWindowHandle();

  System.out.println("WindowHandle ="+ WindowHandle);
  
  Set<String> WindowHandles = driver.getWindowHandles();
     System.out.println("WindowHandles ="+ WindowHandles);
  

  driver.get("https://www.amazon.in/");
  System.out.println("getAttribute()= " + driver.findElement(By.xpath("//*[@id='nav-main']")).getAttribute("class"));
  
  System.out.println("getCssValue()= " + driver.findElement(By.cssSelector("#nav-xshop-container")).getCssValue ("position"));
		 
  System.out.println("getSize()= " + driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).getSize());
  
  System.out.println("getLocation()= " + driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).getLocation());
  
  System.out.println("getText()= " + driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).getText());

  System.out.println("getTagName()= " + driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).getTagName());
  
  System.out.println("isDisplayed()= " + driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).isDisplayed());
  
  System.out.println("isEnabled()= " + driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).isEnabled());
  
  System.out.println("isSelected()= " + driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).isSelected());
  
  System.out.println("getText()= " + driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText());

  
  
  
	 

  
driver.close();



	}

}
