package Controller;

import Model.Calculadora;
import Model.Extra;

import java.text.ParseException;
import java.util.*;

public class CTR_Calculadora {

    Calculadora Calculadora = new Calculadora(); //instância da classe Calculadora
    Extra Extra = new Extra(); //instância da classe Extra

    public void adicao (Calculadora Calculadora){
        
        Calculadora.setResultado(Calculadora.getN1() + Calculadora.getN2());
        Calculadora.setRespostafinal(String.format("%.2f",Calculadora.getResultado()));
    }

    public void subtracao (Calculadora Calculadora){
        Calculadora.setResultado(Calculadora.getN1() - Calculadora.getN2());
        Calculadora.setRespostafinal(String.format("%.2f",Calculadora.getResultado()));
    }

    public void divisao (Calculadora Calculadora){
        Calculadora.setResultado(Calculadora.getN1() / Calculadora.getN2());
        Calculadora.setRespostafinal(String.format("%.2f",Calculadora.getResultado()));
    }

    public void multiplicacao (Calculadora Calculadora){
        Calculadora.setResultado(Calculadora.getN1() * Calculadora.getN2());
        Calculadora.setRespostafinal(String.format("%.2f",Calculadora.getResultado()));
     }

    public void sin (Calculadora Calculadora){
        //Calculadora.setResultado(Math.sin(Double.parseDouble(Extra.str_num))); ta dando zika
        
    }

    public void cos (Calculadora Calculadora){
        Calculadora.setN1(Double.parseDouble(Extra.str_num));
        Calculadora.setResultado(Math.cos(Calculadora.getN1()));
    }

    public void tan (Calculadora Calculadora){
        Calculadora.setN1(Double.parseDouble(Extra.str_num));
        Calculadora.setResultado(Math.tan(Calculadora.getN1()));
    }

    public Extra igual (Calculadora Calculadora){
        return Extra;
    }

    public void PI (){
        Extra.str_num = Double.toString(Math.PI);
    }

    public Double euler (){
        return Math.E;
    }

    public void exp (Calculadora Calculadora){

        Math.exp(Calculadora.getN1());
    }

    public void log (Calculadora Calculadora){
        Math.log10(Calculadora.getN1());
    }
}
