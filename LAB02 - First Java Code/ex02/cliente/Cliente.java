class Cliente {
    private double cpf;
    private double cep;
    private String nome;
    private String nascimentoData;
    public Cliente(double cpfAdd, double cepAdd, String nomeAdd, String nascimentoDataAdd) {
        cpf = cpfAdd;
        cep = cepAdd;
        nome = nomeAdd;
        nascimentoData = nascimentoDataAdd;
    }

    public double getCpf(){
        return cpf;
    }
    public double getCep(){
        return cep;
    }
    public String getNome(){
        return nome;
    }

    public String get_nascimentoData(){
        return nascimentoData;
    }
}
