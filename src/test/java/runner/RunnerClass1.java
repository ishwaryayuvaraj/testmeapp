package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features\\Sample2.feature",
                 glue="stepdefinition",
                 plugin="html:C:\\Users\\ishwarya.devanathan\\Desktop",
                 tags= {"@category,@sub-category"})

public class RunnerClass1 {

}
