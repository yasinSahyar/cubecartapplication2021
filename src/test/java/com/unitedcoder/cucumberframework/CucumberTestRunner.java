package com.unitedcoder.cucumberframework;

import com.seleniummaster.cubecartautomation.TestBase;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cubcart-cucumber-result"},
        features = {"src/test/resources"},
        tags="@CustomerApiTest"
)
public class CucumberTestRunner extends TestBase {

}