/*
 * @author Ravi Kunaparaju  
 *  
 */
package uk.co.ravi.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uk.co.ravi.utils.*;

public class RegistrationPage {
	private final WebDriver driver;
	ObjectRepository obj= new ObjectRepository();
	Support support;
	String env = AppProperties.get("environment");
	
	public RegistrationPage(WebDriver driver){		
		 this.driver=(WebDriver) driver;
		 support = PageFactory.initElements(driver, Support.class);
	 }
	public void enterName(String name){
		support.enter_text(obj.name, name);
	}
	
	public void enterEmail(String email){
		support.enter_text(obj.email, email);
	}
	
	public void enterPassword(String pwd){
		support.enter_text(obj.password, pwd);
	}
	
	public void selectTerms(){
		support.scrollToElement(obj.terms);;
		support.click(obj.terms);
	}
	
	public void clickApply(){
		
	}
	
	public void register(){
		
	}
}
