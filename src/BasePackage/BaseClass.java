package BasePackage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {

	static WebDriver driver;

	/*
	public static WebDriver SetUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bglag\\Desktop\\selenium hood\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://babbangona.com/");
		return driver;
	}
	*/

	public static WebDriver SetUp() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://babbangona.com/");
		return driver;
	}
	

	public static void TearDown(WebDriver driver) {
		driver.quit();
	}

}
