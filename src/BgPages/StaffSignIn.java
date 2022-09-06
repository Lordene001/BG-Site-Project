package BgPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffSignIn {

	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'STAFF SIGN IN')]")
	WebElement StaffSignIn;
	
	@FindBy(xpath="//div[@class='zoho_logo ZohoSites']")
	WebElement ZohoLogo;
	
	@FindBy(css="#login_id")
	WebElement Email;
	
	@FindBy(css="#password")
	WebElement Password;
	
	@FindBy(css="#nextbtn")
	WebElement Next;
	
	@FindBy(xpath="//*[@id=\"nextbtn\"]/span")
	WebElement ZohoSignIn;
	
	
	
	public StaffSignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void StaffSignInButton() {
		StaffSignIn.click();
	}
	
	
	public boolean StaffSignInPage() {
		return ZohoLogo.isDisplayed();
	}
	
	public void Email(String email) {
		Email.sendKeys(email);
		Next.click();
	}
	
	public void Password(String password) {
		Password.sendKeys(password);
		ZohoSignIn.click();
	}
	
	
	
}
