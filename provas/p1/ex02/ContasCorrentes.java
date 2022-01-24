import java

import java.util.Date; util.Date;
public class ContasCorrentes {

    private double contaId;
    private double[] clienteIds = new double[];
    private double saldo;
    private Date dataCriacao = new Date();
    private Date dataRecente = new Date();
    private OperacoesBancarias operacao = new OperacoesBancarias();


    public int realizarOperacao(String tipo, String operacao, double valor, Date data){

        return operacaoesBancaris.getId();
    }
    public ContasCorrentes(double[] clienteIds, double saldo, Date dataCriacao, Date dataRecente) {
        this.clienteIds = clienteIds;
        this.saldo = saldo;
        this.dataCriancao = dataCriancao;
        this.dataRecente = dataRecente;
    }

    public double getContaId() {
        return contaId;
    }

    public double[] getClienteIds() {
        return clienteIds;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getDataCriancao() {
        return dataCriancao;
    }

    public Date getDataRecente() {
        return dataRecente;
    }

    public void setClienteIds(double[] clienteIds) {
        this.clienteIds = clienteIds;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDataRecente(Date dataRecente) {
        this.dataRecente = dataRecente;
    }
}
