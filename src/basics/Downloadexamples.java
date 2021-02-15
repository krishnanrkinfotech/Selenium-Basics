package basics;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadexamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("http://www.leafground.com/pages/download.html");
		
		
		WebElement excel = driver.findElement(By.xpath("//*[@id=\'wrapper\']/div/div[3]/div[2]/a[1]"));
		excel.click();
	     File file = new File("C:\\Users\\DELL\\Downloads");
		 File[] totalfiles= file.listFiles() ;
		for (File filefind : totalfiles) {
		    	 if(filefind.getName().equals("testleaf.xlsx"))
		    			 {
					 System.out.println("file is downloaded");
					 
					    }
					
			}
		     //driver.quit();
				
		}
	}
	

			
		

	


