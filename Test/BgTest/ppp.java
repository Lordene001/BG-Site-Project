package BgTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ppp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://babbangona.com/");
		driver.findElement(By.xpath("(//li/a[text()='CAREERS'])[1]")).click();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.findElements(By.tagName("a")).size());
		driver.findElement(By.xpath("(//a[@role='button'])[4]")).click();
		
		driver.findElement(By.xpath("(//lyte-dropdown)[1]"));
	   // Thread.sleep(5000);
		//driver.findElement(By.xpath("(//li/a[text()='Accounting'])")).click();
		
		
		WebElement Openingsdriver = driver.findElement(By.xpath("//div[@class='cw-group-view']"));
		Openingsdriver.findElements(By.tagName("a")).size();
		
		
		for(int i=0;i<Openingsdriver.findElements(By.tagName("a")).size();i++) 
		{
			String ClickLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			Openingsdriver.findElements(By.tagName("a")).get(i).sendKeys(ClickLink);
		}
		
		
		driver.quit();
		
	
	
	}

}
