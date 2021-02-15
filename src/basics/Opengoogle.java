package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
		
	    WebElement emailid =	driver.findElement(By.xpath("//*[@id=\'email\']"));
	    emailid.sendKeys("abc@gmail.com");
	    
	    WebElement password = driver.findElement(By.xpath("//*[@id=\'pass\']"));
	    password.sendKeys("A123abc");
	    
	    WebElement login = driver.findElement(By.xpath("//*[@id=\'u_0_b\']"));
	    login.click();
	    
	    
	    WebElement fgt = driver.findElement(By.xpath("//*[@class='_97w4']"));
	    fgt.click();
	    
	    WebElement cac = driver.findElement(By.xpath("//*[@id='u_0_2']"));
	    cac.click();
	    
	    
	    driver.quit();
		

		}

	}

	


