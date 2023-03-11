package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Links_Value_Text_etc_of_A_Webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");

driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

List<WebElement> alltags= driver.findElements(By.tagName("a"));
System.out.println("total tags= "+ alltags.size());
for(int i=0; i<alltags.size();i++)
{
	System.out.println("getAttribute "+ alltags.get(i).getAttribute("href"));
	System.out.println("getText "+alltags.get(i).getText());
	
	
}
List<WebElement> alltags2= driver.findElements(By.tagName("options"));
System.out.println("total tags= "+ alltags2.size());
for(int j=0; j<alltags.size();j++)
{
	System.out.println("getAttribute "+ alltags2.get(j).getAttribute("Value"));
	System.out.println("getText "+alltags2.get(j).getText());
	
	
}
	}

}
