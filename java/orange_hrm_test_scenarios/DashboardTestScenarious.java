package orange_hrm_test_scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import orange_hrm.Directory_page;
import orange_hrm.OrangehrmPage;
import orange_hrm.PageOfDashboard;

public class DashboardTestScenarious {
	WebDriver driver;
	OrangehrmPage object;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority=0)
	public void login() 
	{
		OrangehrmPage page1 = new OrangehrmPage(driver);
		page1.loginusername("Admin");
		page1.login_pass_word("admin123");
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void dashboard_page() 
	{
		PageOfDashboard page2=new PageOfDashboard(driver);
		page2.verifyTimeATWork();
		page2.verifyMyActions();
		page2.verifyQuickLaunch();
		page2.verifyBuzzLatestPosts();
		page2.verifyEmployeesonLeaveToday();
		page2.verifyEmployeeDistributionbySubUnit();
		page2.verifyEmployeeDistributionbyLocation();
		}
	
	@Test(priority=2)
	public void Directory_Page()
	{
		Directory_page page3=new Directory_page(driver);
		page3.menu();
		page3.dir_table();
		page3.dir_table_data_search();
		page3.search();
		page3.records_msg_aft_search();
		page3.dir_table_data_reset();
		page3.records_found_container();
		page3.emplyeesearch_container();
		page3.employee_contact_info();
		
			}

	@AfterTest
	public void aftertest()
	{
		//driver.quit();
	}
}
