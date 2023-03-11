package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WebTables_in_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> row= driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr"));
		System.out.println(row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
		System.out.println(col.size());
		
		for(int i=1; i<=row.size(); i++) {
			for(int j=1; j<=col.size(); j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText()+ " ");
			}
			System.out.println();
		}
		
	}

}
