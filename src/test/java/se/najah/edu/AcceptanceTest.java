package se.najah.edu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "uses_cases", plugin = {
		"html:target/cucumber/wikipedia.html" }, monochrome = true, snippets = SnippetType.CAMELCASE, glue = {
				"se.najah.edu" }, strict = true)

public class AcceptanceTest {

}
