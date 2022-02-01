package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	
	@Given("User wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
	  
		System.out.println("step1: " + carType);
		
		
	}

	@When("User selects car {string} and Pick up point {string} drop location {string}")
	public void user_selects_car_and_pick_up_point_drop_location(String carType, String PickupPoint, String DropPoint) {
	   
		System.out.println("step2: car is " + carType + " From: " + PickupPoint + " To: " + DropPoint);
		
	}

	@Then("Driver starts the jorney")
	public void driver_starts_the_jorney() {
	   
		System.out.println("step3");
		
	}

	@Then("Driver stop the journey")
	public void driver_stop_the_journey() {
	    
		System.out.println("step4");
		
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
	    
		System.out.println("step4: Total Amount is " + price);
		
	}
	
	
}
