package accenture.company.app.stepdefinitios;

import accenture.company.app.complejo.Complejo;
import accenture.company.app.operaciones.FactorOperacion;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SumaComplejosTest {
    private static final double DELTA = 1e-15;
    Complejo numero1;
    Complejo numero2;
    Complejo resultado;
    @Given("^quiero una suma de complejos$")
    public void crearSuma() {
        numero1 = new Complejo();
        numero2 = new Complejo();
        resultado = null;
    }
    @When("^los numeros son (\\d+) \\+ (\\d+)i mas (\\d+) \\+ (\\d+)i$")
    public void sumComplejos(int arg1, int arg2, int arg3, int arg4) {
        numero1.setImaginario(arg2);
        numero1.setReal(arg1);
        numero2.setReal(arg3);
        numero2.setImaginario(arg4);
        FactorOperacion operar = new FactorOperacion(numero1,numero2);
        resultado = operar.sumar();
    }
   /* @When("^los numeros son (\\d+) \\+ (\\d+)i más (\\d+) \\+ (\\d+)i$")
    public void sumComplejos(int arg1, int arg2, int arg3, int arg4) {

    }*/
    @Then("^el resultado esperado es (\\d+) \\+ (\\d+)i$")
    public void verificarResultado(int arg1, int arg2) {
        Assert.assertEquals(arg1,resultado.getReal(),DELTA);
        Assert.assertEquals(arg2,resultado.getImaginario(),DELTA);
    }
}
