/*
 * @author Ravi Kunaparaju  
 *  
 */
package uk.co.ravi.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uk.co.ravi.utils.*;

public class SigninSelectionPage {
	private final WebDriver driver;
	ObjectRepository obj= new ObjectRepository();
	Support support;
	String env = AppProperties.get("environment");
	
	public SigninSelectionPage(WebDriver driver){		
		 this.driver=(WebDriver) driver;
		 support = PageFactory.initElements(driver, Support.class);
	 }
	public void navToLendingSignInPage(){
		support.click(obj.lendging_login);
	}
}
