/*
 * @author Ravi Kunaparaju  
 */
package uk.co.ravi.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uk.co.ravi.utils.*;

public class HomePage{
	private final WebDriver driver;
	ObjectRepository obj= new ObjectRepository();
	Support support;
	String env = AppProperties.get("environment");
	
	public HomePage(WebDriver driver){		
		 this.driver=(WebDriver) driver;
		 support = PageFactory.initElements(driver, Support.class);
	 }
	public void navToSignUpPage(){
		support.click(obj.getStartedButton);
	}
	
}
