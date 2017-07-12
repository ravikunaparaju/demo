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

public class Registration_steps {
	
	WebDriver driver;
	HomePage mainPage;
	SignUpSelectionPage signupSel;
	RegistrationPage reg;
	ObjectRepository obj;
	Support support;
	String url = AppProperties.get("envurl");
	long time = Instant.now().toEpochMilli();

	public Registration_steps(SharedWebDriver driver){
		this.driver = driver;
		mainPage = PageFactory.initElements(driver, HomePage.class);
		signupSel = PageFactory.initElements(driver, SignUpSelectionPage.class);
		reg = PageFactory.initElements(driver, RegistrationPage.class);
		support = PageFactory.initElements(driver, Support.class);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	@Given("^user clicked on Get started for free on home screen$")
	public void user_clicked_on_Get_started_for_free_on_home_screen() throws Throwable {
	    mainPage.navToSignUpPage();
	}

	@Given("^clicked on get started button in Lending$")
	public void clicked_on_get_started_button_in_Lending() throws Throwable {
		signupSel.navToLendingSignUpPage();
	}

	@When("^user enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enters(String arg1, String arg2, String arg3) throws Throwable {
	    reg.enterName(time+arg1);
	    reg.enterEmail(time+arg2);
	    reg.enterPassword(arg3);
	}

	@When("^enabled terms & clicked Apply button$")
	public void enabled_terms_clicked_Apply_button() throws Throwable {
	    reg.selectTerms();
	    System.out.println("time in epoch is + "+time);
	    // commented clicking apply button action to avoid registration
	    //reg.clickApply();
	}

	@Then("^account should be created and user eligibility questionnaire should be displayed$")
	public void account_should_be_created_and_user_eligibility_questionnaire_should_be_displayed() throws Throwable {
	    
	}
	
}
