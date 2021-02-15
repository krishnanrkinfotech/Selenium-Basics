package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdropexample {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	driver.get("http://www.leafground.com/pages/drop.html");
	
	WebElement from = driver.findElement(By.id("draggable"));
	WebElement to = driver.findElement(By.id("droppable"));
	
	Actions action = new Actions(driver);
	//action.clickAndHold(from).moveToElement(to).release(to).build().perform();
	action.dragAndDrop(from, to).build().perform();
	
	driver.quit();
	}
}
