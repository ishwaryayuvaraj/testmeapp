package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features\\Sample5.feature",
                 glue="stepdefinition",
                 plugin="html:C:\\Users\\ishwarya.devanathan\\Desktop")
                 

public class RunnerClass2 {

}
