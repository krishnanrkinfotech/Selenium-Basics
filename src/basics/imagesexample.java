package basics;

//import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class imagesexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement firstimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
        firstimage.click();
        driver.navigate().back();
        WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
       if( brokenimage.getAttribute("naturalWidth").equals("0")) {
    	   System.out.println("broken image");
       }
       else {
    	   System.out.println("not broken image");
       }
       Thread.sleep(2000);
       Actions action = new Actions(driver);
        driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/img"));
       action.click().build().perform();
       
       
       driver.quit();


       
       
       }
        
	}


