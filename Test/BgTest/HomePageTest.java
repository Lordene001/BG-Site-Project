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
	public void VeriifyHomePageLogo() {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		boolean Logo = HP.ValidateLogo();
		Assert.assertTrue(Logo);
		BaseClass.TearDown(driver);
	}

	@Test
	public void VerifyHomePageVideo() {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		boolean Video = HP.VerifyHomePagevideo();
		Assert.assertTrue(Video);
		BaseClass.TearDown(driver);
	}

	@Test
	public void VerifyNewsLetter() {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		HP.NewsLetter();
		String ActualMessage = HP.NewsLetterSubcribeMessage();
		String ExpectedMessage = "You have successfully subscribed for the newsletter";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		BaseClass.TearDown(driver);
	}

	@Test
	public void VerifyJoinTheMovement() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		String ActualHeader = HP.JoinTheMovement();
		String ExpectedHeader = "Community";
		Assert.assertEquals(ActualHeader, ExpectedHeader);
		BaseClass.TearDown(driver);

	}

	@Test
	public void VerifyInvestInTheMovement() {
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
	public void VerifyTheoryOfChangeDownloadButton() {
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
	public void VerifyMeetTheTeamHomePageButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		String Text = HP.MeetTheTeamHomePage();
		String ExpectedHeader = "Leadership";
		Assert.assertEquals(Text, ExpectedHeader);
		BaseClass.TearDown(driver);

	}

	@Test
	public void VerifyAccelerateYourCareerButton() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		HomePage HP = new HomePage(driver);
		String ActualHeader = HP.AccelerateCareerHome();
		String ExpectedHeader = "Careers";
		Assert.assertEquals(ActualHeader, ExpectedHeader);
		BaseClass.TearDown(driver);

	}

}
