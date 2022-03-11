public class Produtow {
    protected int codigo;
    protected String descricao;
    protected int quantidade;

    public Produto(int codigo, String descricao, int quatidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quatidade;
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

    public void retiraProduto(int qtd) {
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
