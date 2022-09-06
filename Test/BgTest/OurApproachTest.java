package BgTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BgPages.AboutUs;

public class OurApproachTest {

	@Test
	public void VerifyOurModelButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='OUR APPROACH'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul/li/a[text()='Our Model'])[1]")).click();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://babbangona.com/our-model/";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void VerifyMemberStoriesButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='OUR APPROACH'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul/li/a[text()='Member Stories and Gallery'])[1]")).click();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://babbangona.com/member-stories/";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
		
	}
	
	
}
