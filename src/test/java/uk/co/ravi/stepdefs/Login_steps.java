//@author ravi kunaparaju
package uk.co.ravi.stepdefs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import uk.co.ravi.pagemodel.*;
import uk.co.ravi.utils.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.sql.Time;
import java.time.Instant;
import org.junit.Assert;

public class Login_steps {
	
	WebDriver driver;
	HomePage mainPage;
	SigninSelectionPage signInSel;
	LoginPage login;
	ObjectRepository obj;
	Support support;
	String url = AppProperties.get("envurl");
	long time = Instant.now().toEpochMilli();

	public Login_steps(SharedWebDriver driver){
		this.driver = driver;
		mainPage = PageFactory.initElements(driver, HomePage.class);
		signInSel = PageFactory.initElements(driver, SigninSelectionPage.class);
		login = PageFactory.initElements(driver, LoginPage.class);
		support = PageFactory.initElements(driver, Support.class);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	@Given("^user navigated to login screen$")
	public void user_navigated_to_login_screen() throws Throwable {
	    mainPage.navToSignInSelPage();
	    signInSel.navToLendingSignInPage();
	}

	@When("^user enter valid \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enter_valid(String arg1, String arg2) throws Throwable {
	    login.enterUserName(arg1);
	    login.enterPassword(arg2);
	}

	@When("^clicks on Sign in button$")
	public void clicks_on_Sign_in_button() throws Throwable {
	    login.signIn();
	}

	@Then("^user is logged into the application$")
	public void user_is_logged_into_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	
}
