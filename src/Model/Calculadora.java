package Model;

public class Calculadora {
    protected Float valor1;
    protected Float valor2;

    public Calculadora() {
    }

    public Float adicao() {
        return this.getValor1() + this.getValor2();
    }

    public Float subtracao() {
        return this.getValor1() - this.getValor2();
    }

    public Float divisao() {
        return this.getValor1() / this.getValor2();
    }

    public Float multiplicacao() {
        return this.getValor1() * this.getValor2();
    }

    public Float getValor1() {
        return valor1;
    }

    public Float getValor2() {
        return valor2;
    }

    public void setValor1(Float valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(Float valor2) {
        this.valor2 = valor2;
    }

}
