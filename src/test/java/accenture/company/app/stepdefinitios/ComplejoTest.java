package accenture.company.app.stepdefinitios;

import accenture.company.app.complejo.Complejo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComplejoTest {
    private Complejo numero;
    private static final double DELTA = 1e-15;
    @Given("^quiero complejo$")
    public void crearComplejo() {
        numero = new Complejo(0,0);
    }

    @When("^complejo es (\\d+) \\+ (\\d+)i$")
    public void complejo(int arg1, int arg2) {
            numero.setReal(arg1);
            numero.setImaginario(arg2);
    }

    @Then("^deberia ver el resultado es (\\d+) \\+ (\\d+)i$")
    public void verificandoComplejo(int arg1, int arg2) {
        Assert.assertEquals(arg1,numero.getReal(),DELTA);
        Assert.assertEquals(arg2,numero.getImaginario(),DELTA);
    }
}
