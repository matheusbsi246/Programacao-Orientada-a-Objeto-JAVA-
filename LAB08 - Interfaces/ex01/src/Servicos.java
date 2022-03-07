public class Servicos extends Classificador implements Classificavel{

    private double preco;

    public boolean eMenorQue(Classificavel obj){

        Servicos compara = (Servicos) obj;
        if(this.preco < compara.preco)
            return true;
        else
            return false;
    }

    public Servicos(double preco) {
        this.preco = preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}

