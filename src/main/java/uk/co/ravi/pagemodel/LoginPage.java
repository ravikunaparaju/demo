/*
 * @author Ravi Kunaparaju  
 *  
 */
package uk.co.ravi.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uk.co.ravi.utils.*;

public class LoginPage {
	private final WebDriver driver;
	ObjectRepository obj= new ObjectRepository();
	Support support;
	String env = AppProperties.get("environment");
	
	public LoginPage(WebDriver driver){		
		 this.driver=(WebDriver) driver;
		 support = PageFactory.initElements(driver, Support.class);
	 }
	public void enterUserName(String uname){
		support.enter_text(obj.lUsername, uname);
	}
	
	public void enterPassword(String pwd){
		support.enter_text(obj.lPassword, pwd);
	}
	
	public void signIn(){
		support.click(obj.signInButton);
	}
	
}
