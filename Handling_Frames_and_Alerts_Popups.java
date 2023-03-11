package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames_and_Alerts_Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();	
	
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
      // WebElement frame1= driver.findElement(By.id('iframeResult');
          driver.switchTo().frame("iframeResult"); // using id locator which is present in iframe tag
        //driver.switchTo().frame(0); --using index                                                                                                                                                                                                          

      //  System.out.println(driver.getTitle());
      // String frameText= frame1.getText();
       // System.out.println("frameText="+ frameText);
        driver.findElement(By.xpath("/html/body/button")).click(); //click on try it button
        String alert=   driver.switchTo().alert().getText();
        System.out.println(alert);
        driver.switchTo().alert().accept();
     
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
        
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("/html/body/button")).click();
   
        driver.switchTo().alert().sendKeys("Shweta");
        
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
        
        
	}

}
