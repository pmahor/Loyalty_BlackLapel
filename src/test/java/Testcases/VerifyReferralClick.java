package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ReferralClick;
import factory.BrowserFactory;


public class VerifyReferralClick 
{

	WebDriver driver;
	ReferralClick bitlyexec;

	@BeforeMethod
	public void setup()
	{
		driver=BrowserFactory.getBrowser("Chrome");
		driver.manage().window().maximize();
		bitlyexec=PageFactory.initElements(driver, ReferralClick.class);
	}
	

	@Test(priority=1)
	public void FacebookReferral()
	{
		bitlyexec.fbbitly();
	}
	
	@Test(priority=2)
	public void TwitterReferral()
	{
		bitlyexec.Twitterbitly();
	}
	
	@Test(priority=3)
	public void EmailReferral()
	{
		bitlyexec.Emailbitly();
	}
	
	
	
}
