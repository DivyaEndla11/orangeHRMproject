package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Directory_page 
{
	WebDriver driver;
	public Directory_page(WebDriver driver)
	{
		this.driver = driver;
	}

	By directoryOpt= By.xpath("//a[@href='/web/index.php/directory/viewDirectory']");
	By directory_table=By.xpath("//div[@class='oxd-table-filter']");
	By records_after_search=By.xpath("//div[@class='orangehrm-paper-container']");
	By type_for_hint_box=By.xpath("//input[@placeholder='Type for hints...']");
	By jobtitle_box=By.xpath("//div[2]/i");
	By jobtitle_dropdownoption=By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
	By location_box=By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]");
	By location_dropdown=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
	By search_Btn=By.cssSelector(".oxd-button--secondary");
	By reset_Btn=By.xpath("//button[@type='reset']");
	By full_records=By.xpath("//div[@class='orangehrm-corporate-directory']");
	By type_for_hint_box_dropdown=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input");
	By container_search=By.cssSelector(".oxd-grid-item:nth-child(1) > .oxd-sheet");
	By contact_info=By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[2]");
	By phone_no=By.xpath("//p[contains(.,'112-454-0457')]");
	By workmail_id=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[6]/div[1]/p[2]");
	
	public void menu()
	{
		driver.findElement(directoryOpt).click();
	}
	
	public void dir_table()
	{
		try
		{
		WebElement ele=driver.findElement(directory_table);
		boolean displayed=ele.isDisplayed();
		System.out.println("Directory Table is displayed  "+displayed);
		String text=ele.getText();
		System.out.println("___________________________________________________________________________");
		System.out.println(text);
		System.out.println("___________________________________________________________________________");
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	public void dir_table_data_search()
	{
		try
		{
		driver.findElement(type_for_hint_box).sendKeys("Peter Mac Anderson");
		driver.findElement(jobtitle_box).click();
		WebElement ele1=driver.findElement(jobtitle_dropdownoption);
		ele1.sendKeys(Keys.ARROW_DOWN);
		ele1.sendKeys(Keys.RETURN);
		
		driver.findElement(location_box).click();
		WebElement ele2=driver.findElement(location_dropdown);
		ele2.sendKeys(Keys.ARROW_DOWN);
		ele2.sendKeys(Keys.RETURN);
		driver.findElement(location_dropdown).click();
		driver.findElement(search_Btn).click();
		}
	
	catch(Exception e)
	{
		System.out.println("Exception Caught" + e.getMessage());
	}
		
	}
	
	public void search() {
		try {
			WebElement el=driver.findElement(search_Btn);
			boolean btn=el.isEnabled();
			System.out.println("___________________________________________________________________________");
			System.out.println("search button enabled is:"+btn);
			System.out.println("___________________________________________________________________________");
			Actions act=new Actions(driver);
			act.moveToElement(el);
			act.click().build().perform();
			
		}
		catch(Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	public void records_msg_aft_search()
	{
		try
		{
		WebElement ele=driver.findElement(records_after_search);
		String text=ele.getText();
		System.out.println("___________________________________________________________________________");
		System.out.println(text);
		System.out.println("___________________________________________________________________________");
	}
	catch(Exception e)
	{
		System.out.println("Exception Caught" + e.getMessage());
	}
	}
	
	
	
	
	
	public void dir_table_data_reset()
	{
		try
		{
		driver.findElement(type_for_hint_box).sendKeys("Linda Jane Anderson");
		driver.findElement(jobtitle_box).click();
		WebElement ele1=driver.findElement(jobtitle_dropdownoption);
		ele1.sendKeys(Keys.ARROW_DOWN);
		ele1.sendKeys(Keys.RETURN);
		
		driver.findElement(location_box).click();
		WebElement ele2=driver.findElement(location_dropdown);
		ele2.sendKeys(Keys.ARROW_DOWN);
		ele2.sendKeys(Keys.RETURN);
		driver.findElement(location_dropdown).click();
		
		WebElement ele=driver.findElement(reset_Btn);
		boolean reset=ele.isEnabled();
		System.out.println("___________________________________________________________________________");
		System.out.println("resset button Enabled is:"+reset);
		System.out.println("___________________________________________________________________________");
		driver.findElement(reset_Btn).click();
		Thread.sleep(10000);
		}
	
	catch(Exception e)
	{
		System.out.println("Exception Caught" + e.getMessage());
	}
		
	}
	
	
	public void records_found_container()
	//searching employee information directly through records found container
	{
		try
		{
		WebElement ele=driver.findElement(full_records);
		boolean displayed=ele.isDisplayed();
		System.out.println("Records_found_container displayed is "+displayed);
		String text=ele.getText();
		System.out.println("___________________________________________________________________________");
		System.out.println(text);
		System.out.println("___________________________________________________________________________");
	}
	catch(Exception e)
	{
		System.out.println("Exception Caught" + e.getMessage());
	}
	}
	
	
	
	public void emplyeesearch_container() {
		try
		{
			driver.findElement(container_search).click();
			WebElement ele=driver.findElement(container_search);
			String info=ele.getText();
			System.out.println("___________________________________________________________________________");
			System.out.println(info);
			System.out.println("___________________________________________________________________________");
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught" + e.getMessage());	
		}
		
	}
	
	public void employee_contact_info() {
		try
		{
			WebElement ele=driver.findElement(contact_info);
			boolean info=ele.isDisplayed();
			System.out.println("employee contact information container  displayed is: "+info);
		String text=ele.getText();
		System.out.println("___________________________________________________________________________");
		System.out.println(text);
		
		WebElement ele2=driver.findElement(phone_no);
		String number=ele2.getText();
		System.out.println("Employee phone number:"+number);
		WebElement ele3=driver.findElement(workmail_id);
		String emailID=ele3.getText();
		System.out.println("Employee Email_ID:"+emailID);
		System.out.println("___________________________________________________________________________");
		}
		catch(Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	
}


