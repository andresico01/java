package accenture.company.app.operaciones;

import accenture.company.app.complejo.Complejo;

public class FactorOperacion extends Operaciones implements operacion{



    public FactorOperacion(Complejo primero, Complejo segundo) {
        super(primero, segundo);
    }

    @Override
    public Complejo dividir() {
        return super.getDivicion();
    }

    @Override
    public Complejo multiplicar() {
        return super.getMultiplicacion();
    }

    @Override
    public Complejo restar() {
        double auxReal = this.primero.getReal() - this.segundo.getReal();
        double auxImg = this.primero.getImaginario() - this.segundo.getImaginario();
        return new Complejo(auxReal,auxImg);
    }

    @Override
    public Complejo sumar() {
        double auxReal = this.primero.getReal() + this.segundo.getReal();
        double auxImg = this.primero.getImaginario() + this.segundo.getImaginario();
        return new Complejo(auxReal,auxImg);
    }
}
