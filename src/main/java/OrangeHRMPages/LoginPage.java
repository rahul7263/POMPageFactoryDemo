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
public class LoginPage extends BaseClass {
   
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath = "//button[@type=\"submit\"]") WebElement loginbtn;
	@FindBy(xpath = "//img[@alt=\"company-branding\"]") WebElement logo;
	
	public boolean validatelogo() {
		
		logo.isDisplayed();
		return true;
	}
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public dashboard login(String uname , String pass) {
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
		
		return new dashboard();
	}
}
