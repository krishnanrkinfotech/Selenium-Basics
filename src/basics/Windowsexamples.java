package basics;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsexamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");
		String oldwindow =driver.getWindowHandle();
		WebElement parent =driver.findElement(By.xpath("//*[@id=\'home\']"));
		parent.click();
		
		Set<String> handles=driver.getWindowHandles();
		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);
			}
		WebElement edit =driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		edit.click();
		Thread.sleep(2000);
		driver.switchTo().window(oldwindow);
		//driver.close();

		
	WebElement second = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	second.click();
	Thread.sleep(2000);
    int openwindow=driver.getWindowHandles().size();
    System.out.println(openwindow);
   Thread.sleep(2000);
    
    WebElement third = driver.findElement(By.xpath("//*[@id=\'color\']"));
    third.click();
  Set<String>  newwindow1 =driver.getWindowHandles();
    for (String old : newwindow1) {
    	if(!old.equals(newwindow1))
    	{
    		driver.switchTo().window(old);
    		driver.close();
    	}
		
	}
	
	}

}
