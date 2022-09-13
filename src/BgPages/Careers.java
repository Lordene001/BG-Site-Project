package BgPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careers {

	WebDriver driver;

	@FindBy(css = "ul[id='menu-1-3087fe9e'] a[class='elementor-item menu-link']")
	WebElement Career;

	@FindBy(xpath = "//h2[normalize-space()='Propel your career with Babban Gona']")
	WebElement CareerPageText;

	@FindBy(xpath = "(//a[@role='button'])[3]")
	WebElement CheckOpenings1;

	@FindBy(xpath = "(//a[@role='button'])[4]")
	WebElement CheckOpenings2;

	@FindBy(xpath = "(//a[@role='button'])[5]")
	WebElement CheckOpenings3;

	@FindBy(xpath = "(//a[@role='button'])[6]")
	WebElement CheckOpenings4;

	@FindBy(css = "a[href='/candidateportal?source=career']")
	WebElement SignIn;

	@FindBy(name = "username")
	WebElement Email;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(css = "#submit")
	WebElement SignInButton;

	@FindBy(xpath = "//*[@id=\"portalBckSignIn\"]/a")
	WebElement CreatAnAccount;

	@FindBy(xpath = "//h3[normalize-space()='Autofill Application']")
	WebElement CreatAnAccountPageText;

	@FindBy(id = "forgotPassLink")
	WebElement ForgotPassword;

	@FindBy(name = "recovery")
	WebElement ForgotPasswordEmailOrName;

	@FindBy(xpath = "(//li/a[text()='Register'])[2]")
	WebElement Register;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement SignUpEmail;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement SignUpPassword1;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement SignUpPassword2;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement SignUp_FirstName;

	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")   
	WebElement SignUp_LastName;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement Mobile;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement Street;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement City;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement StateProvince;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement ZipCode;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")  
	WebElement Country;
	
	@FindBy(xpath = "//lyte-input[@type='text']")  
	WebElement Skill_Set1;
	
	@FindBy(xpath = "//li[normalize-space()='web development']")  
	WebElement Skill_Set2;
	
	@FindBy(xpath = "//form[contains(@submit,'portal-manual-apply => submit(event)')]")  
	WebElement Skill_Set3;
	
	@FindBy(xpath = "(//div/div/a[text()='Add'])[1]")  
	WebElement EducationAddBtn;
	
	@FindBy(xpath = "(//a[normalize-space()='Add More'])[1]")  
	WebElement EducationAddMoreBtn;
	
	@FindBy(xpath = "(//div/a[text()='Delete'])[2]")  
	WebElement EducationDeleteBtn;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")  
	WebElement EducationInstitution;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[12]")  
	WebElement EducationDepartment;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[13]")  
	WebElement EducationDegree;
	
	@FindBy(xpath = "(//div/div/a[text()='Add'])[1]")  
	WebElement ExperienceAddBtn;
	
	@FindBy(xpath = "//*[@id=\"595887000000311154_1_tab\"]/div/input")  
	WebElement ExperienceTitle;
	
	@FindBy(xpath = "//*[@id=\"595887000000311156_1_tab\"]/div/input")    
	WebElement ExperienceCompany;
	
	@FindBy(xpath = "//*[@id=\"595887000000311158_1_tab\"]/div/textarea")  
	WebElement ExperienceSummary;
	
	@FindBy(xpath = "//*[@id=\"595887000000311162_1_tab\"]/label/span")  
	WebElement ExperienceCuurentlyWorkHere;
	
	@FindBy(xpath = "(//lyte-file-message/span[text()='Browse'])")  
	WebElement ResumeBtn;
	
	

	public Careers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String CareerButton() throws InterruptedException {
		Career.click();
		Thread.sleep(1000);
		return CareerPageText.getText();
	}

	public void Openings() throws InterruptedException {
		Career.click();
		Thread.sleep(500);
		CheckOpenings2.click();
	}

	public void SignIn1() throws InterruptedException {
		Career.click();
		Thread.sleep(500);
		CheckOpenings2.click();
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

	public void SignUpEmail(String SignUpemail) {
		SignUpEmail.sendKeys(SignUpemail);
	}

	public void SignUpPassword(String SignUpepassword) {
		SignUpPassword1.sendKeys(SignUpepassword);
		SignUpPassword2.sendKeys(SignUpepassword);
	}
	
	public void SignUp_FirstName(String FirstName) {
		SignUp_FirstName.sendKeys(FirstName);
	}

	public void SignUp_LastName(String LastName) {
		SignUp_LastName.sendKeys(LastName);
	}
	
	public void SignUpMobile(String MobileNumber) {
		Mobile.sendKeys(MobileNumber);
	}
	
	public void SignUpStreet(String SignUpStreet) {
		Street.sendKeys(SignUpStreet);
	}
	
	public void SignUpCity(String SignUpCity) {
		City.sendKeys(SignUpCity);
	}
	
	public void SignUpStateProvince(String SignUpeStateProvince) {
		StateProvince.sendKeys(SignUpeStateProvince);
	}
	
	public void SignUpZipCode(String SignUpZipCode) {
		ZipCode.sendKeys(SignUpZipCode);
	}
	
	public void SignUpCountry(String SignUpCountry) { 
		Country.sendKeys(SignUpCountry);
	}
	
	public void SignUpSkillSet() throws InterruptedException { 
		Skill_Set1.sendKeys("Web Development");
		Skill_Set2.click();
		Skill_Set3.click();
		
	}
	
	public void Education1(String Institution) throws InterruptedException {
		EducationAddBtn.click();
		EducationAddMoreBtn.click();
		EducationDeleteBtn.click();
		EducationInstitution.sendKeys(Institution);	
	}
	
	public void Education2(String Department) {
		EducationDepartment.sendKeys(Department);
	}
	
	public void Education3(String Degree) throws InterruptedException {
		EducationDegree.sendKeys(Degree);
		Thread.sleep(1000);
	}
	
	public void Experience1(String JobTitle) throws InterruptedException {
		ExperienceAddBtn.click();
		//Thread.sleep(5000);
		ExperienceTitle.sendKeys(JobTitle);
	}
	
	public void Experience2(String CompanyName) {
		ExperienceCompany.sendKeys(CompanyName);
	}
	
	public void Experience3(String JobSummary) {
		ExperienceSummary.sendKeys(JobSummary);
	}
	
	public void Experience4() {
		ExperienceCuurentlyWorkHere.click();
	}
	

	public void ResumeUpload() {
		ResumeBtn.click();
	}
		
	

}
