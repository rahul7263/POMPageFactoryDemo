/**
 * 
 */
package OrganeHRMBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import OrangeHRMPages.LoginPage;


/**
 * @author Rahul
 *
 */
public class BaseClass {
   
	public WebDriver driver;
	public LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		loginpage = new LoginPage();
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
}
