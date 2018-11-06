package gluecode;

import org.openqa.selenium.WebDriver; //import van de library voor Webdriver statements

import cucumber.api.java.en.And;  //import van de library voor And statements
import cucumber.api.java.en.Given; //import van de library voor Given statements
import cucumber.api.java.en.Then; //import van de library voor Then statements
import cucumber.api.java.en.When; //import van de library voor When statements

public class inlog_steps {
	
	protected static WebDriver driver; 	//deze regel configureert het gebruik van de commando ‘driver’

	@Given("the browser is opened and showing the intranet homepage") //naam van de given statement
	public static void setUp() { 		//Naam van het object
	System.out.println("Step passed"); 	//Code: toont de tekst “Step passed” indien goed uitgevoerd wordt.
	}
	@When("user logs on with valid credentials") 		//naam van de When statement
	public static void loginfeature_validcredentials() { // Naam van het object
	System.out.println("Step passed"); //Code: toont de tekst “Step passed” indien goed uitgevoerd wordt.

}

	@Then("login is successful") 		//naam van de Then statement
	public static void loginfeature_successfull(){ 	// Naam van het object
	System.out.println("Step passed"); //Code: toont de tekst “Step passed” indien goed uitgevoerd wordt.
	}

	@And("the homepage is displayed")	 //naam van de Then statement
	public static void loginfeature_homepagedisplayed() {  // Naam van het object
	System.out.println("Step passed");  	//Code: toont de tekst “Step passed” indien goed uitgevoerd wordt.

	}
}