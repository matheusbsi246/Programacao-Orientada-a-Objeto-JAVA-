

public abstract class Conta {

    protected double saldo;
    private Agencia agencia;
    private int numero;
    private Cliente titular;
    private static int numeroDeContas = 0;
    
    public Conta(Agencia agencia, int numero){
        Conta.numeroDeContas++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{
    	
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo de: " + this.saldo + ", é insufiencie para realizar este saque: ");
        } 
        
        this.saldo -= valor;       
    }

    public void transferencia(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public Agencia getAgencia(){
        return this.agencia;
    }

    public void setAgencia(Agencia agencia){
       if(agencia == null) {
           System.out.println("Agencia não encontrada");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.numeroDeContas;
    }

}