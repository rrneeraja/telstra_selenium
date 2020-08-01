package telstra_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelstraSelenium {

	  public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagar\\Downloads\\chromedriver_win32-84\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
   // driver.navigate().to("http://www.google.com/");  
      driver.get("http://www.google.com/");
    // Click on the search text box and send value  
   driver.findElement(By.name("q")).sendKeys(new String[]{"Hello Java"});  
 
    // Click on the search button  
    driver.findElement(By.name("btnK")).click(); 
  //  String text = driver.getTitle();
    // System.out.println(text);
    System.out.println(driver.getTitle());
    driver.close();
      
    }  
  
}
