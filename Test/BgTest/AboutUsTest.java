package BgTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BgPages.AboutUs;

public class AboutUsTest {

	@Test
	public void Verify_Leadership_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		AboutUs About = new AboutUs(driver);
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='ABOUT US'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul/li/a[text()='Leadership'])[1]")).click();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://babbangona.com/leadership-3/";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
		
		
	}

		
	@Test
	public void Verify_Who_We_Are_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		AboutUs About = new AboutUs(driver);

		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement AboutUs = driver.findElement(By.xpath("(//ul/li/a[text()='ABOUT US'])[1]"));
		actions.moveToElement(AboutUs).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul/li/a[text()='Who We Are'])[1]")).click();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://babbangona.com/who-we-are/";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);

	}

}
