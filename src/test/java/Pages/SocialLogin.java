package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Dataproviderfactory;

public class SocialLogin 
{
	WebDriver driver;
	
	
	@FindBy(xpath="//div[@class='header-mini-nav ember-view']/nav/ul/li[2]/p/a") WebElement loginbutton;
	//FB login
	@FindBy(xpath="//div[@class='social-login clearfix']/div[1]/a/div/picture/img") WebElement fbloginbutton;
	@FindBy(xpath="//input[@id='email']") WebElement fbemailaddr;
	@FindBy(xpath="//input[@id='pass']") WebElement fbpasswd;
	@FindBy(xpath="//input[@id='u_0_0']") WebElement fbloginbtn;
	
	//gmail Login
	@FindBy(xpath="//div[@class='social-login clearfix']/div[2]/a/div/picture/img") WebElement gmailloginbutton;
	@FindBy(xpath=".//*[@id='identifierId']") WebElement gmEmail; 
	@FindBy(xpath=".//*[@id='identifierNext']/content/span") WebElement gmnextbtn;
	
	@FindBy(xpath=".//*[@id='password']/div[1]/div/div[1]/input") WebElement passwd;
	@FindBy(xpath=".//*[@id='passwordNext']/content/span") WebElement gmnectbtn2;
	
	
	//logout & dashboard links
	@FindBy(xpath="//a[@class='my-account-link ember-view']") WebElement myaccoutnlink;
	@FindBy(xpath="//*[@id='nav-sub']/ul/li[2]/ul/li[6]/p/a") WebElement logoutlink;
	@FindBy(xpath="//*[@id='nav-sub']/ul/li[2]/ul/li[3]/p/a") WebElement dashboardlink;
	
	
	
	public SocialLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void fblogin()
	{
		try {
			Thread.sleep(5000);
			loginbutton.click();
			Thread.sleep(5000);
			fbloginbutton.click();
			
			Thread.sleep(5000);
			
			String parentwindow=driver.getWindowHandle();
			Set<String> windowhandles=driver.getWindowHandles();
			for(String windowhandl : windowhandles)
			{
				driver.switchTo().window(windowhandl);
			}
			
			fbemailaddr.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,0));
			fbpasswd.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,1));
			fbloginbtn.click();
			
			Thread.sleep(5000);
			System.out.println("Fb loggedin successfully");
			
			driver.switchTo().window(parentwindow);
			
			
		}
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	
	public void logout()
	{
		try 
		{
			Thread.sleep(5000);
			
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
			System.out.println("Clicking on logout link");
			myaccoutnlink.click();
			
			logoutlink.click();
			//Actions action=new Actions(driver) ;
		//	action.moveToElement(myaccoutnlink);
		//	Thread.sleep(10000);
			//action.moveToElement(logoutlink).click();
			System.out.println("Clicked on logout link");
				
	}
	
	public void Gmail_Login()
	{
		try
		{
			Thread.sleep(5000);
			loginbutton.click();
			Thread.sleep(5000);
			
			gmailloginbutton.click();
			Thread.sleep(5000);
			
			String parentwindow=driver.getWindowHandle();
			Set<String> windowhandles= driver.getWindowHandles();
			for (String windowhandl : windowhandles) 
			{
				driver.switchTo().window(windowhandl);
			}
			
			
			gmEmail.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,0));
			gmnextbtn.click();
			
			Thread.sleep(5000);
			
			passwd.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,3));
			gmnectbtn2.click();
			
			System.out.println("Gmail Logged in successfully");
			
			driver.switchTo().window(parentwindow);			
			
		} 
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
		
	}
	
	public void LoyaltyDashboard()
	{
		try 
		{
			Thread.sleep(10000);
		
		System.out.println("Move to Dashboard");
		myaccoutnlink.click();
		
		Thread.sleep(5000);
		dashboardlink.click();
		
		} 
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
		
		
	}
	

}
