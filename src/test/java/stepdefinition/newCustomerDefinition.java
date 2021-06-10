package stepdefinition;

import java.util.List;

import actions.homePageActions;
import actions.newCustomerPageAction;
import cucumber.api.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class newCustomerDefinition {
	newCustomerPageAction NewCustomerActins = new newCustomerPageAction();
	homePageActions HomePage = new homePageActions();

	@When("user has clicked the New Customer button from the list")
	public void user_has_clicked_the_new_customer_button_from_the_list() throws Throwable {
		HomePage.moveToNewCustomer();
	}

	@When("Enter the below details")
	public void enter_the_below_details(DataTable table) {
		List<List<String>> data = table.asList(getClass());

		NewCustomerActins.enterCustomerName(data.get(0).get(1));
	}

	@When("Click on submit button to create customer")
	public void click_on_submit_button_to_create_customer() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("new customer should get created successfully")
	public void new_customer_should_get_created_successfully() {
		// Write code here that turns the phrase above into concrete actions

	}

}
