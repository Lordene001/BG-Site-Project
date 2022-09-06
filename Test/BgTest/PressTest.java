package BgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BgPages.AboutUs;
import BgPages.Press;

public class PressTest {

	@Test
	public void VerifyNewsAndReportsButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='PRESS'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul/li/a[text()='News and Reports'])[1]")).click();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://babbangona.com/news/";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void VerifyBlogButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='PRESS'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul/li/a[text()='Blog'])[1]")).click();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://babbangona.com/blog/";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void VerifyNewsAndReportsLoadMoreButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		Press PR = new Press(driver);
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='PRESS'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul/li/a[text()='News and Reports'])[1]")).click();
		PR.LoadMoreNews();
		boolean Annual = PR.AnnualReportTitle();
		Assert.assertTrue(Annual);
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void VerifyBlogViewAllAndReadMoreButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		Press PR = new Press(driver);
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='PRESS'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul/li/a[text()='Blog'])[1]")).click();
		
		PR.BlogViewAll();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://babbangona.com/5-quick-and-useful-tips-for-successful-farming/";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
		
	}
	
	
	
}
