package BgPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	
	WebDriver driver;
	
	@FindBy(xpath="(//ul/li/a[text()='ABOUT US'])[1]")
	WebElement AboutUs;
	
	@FindBy(css="(//ul/li/a[text()='Leadership'])[1]")
	WebElement Leadership;
	
	@FindBy(css="(//ul/li/a[text()='Who We Are'])[1]")
	WebElement WhoWeAre;
	
	

	
	public AboutUs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement AboutUs() {
		 return driver.findElement(By.xpath("(//ul/li/a[text()='ABOUT US'])[1]"));
	}
	
	public void Leadership() {
		 driver.findElement(By.xpath("//ul/li/a[text()='Leadership'])[1]")).click();
	}
	
	public void WhoWeAre() {
		 driver.findElement(By.xpath("//ul/li/a[text()='WhoWeAre'])[1]")).click();
	}
	
	

}
