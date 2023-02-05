package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector3_Child_Subchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver;
  System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
  
  driver= new ChromeDriver();
   driver.get("https://www.amazon.in/");
   driver.manage().window().maximize();
   
   //Child
   driver.findElement(By.cssSelector("a#nav-hamburger-menu>i")).click();
   /*
    (>) selects child
    "a#nav-hamburger-menu" is the parent and i is the child of "a#nav-hamburger-menu"(parent)
    where "a" is the tag name and "#" is used to select the id
    
    */
   
   //Subchild
   driver.findElement(By.cssSelector("div#hmenu-content a.hmenu-item")).click();
   /*
    ( ) which is also called a space selects the child as well as subchilds of that parent
    "div#hmenu-content" is the parent and "a.hmenu-item" is the child/subchild of that parent
    where "div" is the tagname, "." is used to select the class and "#" is used to select the id
    */
   
   
  
	}

}
