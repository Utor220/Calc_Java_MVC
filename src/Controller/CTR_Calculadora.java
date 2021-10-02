package Controller;

import Model.Calculadora;
import Model.Extra;

public class CTR_Calculadora {

    Calculadora Calculadora = new Calculadora(); //instância da classe Calculadora
    Extra Extra = new Extra(); //instância da classe Extra
    public Double adicao(Calculadora Calculadora) {
        return Calculadora.getValor1() + Calculadora.getValor2();
    }

    public Double subtracao(Calculadora Calculadora) {
        return Calculadora.getValor1() - Calculadora.getValor2();
    }

    public Double divisao(Calculadora Calculadora) {
        return Calculadora.getValor1() / Calculadora.getValor2();
    }

    public Double multiplicacao(Calculadora Calculadora) {
        return Calculadora.getValor1() * Calculadora.getValor2();
    }

    public Double log(Calculadora Calculadora){

        return Math.log(Calculadora.getValor1()) / Math.log(Calculadora.getValor2());
    }

    public Double sen(Calculadora Calculadora){
        Extra.extra = Math.toRadians(Calculadora.getValor1());
        return Math.sin(Extra.extra);
    }

    public Double cos(Calculadora Calculadora){
        Extra.extra = Math.toRadians(Calculadora.getValor1());
        return Math.cos(Extra.extra);
    }

    public Double tg(Calculadora Calculadora){
        Extra.extra = Math.toRadians(Calculadora.getValor1());
        return Math.tan(Extra.extra);
    }
}
