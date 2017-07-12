/*
 * @author Ravi Kunaparaju  
 */
package uk.co.ravi.accceptanceTest;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","html:target/reports/cucumber-pretty","json:target/cucumber.json"}, 
		features = {"src/test/resources/features/Registration.feature"},glue="uk.co.ravi.stepdefs")
public class RegressionTest {

}
