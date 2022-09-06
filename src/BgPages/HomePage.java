package BgPages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.BaseClass;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='elementor-element elementor-element-63360b64 exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-heading']//h2[@class='elementor-heading-title elementor-size-default'][normalize-space()='Everyone deserves an opportunity to prosper']")
	WebElement Video;
	
	@FindBy(xpath = "//h4[normalize-space()='info@babbangona.com']")
	WebElement BgEmail;
	
	@FindBy(xpath = "//input[@id='form-field-name']")
	WebElement NewsLetterName;
	
	@FindBy(xpath = "//input[@id='form-field-email']")
	WebElement NewsLetterEmail;
	
	@FindBy(xpath = "//button[@id='newsletter-btn']")
	WebElement NewsLetterSubscribeBtn;
	
	@FindBy(xpath="(//img[@class='attachment-full size-full'])[1]")
	WebElement logo;
	
	@FindBy(css="div[class='elementor-message elementor-message-success']")
	WebElement NewsLetterSubcribeAlert;
	
	@FindBy(xpath="//a[@href='https://babbangona.com/wp-content/uploads/2022/03/Theory-of-Change-2022.pdf']")
	WebElement DownloadTheoryOfChange;
	
	@FindBy(xpath="//h3[@class='elementor-heading-title elementor-size-default']//a[normalize-space()='join the movement']")
	WebElement JoinTheMovement;
	
	@FindBy(xpath="//div[@class='elementor-element elementor-element-d497378 exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-heading']//h2[@class='elementor-heading-title elementor-size-default'][normalize-space()='Community']")
	WebElement JoinTheMovementPageHeader;
	
	@FindBy(xpath="//div[@class='elementor-element elementor-element-d37db96 exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-heading']")
	WebElement InvestInTheMOvementButton;
	
	@FindBy(xpath="(//input[@id='form-field-email'])[1]")
	WebElement InvestEmail;
	
	@FindBy(xpath="(//input[@id='form-field-name'])[1]")
	WebElement InvestOrganizationName;
	
	@FindBy(xpath="//input[@id='form-field-field_874a853']")
	WebElement InvestFullName;
	
	@FindBy(css="#form-field-message")
	WebElement InvestPhoneNumber;
	
	@FindBy(css="#form-field-field_a6b2989")
	WebElement InvestComment;
	
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement InvestSubmit;
	
	@FindBy(css="div[role='alert']")
	WebElement InvestSuccessText;
	
	@FindBy(css=".elementor-element.elementor-element-e6ddb3b.exad-sticky-section-no.exad-glass-effect-no.elementor-widget.elementor-widget-heading")
	WebElement AccelerateCareer;
	
	@FindBy(css="h1[class='elementor-heading-title elementor-size-default']")
	WebElement AccelerateCareerPageText;
	
	@FindBy(css="a[href='https://babbangona.com/leadership/']")
	WebElement MeetTheTeam;
	
	@FindBy(css="h2[class='elementor-heading-title elementor-size-default']")
	WebElement MeetTheTeamPageText;
	
	
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void NewsLetter() {
		System.out.println(NewsLetterName);
		NewsLetterName.sendKeys("Tim");
		NewsLetterEmail.sendKeys("Tim123@gmail.com");
		NewsLetterSubscribeBtn.click();
	}
	
	public String NewsLetterSubcribeMessage() {
		return NewsLetterSubcribeAlert.getText();
	}
	
	public boolean VerifyHomePagevideo() {
		Video.isDisplayed();
		return true;
	}
	
	public String JoinTheMovement() throws InterruptedException {
		JoinTheMovement.click();
		Thread.sleep(1000);
		return JoinTheMovementPageHeader.getText();
	}
	
	
	public boolean ValidateLogo() {
		logo.isDisplayed();
		return true;
	}
	
	public  void ClickTheoryOfChange(){
		DownloadTheoryOfChange.click();
		}
	
	public void ClickInvestInTheMOvementButton() {
		InvestInTheMOvementButton.click();
	}
		
	public void InsvestEmail(String Email) {
		InvestEmail.sendKeys(Email);
	}
	
	public void InvestOrganizationName(String OGName) {
		InvestOrganizationName.sendKeys(OGName);
	}
	
	public void InvestFullName(String FullName) {
		InvestFullName.sendKeys(FullName);
	}
	
	public void InvestPhoneNumber(String PhoneName) {
		InvestPhoneNumber.sendKeys(PhoneName);
	}
	
	public void InvestComment(String Comment) {
		InvestComment.sendKeys(Comment);
	}
	
	public void InvestSubmit() {
		InvestSubmit.click();
	}

	public String InvestSuccessText() {
		return InvestSuccessText.getText();
	}
	
	public String AccelerateCareerHome() throws InterruptedException {
		AccelerateCareer.click();
		Thread.sleep(1000);
		return AccelerateCareerPageText.getText();
	}
	
	public String MeetTheTeamHomePage() throws InterruptedException {
		MeetTheTeam.click();
		Thread.sleep(1000);
		return MeetTheTeamPageText.getText();
	}
	
}
