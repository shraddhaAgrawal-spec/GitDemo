package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import locators.homePageLocators;
import utilities.BaseClass;

public class homePageActions {

//	homePageLocators HomePageLocators = null;
	@FindBy(linkText="New Customer")
	public WebElement NewCustomer;

	@FindBy(linkText="Edit Customer")
	public WebElement EditCustomer;

	@FindBy(linkText="Delete Customer")
	public WebElement DeleteCustomer;

	@FindBy(linkText="New Account")
	public WebElement NewAccount;

	@FindBy(linkText="Edit Account")
	public WebElement EditAccount;

	@FindBy(linkText="Delete Account")
	public WebElement DeleteAccount;


	public homePageActions(){

		PageFactory.initElements(BaseClass.driver(), this);
	}
	
	public void moveToNewCustomer() {
	
		NewCustomer.click();
	}
	
	public void editCustomer() {
		EditCustomer.click();
	}
	
	public void deleteCustomer() {
		DeleteCustomer.click();
	}
	
	public void newAccount() {
	NewAccount.click();
	}
	
	public void editAccount() {
		EditAccount.click();
	}
	
	public void deleteAccount() {
		DeleteAccount.click();
	}
}
