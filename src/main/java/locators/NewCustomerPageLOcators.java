package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPageLOcators {

	@FindBy(xpath="//input[@name='name']")
	public WebElement CustomerName;
	
	@FindBy(xpath="//input[@type='radio']")
	public WebElement Gender;
	

	@FindBy(xpath="//input[@name='dob']")
	public WebElement DOB;

	@FindBy(xpath="//input[@name='addr']")
	public WebElement Address;

	@FindBy(xpath="//input[@name='city']")
	public WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	public WebElement State;

	@FindBy(xpath="//input[@name='pinno']")
	public WebElement PIN;

	@FindBy(xpath="//input[@name='telephoneno']")
	public WebElement Number;

	@FindBy(xpath="//input[@name='emailid']")
	public WebElement EmailID;

	@FindBy(xpath="//input[@type='Submit']")
	public WebElement Submit;

	@FindBy(xpath="//input[@type='Reset']")
	public WebElement Reset;


}
