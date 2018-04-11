package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DashboardPages;
import Pages.SocialLogin;
import factory.BrowserFactory;
import factory.Dataproviderfactory;

public class VerifyDashboardpage 
{
	WebDriver driver;
	DashboardPages dashboardobj;
	SocialLogin SocialLoginobj;

	@BeforeTest
	public void setup()
	{
		driver=BrowserFactory.getBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get(Dataproviderfactory.getConfig().getUrl());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dashboardobj=PageFactory.initElements(driver, DashboardPages.class);
		SocialLoginobj=PageFactory.initElements(driver,SocialLogin.class);
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
	public void MemberBenefit_Tab()
	{
		dashboardobj.MemberbeniftTab();
	}
	
	@Test(priority=4)
	public void Dashboard_Tab()
	{
		dashboardobj.DashobardPage();
	}
	
	@Test(priority=5)
	public void Pointsreward_Tab()
	{
		dashboardobj.points_rewardtab();
		
	}
	
	@Test(priority=6)
	public void Reward_Tab()
	{
		dashboardobj.Rewardltab();
		
	}
	
	@Test(priority=7)
	public void Reviews_Tab()
	{
		dashboardobj.Rating_Reviews();
		
	}
	
	


}
