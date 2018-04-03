package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SharingActivity;
import Pages.SocialLogin;
import factory.BrowserFactory;
import factory.Dataproviderfactory;


public class VerifySharingActivity
{
	
	WebDriver driver;
	SharingActivity sharingobj;
	SocialLogin SocialLoginobj;
	
	/*public VerifySharingActivity(WebDriver driver)
	{
		this.driver=driver;
		sharingobj=PageFactory.initElements(driver, SharingActivity.class);

	}*/
	
	
	@BeforeTest(description="This test case will verify Login Page")
	public void SetUp()
	{
		driver= BrowserFactory.getBrowser("Chrome");
		
		driver.manage().window().maximize();
		
		driver.get(Dataproviderfactory.getConfig().getUrl());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		SocialLoginobj=PageFactory.initElements(driver,SocialLogin.class);
		//Sharingactobj=PageFactory.initElements(driver,VerifySharingActivity.class);
		sharingobj=PageFactory.initElements(driver, SharingActivity.class);
			
	}
	
	@Test(priority=1)
	public void Fblogin()
	{
		SocialLoginobj.fblogin();
	}
	@Test(priority=2)
	public void Dashboardlogin()
	{
		SocialLoginobj.LoyaltyDashboard();
	}
	@Test(priority=3)
	public void Emailsharecheck()
	{
		sharingobj.EmailSharing();
	}
	
	

}
