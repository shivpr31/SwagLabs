package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features={".//Features/Login_Logout.feature", ".//Features/Add_To_Cart.feature"},
				glue="stepDefinitions",
				dryRun=false,
				monochrome=true,
				plugin={"pretty", "html:target/Cucumber_Reports/Html_Report.html",
				"junit:target/Cucumber_Reports/Xml_Report.xml"}
		        )
public class Run {

}
