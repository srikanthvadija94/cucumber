package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonSearchHooks {
	
	
//	@Before(order=1)
//	public void setup_browser(Scenario sc) {
//		
//		System.out.println("launch the browser");
//		System.out.println(sc.getName());
//		}
//	
//	@Before(order=2)
//	public void setup_url() {
//		
//		System.out.println("launch the url");
//		}
//	
//	
//	@After(order=2)
//	public void teardown_close() {
//		
//		System.out.println("close the browser");
//			}
//	
//	@After(order=1)
//	public void teardown_logout(Scenario sc) {
//		
//		System.out.println("logout application");
//		System.out.println(sc.getName());
//	}
//	
//	
//	@BeforeStep
//	public void takeScreenshot() {
//		
//		System.out.println("user takeScreenshot");
//	}
//	
//	@AfterStep
//	public void Refreshpage( ) {
//		
//		System.out.println("refresh the page after every step");
//	}
	
	
	@Before("@Smoke")
	public void setup() {
		
		System.out.println("launch the browser");
	}
	
	
	@After("@Smoke")
	public void teardown() {
		
		System.out.println("close the browser");
	}
	
	
}
