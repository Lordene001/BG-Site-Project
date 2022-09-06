package BgTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BgPages.StaffSignIn;

public class StaffSignInTest {

	@Test
	public void VerifyStaffSignInButton() {
		WebDriver driver = BaseClass.SetUp();
		StaffSignIn SS = new StaffSignIn(driver);
		SS.StaffSignInButton();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> OP = windows.iterator();	
		String ParentId = OP.next();
		String ChildId = OP.next();
		driver.switchTo().window(ChildId);
		
		boolean Logo =  SS.StaffSignInPage();
		Assert.assertTrue(Logo);
		
		SS.Email("Emmanuel@gmail.com");
		SS.Password("Password");
		
		BaseClass.TearDown(driver);
		
		
	}
	
}
