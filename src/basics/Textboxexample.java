package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/Edit.html");
		 
		 WebElement emailbox=driver.findElement(By.id("email"));
		 emailbox.sendKeys("abc@gmail.com");
		 System.out.println(emailbox);
		 
		 WebElement secondbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		 //secondbox.clear();-overwrite the append text
	     secondbox.sendKeys("welcome");
	     
		 WebElement thirdbox = driver.findElement(By.xpath("//input[@name='username']"));
		 String values=thirdbox.getAttribute("value");
		 System.out.println(values);
		 
		 WebElement fourbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		 fourbox.clear();
		 
		 WebElement fivebox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		 boolean status= fivebox.isEnabled();
		 System.out.println(status);
		 driver.quit();
	}

}
