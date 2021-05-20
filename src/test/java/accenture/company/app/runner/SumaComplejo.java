package accenture.company.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/sumaComplejo.feature"},
        glue = {"accenture.company.app.stepdefinitios"},
        snippets = CAMELCASE
)
public class SumaComplejo {
}
