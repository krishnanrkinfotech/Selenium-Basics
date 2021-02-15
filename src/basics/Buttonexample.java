package basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Buttonexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("http://www.leafground.com/pages/Button.html");
	    
		WebElement button1= driver.findElement(By.xpath("//*[@id=\'home\']"));
		button1.click();
		driver.navigate().back();
		
		WebElement secondbtn = driver.findElement(By.id("position"));
		secondbtn.click();
		org.openqa.selenium.Point points =secondbtn.getLocation();
		int value= points.getX();	
		int value2=	 points.getY();//
	    System.out.println("value of x ->"+value+" value of y->"+value2);
	    
	    WebElement thirdbutton=driver.findElement(By.xpath("//*[@id=\'size\']"));
	    String colors=  thirdbutton.getCssValue("background-color");
	    System.out.println(colors);
	    
	    WebElement fourbtn = driver.findElement(By.xpath("//*[@id=\'size\']"));
	    int height=  fourbtn.getSize().getHeight();
	    int width = fourbtn.getSize().getWidth();
	   System.out.println("height ->"+height+"width ->"+width);
	   
	   driver.quit();
	   
	    		
		 
		 
	
		
	}

}  
