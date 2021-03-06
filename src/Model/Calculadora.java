package Model;

public class Calculadora {
    private Double n1;
    private Double n2;
    private Double resultado;
    private Double n1con;
    private Double n2con;
    private String memoria;
    private String respostaFinal;
    private String operador;
    private String str_num;
    private String verificacaoTrigonometrico;


    public Double getN1() {
        return n1;
    }

    public Double getN2() {
        return n2;
    }

    public Double getResultado() {
        return resultado;
    }

    public String getMemoria() {
        return memoria;
    }

    public String getRespostafinal() {
        return respostaFinal;
    }

    public String getOperador() {
        return operador;
    }

    public String getStr_num() {
        return str_num;
    }

    public Double getN1con() {
        return n1con;
    }

    public Double getN2con() {
        return n2con;
    }

    public String getVerificacaoTrigonometrico() {
        return verificacaoTrigonometrico;
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

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public void setRespostafinal(String respostaFinal) {
        this.respostaFinal = respostaFinal;
    } 

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setStr_num(String str_num) {
        this.str_num = str_num;
    }

    public void setN1con(Double n1con) {
        this.n1con = n1con;
    }

    public void setN2con(Double n2con) {
        this.n2con = n2con;
    }

    public void setVerificacaoTrigonometrico(String verificacaoTrigonometrico) {
        this.verificacaoTrigonometrico = verificacaoTrigonometrico;
    }
    
    public void ac (){
        setN1(0.0);
        setN2(0.0);
        setMemoria("0");
        setStr_num("0");
    }
}
