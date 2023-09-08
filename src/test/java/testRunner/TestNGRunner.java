package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:\\Users\\admin\\Desktop\\end to end\\Gmail\\src\\Feature\\gmail.feature",
		glue="gmailSteps",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","json:target/cucumber1.json"})


public class TestNGRunner extends AbstractTestNGCucumberTests {

}


