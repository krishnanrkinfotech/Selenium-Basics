package basics;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxexamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.get("http://www.leafground.com/pages/checkbox.html");
        WebElement firstcheck = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[3]/input"));
        firstcheck.click();
        
        WebElement second = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
        boolean status=  second.isSelected();
        System.out.println(status);
        
        WebElement firstelement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
        if(firstelement.isSelected())
        
        {
        	firstelement.click();
        }
        
        WebElement secondelement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
        if(secondelement.isSelected())
        {
        	secondelement.click();
        }
        WebElement four1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
        four1.click();
        WebElement four2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
        four2.click();
			
        WebElement four3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input"));
        four3.click();
		
        WebElement four4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[4]/input"));
        four4.click();
        WebElement four5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[5]/input"));
        four5.click();
	}

}
