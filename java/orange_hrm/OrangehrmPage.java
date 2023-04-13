package orange_hrm;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangehrmPage {

	WebDriver driver;
	
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login_btn = By.xpath("//button[@type='submit']");
	

	public OrangehrmPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public void loginusername(String uname) {

		try {
			driver.findElement(username).sendKeys(uname);
		} catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}

	public void login_pass_word(String pword) 
	{
		try 
		{
			driver.findElement(password).sendKeys(pword);
			driver.findElement(login_btn).click();
			String title = driver.getTitle();
			System.out.println(title);
			assertEquals(title, "OrangeHRM");
			Thread.sleep(10000);
		} 
		catch (Exception e)
		{
			System.out.println("Exception Caught" + e.getMessage());
		}
	}

}
