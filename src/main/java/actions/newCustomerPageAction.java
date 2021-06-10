package actions;

import org.openqa.selenium.support.PageFactory;

import locators.NewCustomerPageLOcators;
import utilities.BaseClass;

public class newCustomerPageAction {

	NewCustomerPageLOcators newCustom = null;

	public newCustomerPageAction(){
		this.newCustom = new NewCustomerPageLOcators();
		PageFactory.initElements(BaseClass.driver(), newCustom);
	}

	public void enterCustomerName(String name){
		newCustom.CustomerName.sendKeys(name);
	}

	public void enterGender(){
		newCustom.Gender.click();
	}

	public void enteraddress(String address) {
		newCustom.Address.sendKeys(address);
	}

	public void entercity(String city) {
		newCustom.City.sendKeys(city);
	}

	public void enterState(String State) {
		newCustom.State.sendKeys(State);
	}
	public void enterPIN(String PIN) {
		newCustom.PIN.sendKeys(PIN);
	}

	public void enterNumber(String Number) {
		newCustom.Number.sendKeys(Number);
	}

	public void enteremail(String email) {
		newCustom.EmailID.sendKeys(email);
	}
	public void enterSubmit() {
		newCustom.Submit.click();
	}
	public void enterReset() {
		newCustom.Reset.click();
	}
}
	
	