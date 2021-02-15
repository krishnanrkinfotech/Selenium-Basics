package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortableexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		Thread.sleep(2000);
	    List<WebElement>sortablelist=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
	    WebElement from = sortablelist.get(6);
	    WebElement to = sortablelist.get(0);
	     Actions action = new Actions(driver);
	     action.clickAndHold(from);
	     action.moveToElement(to);
	      action.release(to);
	      action.build().perform();
	      //driver.quit();
	}

}
