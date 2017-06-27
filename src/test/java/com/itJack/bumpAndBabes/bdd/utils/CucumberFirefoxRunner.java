package com.itJack.bumpAndBabes.bdd.utils;

import com.itJack.bumpAndBabes.bdd.utils.WebConnector;
import com.itJack.bumpAndBabes.bdd.utils.WebConnector.Browsers;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@footer",
                 features = "src/test/resources/",
                 monochrome = true, 
                 strict = true, 
                 format = { "pretty", "html:target/cucumber" },
                 glue = {"com.itJack.bumpAndBabes.bdd.utils",
                		 "com.itJack.bumpAndBabes.bdd.stepDefs"})
public class CucumberFirefoxRunner {
	@BeforeClass
	public static void setUp() {
		WebConnector.getInstance();
		WebConnector.initialiseDriver(Browsers.valueOf("Firefox"));
	}

	@AfterClass
	public static void tearDown() {
		WebConnector.driver.quit();
	}
}
