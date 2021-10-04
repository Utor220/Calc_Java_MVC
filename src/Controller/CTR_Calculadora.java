package Controller;

import Model.Calculadora;
import Model.Extra;

import java.text.ParseException;

public class CTR_Calculadora {

    Calculadora Calculadora = new Calculadora(); //instância da classe Calculadora
    Extra Extra = new Extra(); //instância da classe Extra
   /* public Double adicao(Calculadora Calculadora) {
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
    }*/

    public void adicao (Calculadora Calculadora){
        Extra.str_num = Double.toString(Calculadora.getN1() + Calculadora.getN2());
    }

    public void subtracao (Calculadora Calculadora){
        Extra.str_num = Double.toString(Calculadora.getN1() + Calculadora.getN2());
    }

    public void divisao (Calculadora Calculadora){
        Extra.str_num = Double.toString(Calculadora.getN1() + Calculadora.getN2());
    }

    public void multiplicacao (Calculadora Calculadora){
        Extra.str_num = Double.toString(Calculadora.getN1() + Calculadora.getN2());
     }

    public void ac (Calculadora Calculadora){
        Calculadora.setN1(0.0);
        Calculadora.setN2(0.0);
        Extra.str_num = "";
    }

    public void sin (Calculadora Calculadora){
        Calculadora.setN1(Double.parseDouble(Extra.str_num));
        Calculadora.setResultado(Math.sin(Calculadora.getN1()));
    }

    public void cos (Calculadora Calculadora){
        Calculadora.setN1(Double.parseDouble(Extra.str_num));
        Calculadora.setResultado(Math.cos(Calculadora.getN1()));
    }

    public void tan (Calculadora Calculadora){
        Calculadora.setN1(Double.parseDouble(Extra.str_num));
        Calculadora.setResultado(Math.tan(Calculadora.getN1()));
    }

    public void m_add (Calculadora Calculadora){
        Calculadora.setResultado(Double.parseDouble(Extra.str_num)+ Calculadora.getN1());
    }

    public void m_min (Calculadora Calculadora){
        Extra.memoria = Extra.str_num;
    }

    public void mr (Calculadora Calculadora){
        Calculadora.getResultado();
    }

    public void mc (Calculadora Calculadora){
        Calculadora.setResultado(0.0);
    }

    public Extra igual (Calculadora Calculadora){
        return Extra;
    }

    public void PI (){
        Extra.str_num = Double.toString(Math.PI);
    }

    public void euler (){
        Extra.str_num = Double.toString(Math.E);
    }

    public void exp (Calculadora Calculadora){

        Math.exp(Calculadora.getN1());
    }

    public void log (Calculadora Calculadora){
        Math.log10(Calculadora.getN1());
    }
}
