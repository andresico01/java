package accenture.company.app.operaciones;


import accenture.company.app.complejo.Complejo;

public class Operaciones {
    protected Complejo primero;
    protected  Complejo segundo;

    public Operaciones(Complejo primero, Complejo segundo){
        this.primero = primero;
        this.segundo = segundo;
    }
    protected Complejo getMultiplicacion(){
        double auxReal;
        double auxImg;
        if(this.primero.getImaginario()*this.segundo.getImaginario() > 0){

            auxReal = this.primero.getReal()*this.segundo.getReal() - this.primero.getImaginario()*this.segundo.getImaginario();

        }else{
            auxReal = this.primero.getReal()*this.segundo.getReal() - this.primero.getImaginario()*this.segundo.getImaginario();
        }
        auxImg = this.primero.getReal()*this.segundo.getImaginario() + this.segundo.getReal()*this.primero.getImaginario();

        return new Complejo(auxReal,auxImg);
    }
    protected Complejo getDivicion(){
        double auxReal;
        double auxImg;
        double auxBase = resultadoBase();
        if(this.primero.getImaginario()*this.segundo.getImaginario() > 0){
            auxReal = this.primero.getReal()*this.segundo.getReal() + this.primero.getImaginario()*this.segundo.getImaginario();
            auxImg = this.segundo.getReal()*this.primero.getImaginario() - this.primero.getReal()*this.segundo.getImaginario();
        }else{
            auxReal = this.primero.getReal()*this.segundo.getReal() - this.primero.getImaginario()*this.segundo.getImaginario();
            auxImg = this.segundo.getReal()*this.primero.getImaginario() + this.primero.getReal()*this.segundo.getImaginario();
        }

        System.out.println(auxBase);
        return new Complejo(auxReal/auxBase,auxImg/auxBase);
    }

    private double resultadoBase(){
        double salida;
        if (this.segundo.getImaginario() < 0){
            salida = Math.pow(this.segundo.getReal(),2) - Math.pow(this.segundo.getImaginario(),2);

        }else{
            salida = Math.pow(this.segundo.getReal(),2) + Math.pow(this.segundo.getImaginario(),2);
        }
        return salida;
    }

}
