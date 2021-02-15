package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompleteexamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement textbox = driver.findElement(By.id("tags"));
		textbox.sendKeys("s");
		Thread.sleep(2000);
	List<WebElement>selectoptions	= driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
     int totalsize =	selectoptions.size();
    System.out.println(totalsize);
	for (WebElement webElement : selectoptions) {
		if(webElement.getText().equals("SOAP"))
			
		{
			webElement.click();
		System.out.println("if part");
			break;
		}
		
		//else
		//{
			//System.out.println("else part");
		//}
	}
	
		
		
	}
}
	//driver.quit();
		
		

	


