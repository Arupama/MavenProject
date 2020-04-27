package RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue={"StepDefination"},
		features= "src/main/resources/FeatureFile",
		tags={"@CreateCustomer"}
		)
public class CucumberRun 
{

}
