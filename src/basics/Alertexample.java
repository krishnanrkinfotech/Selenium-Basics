package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
         driver.get("http://www.leafground.com/pages/Alert.html");
         
		WebElement first = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
  		first.click();
		 Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement second=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		second.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		WebElement third = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		third.click();
		Alert alert2 = driver.switchTo().alert();
		//alert2.sendKeys("krish");
		Thread.sleep(2000);
		alert2.accept();
		
        WebElement four = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
	    four.click();
        Alert alert3 = driver.switchTo().alert();
        String alertmsg=alert3.getText();
        alert3.accept();
	    System.out.println(alertmsg);
	    Thread.sleep(2000);
	    
		WebElement five = driver.findElement(By.xpath("//*[@id=\'btn\']"));
		five.click();

		
	driver.quit();
		
	}

}
