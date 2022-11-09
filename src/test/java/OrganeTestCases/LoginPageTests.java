/**
 * 
 */
package OrganeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

//import OrangeHRMPages.LoginPage;
import OrangeHRMPages.dashboard;
import OrganeHRMBase.BaseClass;

/**
 * @author Rahul
 *
 */
public class LoginPageTests extends BaseClass {
	
	//LoginPage loginpage;
	dashboard DashBoard;
	
	@Test(priority=1)
	public void vaerifylogo() {
		
		boolean flag = loginpage.validatelogo();
		 Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void logintest() {
		
		DashBoard = loginpage.login(prop.getProperty("username"),prop.getProperty("passowrd"));
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);
				
	}

}
