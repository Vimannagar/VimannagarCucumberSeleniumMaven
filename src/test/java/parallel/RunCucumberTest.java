package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty"},
		
		glue = {"parallel"},
		
		features = {"src/test/resources/parallel"}
			
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests

{
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	

}
