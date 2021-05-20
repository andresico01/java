package accenture.company.app.stepdefinitios;

import accenture.company.app.complejo.Complejo;
import accenture.company.app.operaciones.FactorOperacion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RestaComplejoTest {
    private static final double DELTA = 1e-15;
    Complejo numero1;
    Complejo numero2;
    Complejo resultado;
    @Given("^quiero una resta de complejos$")
    public void quieroUnaRestaDeComplejos() {
        numero1 = new Complejo();
        numero2 = new Complejo();
        resultado = null;
    }

    @When("^los numeros son (\\d+) \\+ (\\d+)i menos (\\d+) \\+ (\\d+)i$")
    public void losNumerosSonIMenosI(int arg1, int arg2, int arg3, int arg4) {
        numero1.setImaginario(arg2);
        numero1.setReal(arg1);
        numero2.setReal(arg3);
        numero2.setImaginario(arg4);
        FactorOperacion operar = new FactorOperacion(numero1,numero2);
        resultado = operar.restar();
    }

    @Then("^la respuesta esperada es (\\d+) \\+ (\\d+)i$")
    public void laRespuestaEsperadaEsI(int arg1, int arg2) {
        Assert.assertEquals(arg1,resultado.getReal(),DELTA);
        Assert.assertEquals(arg2,resultado.getImaginario(),DELTA);
    }
}
