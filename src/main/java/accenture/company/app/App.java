package accenture.company.app;

import accenture.company.app.complejo.Complejo;
import accenture.company.app.operaciones.FactorOperacion;

/*
 *hacer numeros complejos, que se puedan sumar, restar, multiplicar y dividir.
 */
public class App {

    public static void main(String[] args) {
        Complejo numero1 = new Complejo(3,3);
        Complejo numero2 = new Complejo(3,1);
        FactorOperacion operar = new FactorOperacion(numero1,numero2);
        System.out.println(operar.dividir().getImaginario());

    }
}
