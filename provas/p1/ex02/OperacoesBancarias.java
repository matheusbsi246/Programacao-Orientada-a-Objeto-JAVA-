import java.util.Date;

public class OperacoesBancarias {
    private String tipo =  new String();
    private String operacao = new String();
    private double valor;
    private Date data = new Date();
    private double id;



    public OperacoesBancarias(String tipo, String operacao, double valor, Date data) {
        this.tipo = tipo;
        this.operacao = operacao;
        this.valor = valor;
        this.data = data;
        this.id++;
    }

    public String getTipo() {
        return tipo;
    }

    public String getOperacao() {
        return operacao;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setId(double id) {
        this.id = id;
    }
}

