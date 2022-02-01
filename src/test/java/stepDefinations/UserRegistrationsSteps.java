package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UserRegistrationsSteps {

	
	@Given("User is landed on registration page")
	public void user_is_landed_on_registration_page() {

		System.out.println("user land on registration page");

	}

	
	@When("User enters following the details")
	public void user_enters_following_the_details(DataTable userRegisterationTable) {
		
		List<List<String>> userLists = userRegisterationTable.asLists(String.class);
			
		for(List<String> e : userLists) {
			System.out.println(e);
		}
	    
	}
	
	
	@When("User enters following the details with colums")
	public void user_enters_following_the_details_with_colums(DataTable userRegisterationTable) {
		
		List<Map<String, String>> userlists = userRegisterationTable.asMaps(String.class, String.class);
		
//		System.out.println(userlists);
		System.out.println(userlists.get(3).get("First Name")); 		//getting particular colum
		
		for(Map<String, String> e : userlists) {
			System.out.println(e);
			
//			System.out.println(e.get("First Name"));
//			System.out.println(e.get("Last Name"));
//			System.out.println(e.get("Phone"));
//			System.out.println(e.get("Email"));
//			System.out.println(e.get("City"));
				}
		
	}
	

	@Then("User registration should be successfully completed")
	public void user_registration_should_be_successfully_completed() {
	    
		System.out.println("user registration successfully completed");
		}

	
	
}
