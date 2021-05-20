package accenture.company.app.stepdefinitios;

import accenture.company.app.complejo.Complejo;
import accenture.company.app.operaciones.FactorOperacion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class DivicionComplejoTest {
    private static final double DELTA = 1e-15;
    Complejo numero1;
    Complejo numero2;
    Complejo resultado;
    @Given("^quiero una divicion de complejos$")
    public void quieroUnaDivicionDeComplejos() {
        numero1 = new Complejo();
        numero2 = new Complejo();
        resultado = null;
    }

    @When("^los numeros son (\\d+) \\+ (\\d+)i dividido entre (\\d+) \\+ (\\d+)i$")
    public void losNumerosSonIDivididoEntreI(int arg1, int arg2, int arg3, int arg4) {
        numero1.setImaginario(arg2);
        numero1.setReal(arg1);
        numero2.setReal(arg3);
        numero2.setImaginario(arg4);
        FactorOperacion operar = new FactorOperacion(numero1,numero2);
        resultado = operar.dividir();
    }

    @Then("^resultado de la divicion (\\d+),(\\d+)f \\+ (\\d+),(\\d+)fi$")
    public void resultadoDeLaDivicionFFi(int arg1, int arg2, int arg3, int arg4) {
        double aux1 = (double) arg2/100;
        double aux2 = (double) arg4/100;
        aux1 += arg1;
        aux2 += arg3;
        Assert.assertEquals(aux1, resultado.getReal(), DELTA);
        Assert.assertEquals(aux2, resultado.getImaginario(), DELTA);
    }

}
