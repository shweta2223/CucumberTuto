package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"softfile"},
		glue= {"stepdefinations"},
		monochrome=true,
		dryRun=false,
		plugin= {"html:target/cucumberReport.html",
				"json:target/cucumber_json.json",
				"junit:target/cucumber_xml.xml",
				"pretty:target/cucumber_pretty.txt"}
		
		)




public class testrun {

}
