package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\featureapp\\Login.feature"},
		
		glue = {"Steps"},
		
		publish = true
		
		)

       public class LoginRunner extends AbstractTestNGCucumberTests {
	    

}
