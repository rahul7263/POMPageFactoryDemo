/**
 * 
 */
package OrganeHRMBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
	public Properties prop;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		readConfig();
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);
		
		loginpage = new LoginPage();
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
	
	public void readConfig() {
		
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/Configuration/config.properties/");
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
