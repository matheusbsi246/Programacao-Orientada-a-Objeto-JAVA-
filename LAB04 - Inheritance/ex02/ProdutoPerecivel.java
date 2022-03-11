import Date;
import java.util.Calendar;

public class ProdutoPerecivel extends Produto {

    Date data_Validade;
    Data data;

    public ProdutoPerecivel(int codigo, String descricao, int quatidade, Date data_Validade) {
        super(codigo, descricao, quatidade);
        this.data_Validade = data_Validade;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void retiraProduto(int qtd, java.sql.Date current) {
        if (qtd > quantidade) {
            System.out.println("Quantidade indisponível, o estoque atual é de " + this.quantidade);
        } else {
            quantidade = quantidade - qtd;
            System.out.println("O estoque atual é de: " + this.quantidade);
        }

    }

    public void acrescentaProduto(int qtd) {
        quantidade = quantidade + qtd;
        System.out.println("O estoque atual é de: " + this.quantidade);
    }

}
