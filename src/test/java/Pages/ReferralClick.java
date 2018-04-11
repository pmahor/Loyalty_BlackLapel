package Pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BrowserFactory;
import factory.Dataproviderfactory;
import utility.Library;

public class ReferralClick
{
	WebDriver driver;

	@FindBy(id="email") WebElement emailaddr;
	@FindBy(id="pass") WebElement emailpass;
	@FindBy(id="loginbutton") WebElement loginbtn;
	@FindBy(xpath="//a[@title='Profile']") WebElement fbprofile; 
  //@FindBy(xpath="//div[@id='u_ps_0_0_3']/div/div[2]/span/div/a") WebElement fbbitly;
	@FindBy(css="a._52c6") WebElement fbbitly;
	
	
	
	public ReferralClick(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//*[@id='sa_s2_your_emailSend']") WebElement unlockemail;
	@FindBy(xpath="//*[@id='codSendEmailRS']") WebElement unlocksubbtn;
	public void fbbitly()
	{
		try 
		{
		Thread.sleep(5000);	
					
		System.out.println("login to facebook");
		driver.get(Dataproviderfactory.getConfig().getfbUrl());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);		
		
		emailaddr.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,0));
		//loyaltprog=PageFactory.initElements(driver, LoyaltyProgram.class);
		emailpass.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,1));
		loginbtn.click();
		
		Thread.sleep(10000);
		fbprofile.click();
		Thread.sleep(10000);
		fbbitly.click();
		Thread.sleep(10000);
		
		//To take screenshot after bitly execution
		String parentwindow=driver.getWindowHandle();
		Set<String> winHandles=driver.getWindowHandles();
		for(String winHandl : winHandles)
		{
			driver.switchTo().window(winHandl);
		}
		Thread.sleep(5000);
		Library.takescreensnap(driver, "Dashboard");
		System.out.println("Facebook Bitly Execution Completed......................");
			
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("s2-main-iframe");
		Thread.sleep(5000);
		System.out.println("moved on frame");
		
		Thread.sleep(5000);
		
		JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
		myExecutor.executeScript("arguments[0].value='te125stes1232@gmail.com';", unlockemail);
		
		//unlockemail.sendKeys("testestestes1232@gmail.com");
		Thread.sleep(5000);
		unlocksubbtn.click();
		Thread.sleep(10000);
		
		Library.takescreensnap(driver, "Coupon_code");
		
		System.out.println("Screenshot of coupon code was captured");
		
		BrowserFactory.closeBrowser();
		
		}
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}		
	}
	
	@FindBy(xpath="//input[@class='js-username-field email-input js-initial-focus']") WebElement TwEmail; 
	@FindBy(xpath="//input[@class='js-password-field']") WebElement Twpass;
	@FindBy(xpath="//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']") WebElement Twloginbtn;
	
	@FindBy(xpath="//a[@class='ProfileCardStats-statLink u-textUserColor u-linkClean u-block js-nav js-tooltip']") WebElement Twprofilelink;
	@FindBy(xpath="//span[contains(.,'goo.gl/Di4zjt')]") WebElement Twitbitlyclick ;
	
	
	public void Twitterbitly()
	{
		try
		{
			Thread.sleep(5000);	
						
			System.out.println("clicking on twitterbitly");
			driver.get(Dataproviderfactory.getConfig().getTwitterUrl());
			Thread.sleep(10000); 
			
			/*Set<String> winHandles1=driver.getWindowHandles();
			for(String winHandl : winHandles1)
			{
				driver.switchTo().window(winHandl);
			}*/
			
			TwEmail.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,0));
			Twpass.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,2));
			Twloginbtn.click();
			Thread.sleep(10000);
			
			Twprofilelink.click();
			Thread.sleep(10000);
			Twitbitlyclick.click();
			
			Thread.sleep(10000);
			
			//To take screenshot after bitly execution
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				driver.switchTo().window(winHandl);
			}
			Thread.sleep(5000);
			Library.takescreensnap(driver, "DashboardTwitterbitlyrun");
			System.out.println("Twitter Bitly Execution Completed......................");
				
			
			Thread.sleep(5000);
			
			driver.switchTo().frame("s2-main-iframe");
			Thread.sleep(5000);
			System.out.println("moved on frame");
			
			Thread.sleep(5000);
			
			JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
			myExecutor.executeScript("arguments[0].value='123testeftes1232@gmail.com';", unlockemail);
			
			//unlockemail.sendKeys("testestestes1232@gmail.com");
			Thread.sleep(5000);
			unlocksubbtn.click();
			Thread.sleep(10000);
			
			Library.takescreensnap(driver, "Twittershared_Coupon_code");
			
			System.out.println("Screenshot of coupon code was captured");
			
			 BrowserFactory.closeBrowser();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@FindBy(xpath=".//*[@id='identifierId']") WebElement gmEmail; 
	@FindBy(xpath=".//*[@id='identifierNext']/content/span") WebElement gmnextbtn;
	
	@FindBy(xpath=".//*[@id='password']/div[1]/div/div[1]/input") WebElement passwd;
	@FindBy(xpath=".//*[@id='passwordNext']/content/span") WebElement gmnectbtn2;
	
	//promotional tab link
	//@FindBy(xpath="//div[@id=':l9']") WebElement promail;
	//@FindBy(xpath="//span[@id=':g1']") WebElement mailclick;
	
	@FindBy(xpath="//*[@id=':3d']/b") WebElement frndsmailclick;
	@FindBy(xpath="//*[@id=':k9']/table/tbody/tr[4]/td/table/tbody/tr[4]/td/a]") WebElement Redmbtnclick;
	
	
	public void Emailbitly()
	{
		try 
		{				
			System.out.println("clicking on emailbitly");
			driver.get(Dataproviderfactory.getConfig().getGmailUrl());
			
			Thread.sleep(10000);
			
			gmEmail.sendKeys(Dataproviderfactory.getExceldata().getStringData(1,0));
			gmnextbtn.click();
			Thread.sleep(10000);
			
			passwd.sendKeys(Dataproviderfactory.getExceldata().getStringData(1,1));
			gmnectbtn2.click();
			Thread.sleep(5000);
			
			frndsmailclick.click();
			Thread.sleep(10000);
			
			
			Thread.sleep(10000);
			Redmbtnclick.click();
			
			Thread.sleep(5000);
			
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				driver.switchTo().window(winHandl);
			}
			
			
			
			Thread.sleep(5000);
			Library.takescreensnap(driver, "DashboardTwitterbitlyrun");
			System.out.println("Email Bitly Execution Completed......................");
				
			
			Thread.sleep(5000);
			
			driver.switchTo().frame("s2-main-iframe");
			Thread.sleep(5000);
			System.out.println("moved on frame");
			
			Thread.sleep(5000);
			
			JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
			myExecutor.executeScript("arguments[0].value='1tefgdgsteftes1232@gmail.com';", unlockemail);
			
			//unlockemail.sendKeys("testestestes1232@gmail.com");
			Thread.sleep(5000);
			unlocksubbtn.click();
			Thread.sleep(10000);
			
			Library.takescreensnap(driver, "Emailshared_Coupon_code");
			
			System.out.println("Screenshot of coupon code was captured");
						
				
		} 
		catch (InterruptedException e)
		{				
				e.printStackTrace();
		}
		
		}
	
}
