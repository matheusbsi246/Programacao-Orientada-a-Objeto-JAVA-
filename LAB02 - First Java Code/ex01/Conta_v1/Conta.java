public class Conta {
    private double limite;
    private double saldo;
    public double getSaldo(){
        return saldo;
    }
    public double getLimite(){
        return limite;
    }
    public void setLimite(double y){
        limite = y;
    }

    public void depositar (double x){
        if(x > 0){ 
            saldo = saldo + x;
        }
       
    }
    public void sacar(double x){
        
        if(saldo + limite >= x){
            saldo = saldo - x;
        }
    }
}
