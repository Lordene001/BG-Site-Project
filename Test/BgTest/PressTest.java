package BgTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePackage.BaseClass;
import BgPages.AboutUs;
import BgPages.Press;

public class PressTest {

	/*
	@Test
	public void Verify_News_And_Reports_Button() throws InterruptedException {
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
	public void Verify_Blog_Button() throws InterruptedException {
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
	public void Verify_News_And_Reports_Load_More_Button() throws InterruptedException {
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
	public void Verify_Blog_View_All_And_Read_More_Button() throws InterruptedException {
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
		String ExpectedURL = "https://babbangona.com/tackling-food-insecurity-through-technological-innovation/";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
		
	}
	*/
	
	@Test
	public void Check_For_Blog_Page_Broken_Links() throws InterruptedException, MalformedURLException, IOException {
		WebDriver driver = BaseClass.SetUp();
		Press PR = new Press(driver);
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='PRESS'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul/li/a[text()='Blog'])[1]")).click();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		SoftAssert AS = new SoftAssert();
		
		for(WebElement link: Links) {
			String Url = link.getAttribute("href");
			HttpURLConnection connect = (HttpURLConnection) new URL(Url).openConnection();
			connect.setRequestMethod("HEAD");
			connect.connect();
			int ResponseCode = connect.getResponseCode();
			System.out.println(ResponseCode + Url);
			AS.assertTrue(ResponseCode < 400, "This Link with the text " + link.getText() + 
					" is broken with status code" + ResponseCode);
		}
		
		AS.assertAll();
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void Check_For_News_And_Report_Page_Broken_Links() throws InterruptedException, MalformedURLException, IOException {
		WebDriver driver = BaseClass.SetUp();
		Press PR = new Press(driver);
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='PRESS'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul/li/a[text()='News and Reports'])[1]")).click();
		
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		SoftAssert AS = new SoftAssert();
		
		for(WebElement link: Links) {
			String Url = link.getAttribute("href");
			HttpURLConnection connect = (HttpURLConnection) new URL(Url).openConnection();
			connect.setRequestMethod("HEAD");
			connect.connect();
			int ResponseCode = connect.getResponseCode();
			System.out.println(ResponseCode + Url);
			AS.assertTrue(ResponseCode < 400, "This Link with the text " + link.getText() + " is broken with status code" + ResponseCode);
		}
		
		AS.assertAll();
		BaseClass.TearDown(driver);
		
	}
	
	
	
}
