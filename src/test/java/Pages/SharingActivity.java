package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Dataproviderfactory;

public class SharingActivity 
{
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='email_s2_divEmDirect']/input") WebElement Emailsharetextbx;
	@FindBy(xpath="//div[@id='email_s2_divEmDirect']/input[1]") WebElement Esharebtn;
	/*@FindBy(xpath="") WebElement Esharebtn;
	@FindBy(xpath="") WebElement Esharebtn;
	@FindBy(xpath="") WebElement Esharebtn;
	@FindBy(xpath="") WebElement Esharebtn;
	@FindBy(xpath="") WebElement Esharebtn;
	@FindBy(xpath="") WebElement Esharebtn;
	@FindBy(xpath="") WebElement Esharebtn;
*/
	public SharingActivity(WebDriver driver)
	{
		this.driver=driver;
	}
	
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
			
		}
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
		
		
		
	}
}
