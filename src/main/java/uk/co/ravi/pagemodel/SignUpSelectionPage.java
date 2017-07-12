/*
 * @author Ravi Kunaparaju  
 *  
 */
package uk.co.ravi.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uk.co.ravi.utils.*;

public class SignUpSelectionPage {
	private final WebDriver driver;
	ObjectRepository obj= new ObjectRepository();
	Support support;
	String env = AppProperties.get("environment");
	
	public SignUpSelectionPage(WebDriver driver){		
		 this.driver=(WebDriver) driver;
		 support = PageFactory.initElements(driver, Support.class);
	 }
	public void navToLendingSignUpPage(){
		support.click(obj.getStarted_lending);
	}
}
