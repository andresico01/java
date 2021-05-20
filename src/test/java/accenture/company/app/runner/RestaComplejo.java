package accenture.company.app.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/restaComple.feature"},
        glue = {"accenture.company.app.stepdefinitios"},
        snippets = CAMELCASE)
public class RestaComplejo {
}
