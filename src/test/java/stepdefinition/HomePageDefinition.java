package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;



import actions.homePageActions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;

import utilities.BaseClass;

public class HomePageDefinition{
	homePageActions HomePage = new homePageActions();

	@And("^click on any button from menu$")
	public void click_on_any_button_from_menu(List<String> list) throws Throwable {
	System.out.println(list.get(2));
		HomePage.moveToNewCustomer();
		//BaseClass.driver().findElement(By.linkText("New Customer")).click();
		
	}


	@Then("appropiate page should get open and get title of the page")
	public void appropiate_page_should_get_open_and_get_title_of_the_page() {
		System.out.println(BaseClass.driver().getTitle());
		System.out.println("open got opened");
	}



}
