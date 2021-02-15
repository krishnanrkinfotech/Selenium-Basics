package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectableexamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("http://www.leafground.com/pages/selectable.html");
	List<WebElement>selectable =driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
	int size=selectable.size();
	System.out.println(size);
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL);
	action.click(selectable.get(0));
	action.click(selectable.get(1));
	action.click(selectable.get(4));
	action.build().perform();
	//we use better to use Click and hold for removing keys.control
	//action.clickAndHold();
	
	
	driver.quit();
	}
}
	



