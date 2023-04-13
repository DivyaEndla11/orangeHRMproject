package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageOfDashboard 
{
	
	WebDriver driver;
	

	By timeworkpanel=By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/button/i");
	By actionpanel=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div");
	By quicklaunchpanel=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div");
	By assignleave=By.xpath("//button[@title='Assign Leave']");
	By leavelist=By.xpath("//button[@title='Leave List']");
	By timesheet=By.xpath("//button[@title='Timesheets']");
	By applyleave=By.xpath("//button[@title='Apply Leave']");
	By myleave=By.xpath("//button[@title='My Leave']");
	By mytimesheet=By.xpath("//button[@title='My Timesheet']");
	By buzzpanel=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[4]/div/div[2]");
	By buzzid=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[4]/div/div[2]/div/div[1]/div");	
	By leavepanel=By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget emp-leave-chart']");
By leave_set=By.xpath("//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']");
By leave_configuration=By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");	
By configSubmit_btn=By.xpath("//button[@type='submit']");	
By message=By.xpath("//div[@class=\"oxd-toast-container oxd-toast-container--bottom\"]");
By subunit=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[6]/div");
By subunit_pie=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[6]/div/div[2]/div/div");
By bylocation=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[7]/div");
By location_pie=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[7]/div/div[2]/div/div");

	public PageOfDashboard(WebDriver driver)
{
	this.driver = driver;	

}


public void verifyTimeATWork()
{
	try 
	{
		WebElement dis=driver.findElement(timeworkpanel);
		boolean displayed=dis.isDisplayed();
		System.out.println("___________________________________________________________________________");
		System.out.println("TIME AT WORK PANEL displayed is "+displayed);
		System.out.println("___________________________________________________________________________");
		driver.findElement(timeworkpanel).click();
		driver.navigate().back();
	}
	catch (Exception e) 
	{
		System.out.println("Exception Caught" + e.getMessage());
	}
}

public void verifyMyActions()
{
	try 
	{
		WebElement dis=driver.findElement(actionpanel);
		boolean displayed=dis.isDisplayed();
		System.out.println("___________________________________________________________________________");
		System.out.println("ACTION PANEL displayed is "+displayed);
		System.out.println("___________________________________________________________________________");
	}
	catch (Exception e) 
	{
		System.out.println("Exception Caught" + e.getMessage());
	}
}

public void verifyQuickLaunch()
{
	try 
	{
		WebElement dis=driver.findElement(quicklaunchpanel);
		boolean displayed=dis.isDisplayed();
		System.out.println("___________________________________________________________________________");
		System.out.println("QUICK LAUNCH PANEL displayed is "+displayed);
		System.out.println("___________________________________________________________________________");
		driver.findElement(assignleave).click();
		driver.navigate().back();
		driver.findElement(leavelist).click();
		driver.navigate().back();
		driver.findElement(timesheet).click();
		driver.navigate().back();
		driver.findElement(applyleave).click();
		driver.navigate().back();
		driver.findElement(myleave).click();
		driver.navigate().back();
		driver.findElement(mytimesheet).click();
		driver.navigate().back();
	}
	catch (Exception e) 
	{
		System.out.println("Exception Caught" + e.getMessage());
	}
}

public void verifyBuzzLatestPosts()
{
	try 
	{
		WebElement dis=driver.findElement(buzzpanel);
		boolean displayed=dis.isDisplayed();
		System.out.println("___________________________________________________________________________");
		System.out.println("BuzzLatestPosts panel displayed is "+displayed);
		System.out.println("___________________________________________________________________________");
		driver.findElement(buzzid).click();
		driver.navigate().back();	
	}
	catch (Exception e) 
	{
		System.out.println("Exception Caught" + e.getMessage());
	}	
}


public void verifyEmployeesonLeaveToday()
{
	try 
	{
		WebElement dis=driver.findElement(leavepanel);
		boolean displayed=dis.isDisplayed();
		System.out.println("___________________________________________________________________________");
		System.out.println("Employees on Leave Today panel displayed is "+displayed);
		System.out.println("___________________________________________________________________________");
		//click on leave settings to change configurations
		driver.findElement(leave_set).click();
		//change configuration in configure dialog box
		driver.findElement(leave_configuration).click();
		driver.findElement(configSubmit_btn).click();
	}
	catch (Exception e) 
	{
		System.out.println("Exception Caught " + e.getMessage());
	}	
}

public void verifyEmployeeDistributionbySubUnit()
{
	try 
	{
		WebElement dis=driver.findElement(subunit);
		boolean displayed=dis.isDisplayed();
		System.out.println("___________________________________________________________________________");
		System.out.println("Employee Distribution by SubUnit panel displayed IS "+displayed);
		System.out.println("___________________________________________________________________________");
		WebElement ele=driver.findElement(subunit_pie);
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(10000);
	}
	catch (Exception e) 
	{
		System.out.println("Exception Caught" + e.getMessage());
	}	
}

public void verifyEmployeeDistributionbyLocation()
{
	try 
	{
		WebElement dis=driver.findElement(bylocation);
		boolean displayed=dis.isDisplayed();
		System.out.println("___________________________________________________________________________");
		System.out.println("Employee Distribution by location panel displayed is "+displayed);
		System.out.println("___________________________________________________________________________");
		WebElement ele=driver.findElement(location_pie);
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(10000);
	}
	catch (Exception e) 
	{
		System.out.println("Exception Caught" + e.getMessage());
	}	
}
}

