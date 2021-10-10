package Controller;

import Model.Calculadora;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CTR_Calculadora {

    Calculadora Calculadora = new Calculadora(); //instância da classe Calculadora
    DecimalFormat df = new DecimalFormat("#.##",DecimalFormatSymbols.getInstance(Locale.US)); //Instancia da classe que formata o resultado das operações para utilizarem pontos ao invés de vírgulas;

    public void adicao (Calculadora Calculadora){
        
        Calculadora.setResultado(Calculadora.getN1() + Calculadora.getN2());
        Calculadora.setRespostafinal(df.format(Calculadora.getResultado())); //chamando o método respostafinal para ser exibido no txbCalc;
    }

    public void subtracao (Calculadora Calculadora){
        Calculadora.setResultado(Calculadora.getN1() - Calculadora.getN2());
        Calculadora.setRespostafinal(df.format(Calculadora.getResultado()));
    }

    public void divisao (Calculadora Calculadora){
        Calculadora.setResultado(Calculadora.getN1() / Calculadora.getN2());
        Calculadora.setRespostafinal(df.format(Calculadora.getResultado()));
    }

    public void multiplicacao (Calculadora Calculadora){
        Calculadora.setResultado(Calculadora.getN1() * Calculadora.getN2());
        Calculadora.setRespostafinal(df.format(Calculadora.getResultado()));
     }

    public void sin (Calculadora Calculadora){
        Calculadora.setResultado(Math.sin(Double.parseDouble(Calculadora.getStr_num())));
        
    }

    public void cos (Calculadora Calculadora){
        Calculadora.setN1(Double.parseDouble(Calculadora.getStr_num()));
        Calculadora.setResultado(Math.cos(Calculadora.getN1()));
    }

    public void tan (Calculadora Calculadora){
        Calculadora.setN1(Double.parseDouble(Calculadora.getStr_num()));
        Calculadora.setResultado(Math.tan(Calculadora.getN1()));
    }

    public Double PI (){
        return Math.PI;
    }

    public Double euler (){
        return Math.E;
    }

    public void exp (Calculadora Calculadora){

        Calculadora.setRespostafinal(df.format(Math.pow(Calculadora.getN1(), Calculadora.getN2())));
    }

    public void log (Calculadora Calculadora){
        Calculadora.setRespostafinal(df.format(Math.log10(Calculadora.getN1())));
    }
    
    public void Mplus(Calculadora Calculadora){
        Calculadora.setResultado(Calculadora.getN2con() + Calculadora.getN1con());
        Calculadora.setMemoria(df.format(Calculadora.getResultado()));
    }
    
    public void Mminus(Calculadora Calculadora){
        Calculadora.setResultado(Calculadora.getN2con() - Calculadora.getN1con());
        Calculadora.setMemoria(df.format(Calculadora.getResultado()));
    }
    
    public void MRead(){
        Calculadora.setStr_num(Calculadora.getMemoria());
    }
    
    public void Conversor(Calculadora Calculadora){ //método para converter as strings de memória e num pq não consegui pensar em outra coisa. Mas como dizem: "Se funciona, pra que mexer?";
        Calculadora.setN1con(Double.parseDouble(Calculadora.getStr_num()));
        Calculadora.setN2con(Double.parseDouble(Calculadora.getMemoria()));
    }
}
