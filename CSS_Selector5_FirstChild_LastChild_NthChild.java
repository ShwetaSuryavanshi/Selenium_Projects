package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector5_FirstChild_LastChild_NthChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a#nav-hamburger-menu>:first-child")).click();
		//or a#nav-hamburger-menu :first-child 
		/* first-child, last-child, nth-child psuedo webelement  is used when child has a dynamic elements
		  first-child= a#nav-hamburger-menu>:first-child
		  last-child= a#nav-hamburger-menu>:last-child or a#nav-hamburger-menu :first-child
		  nth-child()= ul[class='hmenu hmenu-visible'] :nth-child(2)
		  nth-last-child()= ul[class='hmenu hmenu-visible'] :nth-last-child(2)
		 */
		driver.findElement(By.cssSelector("ul[class='hmenu hmenu-visible'] :nth-child(2) a[class='hmenu-item']")).click();
		/*ul[class='hmenu hmenu-visible'] :nth-child(2) a[class='hmenu-item']  ---> in this nth-child(2) a[class='hmenu-item'] space selects the subchild of the child2 of ul[class='hmenu hmenu-visible'] 
		 
		 */
		
	}

}
