public class EstudantePosGrad extends Estudante {

    String Nivel; // doutorado ou mestrado
    String TemaProjetoPesquisa;

    EstudantePosGrad(String cpf, String matricula, String nome) {

        super(cpf, matricula, nome);

    }

    EstudantePosGrad(String cpf, String matricula, String nome, String Nivel, int CargaHorariaDisciplinas,
            String TemaProjetoPesquisa) {

        super(cpf, matricula, nome, CargaHorariaDisciplinas);
        this.Nivel = Nivel;
        this.TemaProjetoPesquisa = TemaProjetoPesquisa;

    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        this.Nivel = nivel;
    }

    public String getTemaProjetoPesquisa() {
        return TemaProjetoPesquisa;
    }

    public void setTemaProjetoPesquisa(String temaProjetoPesquisa) {
        this.TemaProjetoPesquisa = temaProjetoPesquisa;
    }

    @Override 
    public void gerarCertificado(){
     System.out.println("Certifico que o" + getNome() + " participa do projeto" + getTemaProjetoPesquisa());   
    }

    @Override
    public void informacoesEstudante() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Carga Horária: " + getCargaHorariaDisciplinas());
        System.out.println("Nível: " + Nivel);
        System.out.println("Tema de pesquisa: " + TemaProjetoPesquisa);
    }
}
