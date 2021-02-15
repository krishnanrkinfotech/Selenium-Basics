package basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> col = driver.findElements(By.tagName("th"));
	    int colmns=	col.size();
	    System.out.println(colmns);
	    
	    List<WebElement> row = driver.findElements(By.tagName("tr"));
	    int rowss = row.size();
	    System.out.println(rowss);
	    
	  WebElement third = driver.findElement(By.xpath("//td[normalize-space()=\"Learn to interact with Elements\"]//following::td[1]"));
	    String progress= third.getText();
	    System.out.println("learn to interact with elements progress value"+progress);
	    
		List<WebElement> check=driver.findElements(By.xpath("//td[2]"));
		List<Integer> numlist = new ArrayList<Integer>();
		for (WebElement webElement : check) {
			String single =webElement.getText().replace("%", "");
			 numlist.add(Integer.parseInt(single));
		}
		System.out.println(numlist);
		
		
		int smallvalue=Collections.min(numlist);
		System.out.println(smallvalue);
		String small = Integer.toString(smallvalue)+"%";
		String finalXpath="//td[normalize-space()="+"\""+small+"\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		//Thread.sleep(2000);
		WebElement check1 = driver.findElement(By.xpath("//td[normalize-space()=\'30%\']//following::td[1]"));
		check1.click();
			
		}
		

	}


