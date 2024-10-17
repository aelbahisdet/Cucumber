package com.demoframework.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
			features = "@target/failed.txt",
			glue = "com.demoframework.steps"
		)

public class FailedRunner {

}
