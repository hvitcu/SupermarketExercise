package com.supermarket.integration;

import cucumber.api.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by horiav on 26/12/2015.
 */

@RunWith( Cucumber.class )
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"},
        features="src/test/java/com/supermarket/resources",
        glue = "com.supermarket.integration",
        dryRun = false
)
public class SupermarketTest
{

}
