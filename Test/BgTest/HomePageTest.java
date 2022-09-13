package BgTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import BasePackage.BaseClass;
import BgPages.HomePage;

public class HomePageTest {

	@Test
	public void Veriify_Home_Page_Logo() {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		boolean Logo = HP.ValidateLogo();
		Assert.assertTrue(Logo);
		BaseClass.TearDown(driver);
	}

	@Test
	public void Verify_Home_Page_Video() {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		boolean Video = HP.VerifyHomePagevideo();
		Assert.assertTrue(Video);
		BaseClass.TearDown(driver);
	}

	@Test
	public void Verify_News_Letter() {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		HP.NewsLetter();
		String ActualMessage = HP.NewsLetterSubcribeMessage();
		String ExpectedMessage = "You have successfully subscribed for the newsletter";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		BaseClass.TearDown(driver);
	}

	@Test
	public void Verify_Join_The_Movement() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		String ActualHeader = HP.JoinTheMovement();
		String ExpectedHeader = "Community";
		Assert.assertEquals(ActualHeader, ExpectedHeader);
		BaseClass.TearDown(driver);

	}

	@Test
	public void Verify_Invest_In_The_Movement() {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		HP.ClickInvestInTheMOvementButton();
		HP.InsvestEmail("abc@gmail.com");

		WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='form-field-field_9bd4e26']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);

		HP.InvestOrganizationName("BG");
		HP.InvestFullName("Ben Dan");
		HP.InvestPhoneNumber("0803456789");
		HP.InvestComment("Testing phase 1");
		HP.InvestSubmit();
		String ActualText = HP.InvestSuccessText();
		String ExpectedText = "The form was sent successfully.";
		Assert.assertEquals(ActualText, ExpectedText);
		BaseClass.TearDown(driver);
	}

	@Test
	public void Verify_Theory_Of_Change_Download_Button() {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		HP.ClickTheoryOfChange();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> It = windows.iterator();
		String parentId = It.next();
		String ChildId = It.next();
		driver.switchTo().window(ChildId);

		String ActualURL = driver.getCurrentUrl();
		String CurrentURL = "https://babbangona.com/wp-content/uploads/2022/03/Theory-of-Change-2022.pdf";
		String ExpectedURL = CurrentURL;
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
	}

	@Test
	public void Verify_Meet_The_Team_Home_Page_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		String Text = HP.MeetTheTeamHomePage();
		String ExpectedHeader = "Leadership";
		Assert.assertEquals(Text, ExpectedHeader);
		BaseClass.TearDown(driver);

	}

	@Test
	public void Verify_Accelerate_Your_Career_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		String ActualHeader = HP.AccelerateCareerHome();
		String ExpectedHeader = "Careers";
		Assert.assertEquals(ActualHeader, ExpectedHeader);
		BaseClass.TearDown(driver);

	}

}
