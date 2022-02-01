package stepDefinations;

import amazonimplementations.Product;
import amazonimplementations.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;
	

@Given("I have search field on Amazon Page")
public void i_have_search_field_on_amazon_page() {
    
	System.out.println("Step 1: I am on Search Page");
	
}

// Here we use regular Expression 
@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
public void i_search_for_a_product_with_name_and_price(String productName, int price) {
   
	System.out.println("Step 2: Search the product with name: " +productName+ " and price: " +price);
	
	
	product = new Product(productName, price);
}

@Then("Product with name {string} should be displayed") 
public void product_with_name_should_be_displayed(String productName) {

    
	System.out.println("Step 3: product " +productName+ " is displayed");
	
	search = new Search();
	String name = search.displayProduct(product);
	
	System.out.println("searched product is : " + name);
	
	Assert.assertEquals(product.getProductName(), name);

	
}
	
	
	
	
	
	
	
	

}
