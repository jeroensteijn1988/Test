package testrunner; 				// Naam package
import cucumber.api.CucumberOptions; 	// Import van de cucumber library
import cucumber.api.testng.AbstractTestNGCucumberTests;   // import van de testng cucumber library

@CucumberOptions( 		//TestNG syntax
features = "src/test/java/features",	 //verwijzing naar de Feature files die getest moeten worden
glue= {"gluecode"}, 	//verwijzing naar de seleniumgluecode om de testen uit te kunnen voeren
plugin = { "pretty", "html:target/htmlreports" }, 	//dit configureert de rapportage en de locatie waar ze worden opgeslagen
tags = {"@Regressie"} 	//Hier kunnen de tags benoemd worden van de uit te voeren testsets. 
)
public class Testrunner extends AbstractTestNGCucumberTests{  		//Naam van de class

}
