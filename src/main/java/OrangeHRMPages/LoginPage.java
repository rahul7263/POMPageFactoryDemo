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
   
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") WebElement username;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[1]") WebElement password;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement loginbtn;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img") WebElement logo;
	
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
