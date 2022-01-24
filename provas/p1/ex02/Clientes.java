public class Clientes {

    private double id;
    private String NascData = new String();
    private String nome = new String ();
    private String endereco = new String();
    private String cidadade = new String();
    private String gerenteResponsavel = new String();

    public Clientes(String nascData, String nome, String endereco, String cidadade, String gerenteResponsavel) {
        NascData = nascData;
        this.nome = nome;
        this.endereco = endereco;
        this.cidadade = cidadade;
        this.gerenteResponsavel = gerenteResponsavel;
    }


    public double getId() {
        return id;
    }

    public String getNascData() {
        return NascData;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidadade() {
        return cidadade;
    }

    public String getGerenteResponsavel() {
        return gerenteResponsavel;
    }


    public void setId(double id) {
        this.id = id;
    }

    public void setNascData(String nascData) {
        NascData = nascData;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidadade(String cidadade) {
        this.cidadade = cidadade;
    }

    public void setGerenteResponsavel(String gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }


}
