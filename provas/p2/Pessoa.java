public abstract class Pessoa {
    private String CPF;
    private String Nome;
    private boolean Vacinado;

 
    Pessoa(String cpf, String nome) {

        this.CPF = cpf;
        this.Nome = nome;
        Vacinado = false;
    }

    public void ApresentarCertificadoVacinacao() {
        this.Vacinado = true;
    }

    public void gerarCertificado(){
        
    }

    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
