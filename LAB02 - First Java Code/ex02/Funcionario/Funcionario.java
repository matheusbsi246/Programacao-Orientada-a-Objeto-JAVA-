public class Funcionario {
    private double cpf;
    private String nome;
    private String nascimentoData;
    private String ingressoData;

    public Funcionario(double cpfAdd, String nomeAdd, String nascimentoDataAdd, String ingressoDataAdd) {
        cpf = cpfAdd;
        nome = nomeAdd;
        nascimentoData = nascimentoDataAdd;
        ingressoData = ingressoDataAdd;
    }

    public double getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String get_nascimentoData() {
        return nascimentoData;
    }

    public String get_ingressoData() {
        return ingressoData;
    }
}
