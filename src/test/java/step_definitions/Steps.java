package step_definitions;

 


 
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.agent.builder.AgentBuilder.Listener;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import pages.EmailPage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ExcelUtil;

public class Steps {
	
	EmailPage emailPage= new EmailPage();
	

@Then("the system should display the promoted items")
public void the_system_should_display_the_promoted_items() {
	ExcelUtil excelObject = new ExcelUtil("C:/Users/erkan/OneDrive/Masa�st�/Products.xlsx","Sheet1");
	List<Map<String,String>> allRows=excelObject.getDataList();
	for (Map<String, String> row : allRows) {
		String product= row.get("Product");
	if(	row.get("Execute").equalsIgnoreCase("y")){
		 System.out.println("Testing "+product);	
		
		}else {
			 System.out.println("Skiping "+product);
		}
	}
	
}

@Then("the item details should be correct")
public void the_item_details_should_be_correct() {
    
}

	
	
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	  Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
		 
	}

	@When("the user tries to register an invalid email")
	public void the_user_tries_to_register_an_invalid_email() {
        String invalidEmail= "erSVzgdbvcdz";
        BrowserUtilities.waitFor(1);
		emailPage.emailAddressElement.sendKeys(invalidEmail);
		BrowserUtilities.waitFor(1);
		 emailPage.submitButton.click();
	}

	@Then("the system should display error message {string}")
	public void the_system_should_display_error_message(String string) {
		BrowserUtilities.waitFor(1);
	  Assert.assertEquals(string,emailPage.errorMassageWithInvalidEmail.getText());
	   
	}
	
	@When("the user tries to register blank email")
	public void the_user_tries_to_register_blank_email() {
		emailPage.emailAddressElement.sendKeys("");
		emailPage.submitButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		System.out.println("Erkan");
	}

	@When("the user enters  search term")
	public void the_user_enters_search_term() {
		System.out.println("Erkan");
	}

	@Then("the search box must contain the search term")
	public void the_search_box_must_contain_the_search_term() {

	}

@Given("the user on the login page")
public void the_user_on_the_login_page() {

	//Driver.getDriver().get(ConfigurationReader.getProperty("url"));
}

@When("the user enters the first name and last name")
public void the_user_enters_the_first_name_and_last_name() {
	LoginPage loginPage= new LoginPage();
	loginPage.firstName.sendKeys("Leonard");
	loginPage.lastName.sendKeys("DeAngelo");
  
}

@Then("click the submit button")
public void click_the_submit_button() {
	LoginPage loginPage= new LoginPage();
	loginPage.button.click();
}


}
