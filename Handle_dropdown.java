package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");

driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

//link about Select()= https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/Select.html
WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
Select select= new Select(dropdown);

select.selectByValue("search-alias=alexa-skills");
Thread.sleep(2000);

select.selectByVisibleText("Amazon Fresh");
Thread.sleep(2000);

select.selectByIndex(6);

   WebElement firstOption = select.getFirstSelectedOption();
System.out.println(firstOption.getText());
/* Selecting multiple parameters from  drop down at a time

WebElement dropdown= driver.findElement(By.id("muti-select"));
Select select= new Select(dropdown);
select.selectByValue("california");
select.selectByIndex(5);
   List<WebElement> allItems = select.getAllSelectedOptions();
   System.out.println(allItems.size());    // output=2
   
   select.deselectAll();
   
   select.selectByIndex(4);
   List<WebElement> allItems = select.getAllSelectedOptions();
   System.out.println(allItems.size());    //output=1

*/
	}

}
