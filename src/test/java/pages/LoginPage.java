package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		
		PageFactory.initElements(Driver.getDriver(),this);
		
		
	}
	@FindBy(name="firstname")
	public WebElement firstName;
	
	@FindBy(name="lastname")
	public WebElement lastName;
	
	@FindBy(id="submit")
	public WebElement button;
	
	
	

}
