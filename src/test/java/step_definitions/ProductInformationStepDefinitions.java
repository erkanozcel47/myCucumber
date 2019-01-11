package step_definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import beans.Users;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductInformationStepDefinitions {

	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	 
	}

	@Then("the user should be to see {string}")
	public void the_user_should_be_to_see(String string) {
 
	}
	@Then("only for fun")
	public void only_for_fun(Map<String, String> myMap) {
	  
	   System.out.print(myMap);
	   
	   System.out.print(myMap.size());
	  
	}
	
	@Then("only for fun fin")
	public void only_for_fun_fin(List<String> ls) {
	    System.out.println(ls);
	}
	
	
	
	@Then("only for fun fin for")
	public void only_for_fun_fin_for(List<Users> user) {
	    System.out.println();
		
	    for (Users userss : user) {
			System.out.println(userss.getFirstName());
			System.out.println(userss.getLastName());
			System.out.println(userss.getGender());
			System.out.println(userss.getAge());
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
