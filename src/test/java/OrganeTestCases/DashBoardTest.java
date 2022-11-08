/**
 * 
 */
package OrganeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeHRMPages.dashboard;
import OrganeHRMBase.BaseClass;

/**
 * @author Rahul
 *
 */
public class DashBoardTest extends BaseClass {
  
	dashboard DashBoard;
	
	@Test(priority=3)
	public void adminTabTest() throws InterruptedException {

		DashBoard = loginpage.login("Admin","admin123");
		DashBoard.ClickOnAdminTab();
		Thread.sleep(5000);
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);
   }
}
