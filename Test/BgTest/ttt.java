package BgTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ttt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://better-life.tk/login");
		driver.findElement(By.id("username")).sendKeys("tge");
		driver.findElement(By.id("password")).sendKeys("tge");
		driver.findElement(By.xpath("(//div/button[text()='Sign In'])")).click();
		//Thread.sleep(5000);
		//String ActualText = driver.findElement(By.xpath("//div/div[text()='Total No. of Active Quadrants']")).getText();
		//String ExpectedText = "Total No. of Active Quadrants";
		//Assert.assertEquals(ActualText, ExpectedText);
		//System.out.println(driver.findElements(By.tagName("a")).size());
		//System.out.println(driver.getTitle());
		//Thread.sleep(500);
		//driver.findElement(By.xpath("//button[normalize-space()='Approve Portfolios']")).click();
		//driver.findElement(By.xpath("(//img[@src='/assets/images/Icons_Home.svg'])[1]")).click();
		
		//driver.findElement(By.xpath("(//div[normalize-space()='Assign Field Officers to Quadrants'])[1]")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	
		/*
		WebElement admin = driver.findElement(By.xpath("//div/button[text()='Admin']"));
		Actions actions = new Actions(driver);
		actions.contextClick(admin).build().perform();
		*/
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		Actions actions = new Actions(driver);
		Thread.sleep(500);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='ABOUT US'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//ul/li/a[text()='Leadership'])[1]")).click();
		//actions.moveToElement(Leadership).build().perform();
		//actions.click().build().perform();
		driver.navigate().back();
		*/
		/*
		Thread.sleep(500);
		WebElement ele = driver.findElement(By.cssSelector("ul[id='menu-1-3087fe9e'] li[class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-570']"));

		
		Actions action = new Actions(driver);

		
		action.moveToElement(ele).click().perform();	
		driver.findElement(By.xpath("(//ul/li/a[text()='Leadership'])")).click();
		*/
	}

}
