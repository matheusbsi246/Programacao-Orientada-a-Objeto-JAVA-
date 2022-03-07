public class Estudante extends Pessoa implements Senioridade {
    private String Matricula;
    private int CargaHorariaDisciplinas;

    public boolean ehSenior(Senioridade obj) {
        Estudante compara = (Estudante) obj;
        if (compara.CargaHorariaDisciplinas < this.CargaHorariaDisciplinas) {
            return true;
        } else {
            return false;
        }
    }

    Estudante(String cpf, String matricula, String nome) {

        super(cpf, nome);
        this.Matricula = matricula;

    }

    Estudante(String cpf, String matricula, String Nome, int CargaHorariaDisciplinas) {
        super(cpf, Nome);
        this.Matricula = matricula;
        this.CargaHorariaDisciplinas = CargaHorariaDisciplinas;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setCargaHorariaDisciplinas(int CargaHorariaDisciplinas) {
        this.CargaHorariaDisciplinas = CargaHorariaDisciplinas;
    }

    public int getCargaHorariaDisciplinas() {
        return CargaHorariaDisciplinas;
    }

    public void informacoesEstudante() {

    }
}
