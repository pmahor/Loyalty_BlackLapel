package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BrowserFactory;
import factory.Dataproviderfactory;
import utility.Library;

public class SharingActivity 
{
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='email_s2_divEmDirect']/input") WebElement Emailsharetextbx;
	@FindBy(xpath="//div[@id='email_s2_divEmDirect']/input[2]") WebElement Esharebtn;
	
	//close btn
	@FindBy(xpath="//*[@id='sa_social_popup_close']") WebElement thankpopupclosebtn;
	
	// FB sharing
	@FindBy(xpath="//*[@id='s2-fb-share-button']") WebElement Fbsharebtn;
	@FindBy(xpath="//input[@id='email']") WebElement fbemailaddr;
	@FindBy(xpath="//input[@id='pass']") WebElement fbpasswd;
	@FindBy(xpath="//input[@id='u_0_0']") WebElement fbloginbtn;
	
		
	public SharingActivity(WebDriver driver)
	{
		this.driver=driver;
	}
	
//........................Email Sharing.......................................................
	
	public void EmailSharing()
	{
		try 
		{
			Thread.sleep(5000);
			driver.switchTo().frame("s2-main-iframe");
			Thread.sleep(5000);
			Emailsharetextbx.sendKeys(Dataproviderfactory.getExceldata().getStringData(1,0));
			Thread.sleep(5000);
			Esharebtn.click();
			System.out.println("Email shared successfully.............");
			
			Thread.sleep(5000);
			Library.takescreensnap(driver, "EmailShare_Thankyoupopup");
			//closing thank you popup
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",thankpopupclosebtn);
			
		}
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}	
		
	}
//................Facebook Sharing.................................................................................
	
	public void FbSharing()
	{
		try
		{
			Thread.sleep(5000);
		//	driver.switchTo().frame("s2-main-iframe");
			System.out.println("moved on frame");
			Thread.sleep(5000);
			Fbsharebtn.click();
			Thread.sleep(5000);
			
			// below code needed if facebook is not logged in
			
			//String parentwindow=driver.getWindowHandle();
			/*Set<String> windowhandles=driver.getWindowHandles();
			for(String windowhandl : windowhandles)
			{
				driver.switchTo().window(windowhandl);
			}
			
			fbemailaddr.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,0));
			fbpasswd.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,1));
			fbloginbtn.click();
			
			Thread.sleep(5000);
			System.out.println("Fb loggedin successfully");
			
			driver.switchTo().window(parentwindow);*/
			Thread.sleep(5000);
			System.out.println("Clicking on feedbox popup............................");
			Library.takescreensnap(driver, "FBShare_feedboxpopup");
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".FB_UI_Dialog")));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",driver.findElement(By.name("__CONFIRM__")));
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("s2-main-iframe")));
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='sa_social_popup_close']")));
					
			Thread.sleep(5000);
			//to close thank you popup
			Library.takescreensnap(driver, "FacebookShare_Thankyoupopup");
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", thankpopupclosebtn);
			//thankpopupclosebtn.click();
			
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
			
	}
	
	//........................................Twitter Sharing...........................................................
	
	@FindBy(xpath="//*[@id='s2-tw-share-button']") WebElement twsharebtn;
	@FindBy(xpath="//input[@id='username_or_email']") WebElement tweetEmail;
	@FindBy(xpath="//input[@id='password']") WebElement tweetpass;
	@FindBy(xpath="//input[@id='allow']") WebElement tweetloginbtn;
	
	
	public void twSharing()
	{
		try 
		{
			Thread.sleep(5000);
		//	driver.switchTo().frame("s2-main-iframe");
			
		Thread.sleep(5000);	
		twsharebtn.click();
		String parentwindow=driver.getWindowHandle();
		Set<String> winHandles=driver.getWindowHandles();
		for(String winHandl : winHandles)
		{
			driver.switchTo().window(winHandl);
		}
		
		Thread.sleep(5000);
		Library.takescreensnap(driver, "TwitterShare_loginpopup");
		
		tweetEmail.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,0));
		tweetpass.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,2));
		tweetloginbtn.click();
		System.out.println("Twitter loggedin successful..................");
		
		driver.switchTo().window(parentwindow);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("s2-main-iframe")));
		
		Thread.sleep(5000);
		//to close thank you popup
		Library.takescreensnap(driver, "TwitterShare_Thankyoupopup");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", thankpopupclosebtn);
		
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@FindBy(xpath="//*[@id='s2_personBitlyForm_submit']") WebElement cpylinkbtn;
	@FindBy(xpath="//*[@id='s2_bitlyurlText']") WebElement cpylinktxt;
	
	
	
	public void bitlyshare()
	{
		try 
		{
			
			Thread.sleep(5000);
			//driver.switchTo().frame("s2-main-iframe");
			System.out.println("moved on frame");
			Thread.sleep(5000);
						
			cpylinkbtn.click();
			String bitlytext = cpylinktxt.getAttribute("value");
			System.out.println("Bitly text="+bitlytext);
			
			driver= BrowserFactory.getBrowser("Chrome");
			
			driver.manage().window().maximize();
			
			driver.get(bitlytext);
			
			Thread.sleep(5000);
			Library.takescreensnap(driver, "UnlockcodePage_AfterBiltyExec");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
			
	}
	
	@FindBy(xpath="//*[@id='sa_s2_your_emailSend']") WebElement unlockemail;
	@FindBy(xpath="//*[@id='codSendEmailRS']") WebElement unlocksubbtn;
	
	public void unlockcode()
	{
		try 
		{
			Thread.sleep(5000);
			System.out.println("Title="+driver.getCurrentUrl());
								
			Thread.sleep(5000);
			
			driver.switchTo().frame("s2-main-iframe");
			Thread.sleep(5000);
			System.out.println("moved on frame");
			
			Thread.sleep(5000);
			//unlockemail.sendKeys("testestestes1232@gmail.com");
			
			//For passing values to textbox on unlock code popup
			
			JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
			myExecutor.executeScript("arguments[0].value='testestestes1232@gmail.com';", unlockemail);
					
			Thread.sleep(5000);
			unlocksubbtn.click();
			
			Library.takescreensnap(driver, "Coupon_code");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
}
