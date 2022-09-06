package BgPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careers {

WebDriver driver;
	
	@FindBy(css="ul[id='menu-1-3087fe9e'] a[class='elementor-item menu-link']")
	WebElement Career;
	
	@FindBy(xpath="//h2[normalize-space()='Propel your career with Babban Gona']")
	WebElement CareerPageText;
	
	@FindBy(xpath="(//a[@role='button'])[3]")
	WebElement CheckOpenings1;
	
	@FindBy(xpath="(//a[@role='button'])[4]")
	WebElement CheckOpenings2;
	
	@FindBy(xpath="(//a[@role='button'])[5]")
	WebElement CheckOpenings3;
	
	@FindBy(xpath="(//a[@role='button'])[6]")
	WebElement CheckOpenings4;
	
	@FindBy(css="a[href='/candidateportal?source=career']")
	WebElement SignIn;
	
	@FindBy(name="username")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(css="#submit")
	WebElement SignInButton;
	
	@FindBy(xpath="//*[@id=\"portalBckSignIn\"]/a")
	WebElement CreatAnAccount;
	
	@FindBy(xpath="//h3[normalize-space()='Autofill Application']")
	WebElement CreatAnAccountPageText;
	
	@FindBy(id="forgotPassLink")
	WebElement ForgotPassword;
	
	@FindBy(name ="recovery")
	WebElement ForgotPasswordEmailOrName;
	
	@FindBy(xpath ="(//li/a[text()='Register'])[2]")
	WebElement Register;
	
	
	

	
	
	
	public Careers(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	public String CareerButton() throws InterruptedException {
		Career.click();
		Thread.sleep(500);
		return CareerPageText.getText();
	} 
	
	public void Openings() {
		Career.click();
		CheckOpenings2.click();
	}
	
	public void SignIn1() throws InterruptedException {
		Career.click();
		CheckOpenings3.click();
		SignIn.click();
		Thread.sleep(500);
	}
	
	public void SignInEmail(String EnterEmail) {
		Email.sendKeys(EnterEmail);
	}
	
	
	public void SignInPassword(String EnterPassword) {
		Password.sendKeys(EnterPassword);
	}
	
	public void SignInSubmit() {
		SignInButton.click();
	}
	
	public String CreateAnAccount() throws InterruptedException {
		CreatAnAccount.click();
		Thread.sleep(1000);
		return CreatAnAccountPageText.getText();
	}
	
	public void ForgotPasswordButton() throws InterruptedException {
		ForgotPassword.click();
	}
	
	public void ForgotPasswordEmailOrName(String NameOrEmail) throws InterruptedException {
		ForgotPasswordEmailOrName.sendKeys(NameOrEmail);
	}
	
	public void RegisterButton() {
		Register.click();
	}
	
	
}
