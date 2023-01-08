package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Project1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor jse;
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		driver.get("https://www.Amazon.com");
		String title= driver.getTitle();
		System.out.println("Title is:"+ title);
		
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");

driver.findElement(By.id("nav-search-submit-button")).click();

jse = (JavascriptExecutor)driver;
jse.executeScript("scroll(0,1000)");

driver.findElement(By.partialLinkText("Today's Deals")).click();
driver.findElement(By.className("hm-icon-label")).click();
driver.navigate().back();
driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
driver.findElement(By.id("createAccountSubmit")).click();
driver.findElement(By.id("ap_customer_name")).sendKeys("gdgedg");
Thread.sleep(2000);

driver.findElement(By.id("ap_email")).sendKeys("gdgedg.com");
Thread.sleep(2000);
driver.findElement(By.id("continue")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);


String at= driver.getTitle();
System.out.println(at);
 System.out.println("Current url is: "+ driver.getCurrentUrl());
 String et="amazon sign-in";
driver.close();
driver.quit();
if(at.equalsIgnoreCase(et))
{
	System.out.println("Test Successful");
	
}
else
{
	System.out.println("Test failure");
}





	}



}
