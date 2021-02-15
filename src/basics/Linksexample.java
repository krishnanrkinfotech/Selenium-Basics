package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksexample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
	    WebElement homepage=driver.findElement(By.linkText("Go to Home Page"));
	   homepage.click();
		driver.navigate().back();
		
		WebElement wheretogo = driver.findElement(By.partialLinkText("Find where"));
	     String where=wheretogo.getAttribute("href");
	    System.out.println(where);
		
		 WebElement homepage1 = driver.findElement(By.linkText("Go to Home Page"));
		 homepage1.click();
		 driver.navigate().back(); 
		 
	     WebElement brokenlink = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/a"));
	     brokenlink.click();
	     String title=	driver.getTitle();
	      if(title.contains("404"))
	     {
		   System.out.println("Broken links");
	      }
	      driver.navigate().back();
		
		List<WebElement> counting = driver.findElements(By.tagName("href"));
         int totallinks=counting.size();
          System.out.println(totallinks);
		
	    driver.quit();
		
	}

}
