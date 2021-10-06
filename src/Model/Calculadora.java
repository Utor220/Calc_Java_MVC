package Model;

public class Calculadora {
    private Double n1;
    private Double n2;
    private Double resultado;


    public Double getN1() {
        return n1;
    }

    public Double getN2() {
        return n2;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    public void ac (){
        setN1(0.0);
        setN2(0.0);
    }
}
