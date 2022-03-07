public class ContaEspecial extends ContaCorrenteAbstrata {


    public ContaEspecial(float val, int num, int pwd, int limite) {
        super(val, num, pwd, limite);
    }

    public void debitaValor (float val ){
        int x = this.getSaldo();
    }
}