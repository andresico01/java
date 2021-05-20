package accenture.company.app.complejo;

public class Complejo {
    private Double real;
    private Double  imaginario;

    public Complejo(){

    }
    public Complejo(double real,double imaginario){
        this.imaginario = imaginario;
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public void setReal(double real) {
        this.real = real;
    }
}
