public class Produto {
    private double codigo;
    private double preco;
    private String nome;
    private String fabricante;

    public Produto(double codigoAdd, double precoAdd, String nomeAdd, String fabricanteAdd) {
        codigo = codigoAdd;
        preco = precoAdd;
        nome = nomeAdd;
        fabricante = fabricanteAdd;
    }

    public double getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getFabricante() {
        return fabricante;
    }
}
