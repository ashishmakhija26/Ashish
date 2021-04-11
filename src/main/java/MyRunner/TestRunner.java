package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Automation\\FreeCrmBDDFrameWork\\src\\main\\java\\Features\\deals.feature",//the path of feature file
		glue= {"stepDefinations"},//the path of stepDefination files
		format= {"pretty","html:test-output","json:json-output/cocumber.json","junit:junit-xml/cocumber.xml"},//to generate different type of reporting
		monochrome=true,//display the console output in readable format
		strict=true,//it will check if any step is not defined in stepDefination file
		dryRun=false//check the mapping is proper between features file and stepDefination files
		)

public class TestRunner {

}
