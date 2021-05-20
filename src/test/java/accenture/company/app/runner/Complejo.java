package accenture.company.app.runner;

import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/complejo.feature"},
glue = {"accenture.company.app.stepdefinitios"})
public class Complejo {

}
