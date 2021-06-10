package stepdefinition;
import java.sql.Driver;

import actions.loginPageActions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class applicationlogin extends BaseClass{
//	BeforeActions BC= new BeforeActions();
	
	loginPageActions LoginAction = new loginPageActions();
	
	 @Given("^user should be on application login page \"([^\"]*)\"$")
	    public void user_should_be_on_application_login_page(String WebSiteURL) throws Throwable {
		// BC.setUp();
		 BaseClass.openURL(WebSiteURL);
	    }
	 @When("^user should enter the username and password$")
	    public void user_should_enter_the_username_and_password() throws Throwable {
		
		 LoginAction.loginToGuru99("mngr331788", "tYvEjAv");
		 System.out.println("entered username and password");
	    }

	 @And("^click on login button$")
	    public void click_on_login_button() throws Throwable {
	        LoginAction.enterSubmit();
	        System.out.println("clicked enter button");
	
	    }
	 @When("user should be successfully logged and get the title of page")
		public void user_should_be_successfully_logged_and_get_the_title_of_page() throws Throwable {
	    	System.out.println(BaseClass.driver().getTitle());
	    System.out.println("successful logged in");
	    }
	 
	 @And("^click on reset button$")
	    public void click_on_reset_button() throws Throwable {
	        LoginAction.enterReset();
	        System.out.println("clicked reset button");
	        System.out.println(BaseClass.driver().getTitle());
	 }
	   
}
