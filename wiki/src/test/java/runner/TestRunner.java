package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\savuda\\Downloads\\wiki\\src\\test\\java\\features\\wiki.feature", glue="wikiSteps",dryRun = false, tags = {"@SmokeTest"})
// package name ( feature file location ) & checking everything in the
// environment(trials)
public class TestRunner {

}
/*
 * glue tags features dryrun monochrome
 */
//in glue we should write package name of stepdefinition