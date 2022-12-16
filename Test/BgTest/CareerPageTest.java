package BgTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePackage.BaseClass;
import BgPages.Careers;
import BgPages.Press;

public class CareerPageTest {

	
	@Test public void Verify_Home_Page_Career_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp(); 
		Careers CS = new Careers(driver);
		String ActualText = CS.CareerButton(); 
		String ExpectedText ="Propel your career with Babban Gona"; 
		Assert.assertEquals(ActualText,ExpectedText); 
		BaseClass.TearDown(driver); 
	}

	@Test public void Verify_Check_Openings_Button() throws InterruptedException { 
		WebDriver driver = BaseClass.SetUp(); 
		Careers CS = new Careers(driver); 
		CS.Openings(); 
		String ActualURL = driver.getCurrentUrl(); 
		String ERxpectedURL = "https://babbangona.zohorecruit.com/jobs/Careers";
		Assert.assertEquals(ActualURL, ERxpectedURL); BaseClass.TearDown(driver); 
	}

	@Test public void Verify_Career_Page_SignIn() throws InterruptedException {
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

	@Test public void Verify_Create_An_Account_In_Career_Page_SignIn() throws InterruptedException { 
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


	@Test public void Verify_Forgot_Password() throws InterruptedException {
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
	 

	@Test
	public void Verify_User_Can_Create_Account() throws InterruptedException, AWTException {

		WebDriver driver = BaseClass.SetUp();
		Careers CS = new Careers(driver);
		CS.Openings();
		Thread.sleep(1000);
		CS.RegisterButton();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> IT = windows.iterator();
		String parentId = IT.next();
		String ChildId = IT.next();
		driver.switchTo().window(ChildId);
		Thread.sleep(1000);

		CS.SignUpEmail("emmanuelene001@gmail.com");
		CS.SignUpPassword("Lord_001");

		driver.findElement(By.xpath("(//lyte-icon[@class='dropdown'])[1]")).click();
		List<WebElement> Title = driver
				.findElements(By.xpath("//lyte-drop-item[contains(@class,'picklist_values')]"));
		for (int i = 0; i < Title.size(); i++) {
			if (Title.get(i).getText().contains("Mrs.")) {
				Title.get(i).click();
				break;
			}
		}

		CS.SignUp_FirstName("Brown");
		CS.SignUp_LastName("Blue");
		CS.SignUpMobile("080123456");
		CS.SignUpStreet("James ford street");
		CS.SignUpCity("Lagos");
		CS.SignUpStateProvince("Lagos");
		CS.SignUpZipCode("100205");
		CS.SignUpCountry("Nigeria");

		
		driver.findElement(By.xpath("(//lyte-icon[@class='dropdown'])[2]")).click();
		List<WebElement> JobTitle = driver
				.findElements(By.xpath("//lyte-drop-item[contains(@class,'picklist_values')]"));
		for (int i = 0; i < JobTitle.size(); i++) {
			if (JobTitle.get(i).getText().contains("Project-Manager")) {
				JobTitle.get(i).click();
				break;
			}
		}
		
		CS.SignUpSkillSet();
		CS.Education1("CRUTECH");
		CS.Education2("Mechanical Engineering");
		CS.Education3("BSc");
		
	
		driver.findElement(By.xpath("(//lyte-icon[contains(@class,'dropdown')])[3]")).click();
		List<WebElement> Month1 = driver.findElements(By.tagName("lyte-drop-item"));
		for (int i = 0; i < Month1.size(); i++) {
			if (Month1.get(i).getText().contains("Mar")) {  
				Month1.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//lyte-icon[contains(@class,'dropdown')])[4]")).click();
		List<WebElement> Year1 = driver
				.findElements(By.tagName("lyte-drop-item"));
		for (int i = 0; i < Year1.size(); i++) {
			if (Year1.get(i).getText().contains("2016")) {
				Year1.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//lyte-icon[contains(@class,'dropdown')])[5]")).click();
		List<WebElement> Month2 = driver
				.findElements(By.tagName("lyte-drop-item"));
		for (int i = 0; i < Month2.size(); i++) {
			if (Month2.get(i).getText().contains("Feb")) {
				Month2.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//lyte-icon[contains(@class,'dropdown')])[6]")).click();
		List<WebElement> Year2 = driver
				.findElements(By.tagName("lyte-drop-item"));
		for (int i = 0; i < Year2.size(); i++) {
			if (Year2.get(i).getText().contains("2021")) {
				Year2.get(i).click();
				break;
			}
		}
		
		
		CS.Experience1("QA Tester");
		CS.Experience2("Babban Gona");
		CS.Experience3("I am a QA tester..");
		
		driver.findElement(By.xpath("(//lyte-icon[contains(@class,'dropdown')])[7]")).click();
		List<WebElement> Month3 = driver.findElements(By.tagName("lyte-drop-item"));
		for (int i = 0; i < Month3.size(); i++) {
			if (Month3.get(i).getText().contains("Nov")) {  
				Month3.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//lyte-icon[contains(@class,'dropdown')])[8]")).click();
		List<WebElement> Year3 = driver
				.findElements(By.tagName("lyte-drop-item"));
		for (int i = 0; i < Year3.size(); i++) {
			if (Year3.get(i).getText().contains("2004")) {
				Year3.get(i).click();
				break;
			}
		}

		CS.Experience4();
		CS.ResumeUpload();
		
		Robot RB = new Robot();
		StringSelection SS = new StringSelection("C:\\Users\\bglag\\Desktop\\Doc1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
		
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_V);
		RB.keyRelease(KeyEvent.VK_CONTROL);
		RB.keyRelease(KeyEvent.VK_V);
		RB.keyPress(KeyEvent.VK_ENTER);
		RB.keyRelease(KeyEvent.VK_ENTER);
		// Enter CAPTCHA manually and finish the scenario 
		//BaseClass.TearDown(driver);
				
	}

	
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
	
	
	
}
