public abstract class ContaCorrente{

private float saldo;
private int estado; //1 = conta ativa, 2= conta inativa
private int numConta;
private int senha;
private int limite;

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public ContaCorrente(float val, int num, int pwd, int lim){
        nunConta = num;
        senha = pwd;
        saldo = val;
        estado = 1; // conta ativa
        limite = lim;
        }

public boolean debitaValor (float val, int pwd){
        if (pwd != senha)
        return (false); // senha deve ser válida
        if (estado != 1)
        return (false); // conta deve ser ativa
        if (val <= 0)
        return (false);
        if (val > saldo)
        return (false);
        saldo -= val;
        if(saldo == 0)
        estado = 2; // turna conta inativa
        return (true);
        }

public float getSaldo (int pwd){
        if(senha == pwd)
        return saldo;
        else
        return -1;
        }

public void creditaValor(int pwd, float val){
        if (senha == pwd)
        saldo += val;
        }

protected int getEstado(int pwd){
        if(senha == pwd)
        return estado;
        else
        return -1;
        }
protected void setEstado(int pwd, int e){
        if(senha = pwd)
        estado = e;
        }

protected boolean isSenha(int pwd){
        if( senha == pwd)
        return true;
        else
        return false;
        }

        }

