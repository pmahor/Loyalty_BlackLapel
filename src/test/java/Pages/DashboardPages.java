package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Library;

public class DashboardPages 
{
	WebDriver driver;
	@FindBy(xpath="") WebElement Dashboardpage;
	@FindBy(xpath="//div[@class='the-inner-circle-subnav']/div/ul/li[1]") WebElement dashboardlink;
	@FindBy(xpath="//div[@class='the-inner-circle-subnav']/div/ul/li[2]") WebElement Memberbeniftlink;
	@FindBy(xpath="//div[@class='the-inner-circle-subnav']/div/ul/li[3]") WebElement points_rewardlink;
	@FindBy(xpath="//div[@class='the-inner-circle-subnav']/div/ul/li[5]") WebElement Rewardlink;
	@FindBy(xpath="//div[@class='the-inner-circle-subnav']/div/ul/li[4]") WebElement Reviewslink;
	
	
	public DashboardPages(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void DashobardPage()
	{
		
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver,30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[1]")));
			driver.findElement((By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[1]"))).click();
			
			/*Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(dashboardlink));*/
			/*JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", dashboardlink);*/
			//dashboardlink.click();
			Thread.sleep(5000);
			Library.takescreensnap(driver, "Dashboard_Actions");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void MemberbeniftTab()
	{
		
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver,30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[2]")));
			driver.findElement((By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[2]"))).click();
			
			/*Thread.sleep(10000);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(Memberbeniftlink));*/
			
			/*JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", Memberbeniftlink);*/
			//Memberbeniftlink.click();
			Thread.sleep(5000);
			Library.takescreensnap(driver, "MemberbeniftTab");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void points_rewardtab()
	{
		
		try 
		{
			/*Actions action = new Actions(driver);

			action.moveToElement(driver.findElement(By.xpath("//div[@class='the-inner-circle-subnav sticky']/div/ul/li[3]"))).build().perform();
*/
			WebDriverWait wait = new WebDriverWait(driver,30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[3]")));
			driver.findElement((By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[3]"))).click();
			
			//Thread.sleep(10000);
			/*WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(points_rewardlink));*/
			
			/*JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", points_rewardlink);*/
			//points_rewardlink.click();
			Thread.sleep(5000);
			Library.takescreensnap(driver, "points_rewardtab");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void Rewardltab()
	{
		
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver,30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[5]")));
			driver.findElement((By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[5]"))).click();
			
			/*Thread.sleep(10000);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(Rewardlink));*/
			/*JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", Rewardlink);*/
			//Rewardlink.click();
			Thread.sleep(5000);
			Library.takescreensnap(driver, "Rewardtab");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void Rating_Reviews()
	{
		
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver,30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[4]")));
			driver.findElement((By.xpath("//div[@class='the-inner-circle-subnav']/div/ul/li[4]"))).click();
			
			/*Thread.sleep(10000);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(Rewardlink));*/
			/*JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", Rewardlink);*/
			//Rewardlink.click();
			Thread.sleep(5000);
			Library.takescreensnap(driver, "Rating&Reviews_tab");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
		
	
	
	
	

}
