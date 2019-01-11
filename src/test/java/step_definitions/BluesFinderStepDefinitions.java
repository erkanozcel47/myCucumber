package step_definitions;

import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.BlouseFinder;
import utilities.ConfigurationReader;
import utilities.Driver;

public class BluesFinderStepDefinitions {
	BlouseFinder blouseFinder= new BlouseFinder();
	
	@Given("the user is on the page")
	public void the_user_is_on_the_page() {
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@When("the user selects {string}")
	public void the_user_selects(String string) {
		 
		blouseFinder.items(string).click();
		
		
	}

	@Then("the system should velidate the product information")
	public void the_system_should_velidate_the_product_information(Map<String, String> dataTable) {
	
		String expectedName =dataTable.get("name");
		String expectedprice =dataTable.get("price");
		Assert.assertEquals(expectedName,  blouseFinder.itemsName(dataTable.get("name")).getText());
		Assert.assertEquals(expectedprice,  blouseFinder.itemsPrice(dataTable.get("price")).getText());
		
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
