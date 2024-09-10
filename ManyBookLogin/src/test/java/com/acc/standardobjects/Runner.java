package com.acc.standardobjects;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
//features = "src/test/resources/features/PITGoals/OAS-5598.feature",
glue = {"com.stepdefs"},
dryRun = false,
tags= "@Login",
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "json:target/reports/cucumber-json-reports/json-report.json",
                "html:target/reports/cucumber-html-reports/html-report.html"
        })
//plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"})

public class Runner {
	
    public static void AfterRun() throws Exception {
        
}	
		
}
