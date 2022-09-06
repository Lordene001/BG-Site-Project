package BgPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Press {

	WebDriver driver;
	
	@FindBy(css="a[class='elementor-button-link elementor-button ']")
	WebElement NewsAndReportLoadMore;
	
	@FindBy(xpath="//p[normalize-space()='Reports']")
	WebElement AnnualReport;
	
	@FindBy(xpath="//a[normalize-space()='View All']")
	WebElement BlogViewAll;
	
	@FindBy(xpath="//article[5]//div[1]//div[1]//div[2]//a[1]")
	WebElement ReadMore;

	
	public Press (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void LoadMoreNews() {
		NewsAndReportLoadMore.click();
	}
	
	public boolean AnnualReportTitle() {
		return AnnualReport.isDisplayed();
	}
	
	public void BlogViewAll() throws InterruptedException {
		BlogViewAll.click();
		Thread.sleep(1000);
		ReadMore.click();
		
	}
	
	
	
	
}
