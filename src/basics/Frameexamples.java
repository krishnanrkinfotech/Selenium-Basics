package basics;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameexamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
	    WebElement button1 =driver.findElement(By.id("Click"));
	    button1.click(); 
	    
	    String Text = driver.findElement(By.id("Click")).getText();
	    System.out.println(Text);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    driver.switchTo().frame("frame2");
	    
	    WebElement button2 = driver.findElement(By.id("Click1"));
	    button2.click();
	    String text2=button2.getText();
	    System.out.println(text2);
	    driver.switchTo().defaultContent();
	    
	    List<WebElement> total= driver.findElements(By.tagName("iframe"));
	    int totframes=total.size();
	    System.out.println(totframes);
	
	    driver.quit();
	 
	 
	}

}
