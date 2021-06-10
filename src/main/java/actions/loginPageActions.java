package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.BaseClass;

public class loginPageActions {

	//	loginPageLocators LoginPageLocators = null;

	@FindBy(name="uid")
	public WebElement username;

	@FindBy(name="password")
	public WebElement password;

	@FindBy(name="btnLogin")
	public WebElement submit;

	@FindBy(name="btnReset")
	public WebElement reset;


	public loginPageActions(){

		//this.loginPageActions= new loginPageActions();
		PageFactory.initElements(BaseClass.driver(), this);
	}

	public void enterUserName(String user){
		username.sendKeys(user);
	}
	public void enterPasssword(String pass){
		password.sendKeys(pass);
	}
	public void enterSubmit(){
		submit.click();
	}
	public void enterReset(){
		reset.click();
	}
	public void loginToGuru99(String user,String pass){

		//Fill user name

		this.enterUserName(user);

		//Fill password

		this.enterPasssword(pass);

		//Click Login button

		
	}
}
