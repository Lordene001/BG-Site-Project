package BgTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BgPages.Careers;

public class CareerPageTest {

	/*
	@Test
	public void VerifyHomePageCareerButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		Careers CS = new Careers(driver);
		String ActualText = CS.CareerButton();
		String ExpectedText = "Propel your career with Babban Gona";
		Assert.assertEquals(ActualText, ExpectedText);
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void VerifyCheckOpeningsButton() {
		WebDriver driver = BaseClass.SetUp();
		Careers CS = new Careers(driver);
		CS.Openings();
		String ActualURL = driver.getCurrentUrl();
		String ERxpectedURL = "https://babbangona.zohorecruit.com/jobs/Careers";
		Assert.assertEquals(ActualURL, ERxpectedURL);
		BaseClass.TearDown(driver);
	}
	
	
	
	@Test
	public void VerifyCareerPageSignIn() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		Careers CS = new Careers(driver);
		CS.SignIn1();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>Op = windows.iterator();
		String parentId = Op.next();
		String ChildId = Op.next();
		driver.switchTo().window(ChildId);
		
		driver.switchTo().frame("portalsigniniframe");
		CS.SignInEmail("abc@gmail.com");      
		CS.SignInPassword("123");
		CS.SignInSubmit();
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void VerifyCreateAnAccountInCareerPageSignIn() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		Careers CS = new Careers(driver);
		CS.SignIn1();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>Op = windows.iterator();
		String parentId = Op.next();
		String ChildId = Op.next();
		driver.switchTo().window(ChildId);
		
		String ActualText = CS.CreateAnAccount();
		String ExpectedText = "Autofill Application";
		BaseClass.TearDown(driver);

	}
	
	
	@Test
	public void VerifyForgotPassword() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		Careers CS = new Careers(driver);
		CS.SignIn1();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>Op = windows.iterator();
		String parentId = Op.next();
		String ChildId = Op.next();
		driver.switchTo().window(ChildId);
		
		driver.switchTo().frame("portalsigniniframe");
		CS.ForgotPasswordButton();
		Thread.sleep(500);
		CS.ForgotPasswordEmailOrName("max@gmail.com");
		// Enter CAPTCHA manually and finish the scenario
		//BaseClass.TearDown(driver);
		
	}
	*/
	
	@Test
	public void VerifyUserCanCreateAccount() throws InterruptedException {
		
		WebDriver driver = BaseClass.SetUp();
		Careers CS = new Careers(driver);
		CS.Openings();
		Thread.sleep(1000);
		CS.RegisterButton();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> IT =windows.iterator();
		String parentId = IT.next();
		String ChildId = IT.next();
		driver.switchTo().window(ChildId);
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		
		WebElement SelectFile = driver.findElement(By.xpath("//rec-file-upload-component[@id='rec-form_595887000000072325']"));
		
		SelectFile.sendKeys("C:\\Users\\bglag\\Desktop\\Doc1.pdf");
		
		
	}
	
	
	
	
}
