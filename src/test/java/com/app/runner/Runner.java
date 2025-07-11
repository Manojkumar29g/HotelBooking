package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/Users/manojkumarg/eclipse-workspace/Hotel_Automation/src/test/resources/Login_page.feature",
glue="com.app.stepdefinition",
dryRun=false,
plugin= {"pretty","html:/Users/manojkumarg/eclipse-workspace/Hotel_Automation/reports/cucumber-reports.html","rerun:/Users/manojkumarg/eclipse-workspace/Hotel_Automation/target/failed.txt"})

public class Runner {

}
