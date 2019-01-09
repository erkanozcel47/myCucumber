package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Steps {

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
