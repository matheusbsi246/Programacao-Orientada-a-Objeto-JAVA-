import java.util.Date;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String profissao;
    private Date dataNascimento;
    Endereco endereço;
    Gerente gerente;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public Gerente getGerente() {
        return gerente;
    }
}
