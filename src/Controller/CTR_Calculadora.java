package Controller;

import Model.Calculadora;

public class CTR_Calculadora {
    Calculadora Calculadora = new Calculadora();

    public Float adicao() {
        return Calculadora.getValor1() + Calculadora.getValor2();
    }

    public Float subtracao() {
        return Calculadora.getValor1() - Calculadora.getValor2();
    }

    public Float divisao() {
        return Calculadora.getValor1() / Calculadora.getValor2();
    }

    public Float multiplicacao() {
        return Calculadora.getValor1() * Calculadora.getValor2();
    }
}
