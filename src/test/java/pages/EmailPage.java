package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.bind.v2.model.core.ID;

import utilities.Driver;

public class EmailPage {

	public EmailPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id="email_create")
	public WebElement emailAddressElement;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	public WebElement submitButton;
 
	@FindBy(xpath=" //li[contains(text(),'Invalid email address.')]")
	public WebElement errorMassageWithInvalidEmail;
	
	
 
	public Select dropDown() {
		return new Select(Driver.getDriver().findElement(By.id("fxgcfvcd")));
	}
	
	
	
}
