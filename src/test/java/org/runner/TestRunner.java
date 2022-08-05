package org.runner;

import org.base.JVM_Report;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources",
glue="org.stepdef", 
dryRun=false,
strict=false,
monochrome = true,
snippets=SnippetType.UNDERSCORE,
plugin = {"pretty","json:C:\\Users\\Aravinth MS\\Desktop\\Testing- Selnium\\New folder\\Cucumber12\\target\\Reports\\jsonreport.json"}
)

public class TestRunner{
	@AfterClass
	public static void jvmrepo() {
		JVM_Report.reportGen("C:\\Users\\Aravinth MS\\Desktop\\Testing- Selnium\\New folder\\Cucumber12\\target\\Reports\\jsonreport.json");

	}
	
}
