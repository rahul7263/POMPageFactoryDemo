/**
 * 
 */
package OrangeHRMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OrganeHRMBase.BaseClass;

/**
 * @author Rahul
 *
 */
public class dashboard extends BaseClass{
    
	@FindBy(xpath ="//a[@class=\"oxd-main-menu-item active\"]") WebElement admintab;
	
	public dashboard() {
		
		PageFactory.initElements(driver, this);
	}
	
	public SystemUserPage ClickOnAdminTab() throws InterruptedException {
		
		admintab.click();
		Thread.sleep(5000);
		return new SystemUserPage();
	}
	
}
