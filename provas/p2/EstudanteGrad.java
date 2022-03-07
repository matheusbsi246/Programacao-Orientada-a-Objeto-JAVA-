public class EstudanteGrad extends Estudante {

    private int CargaHorariaComplementar;
    private String TituloTCC;
    private String LocalEstagio;

    EstudanteGrad(String cpf, String matricula, String nome) {

        super(cpf, matricula, nome);

    }

    EstudanteGrad(String cpf, String matricula, String nome, int CargaHorariaDisciplinas, int CargaHorariaComplementar,
            String TituloTCC, String LocalEstagio) {

        super(cpf, matricula, nome, CargaHorariaDisciplinas);
        this.CargaHorariaComplementar = CargaHorariaComplementar;
        this.TituloTCC = TituloTCC;
        this.LocalEstagio = LocalEstagio;

    }

    public int getCargaHorariaComplementar() {
        return CargaHorariaComplementar;
    }

    public void setCargaHorariaComplementar(int cargaHorariaComplementar) {

        if (cargaHorariaComplementar > 3000) {
            throw new CargaHorariaException("Carga horaria acima do limite");
        } else if (cargaHorariaComplementar < 0) {
            System.out.println("entrou");
            throw new CargaHorariaException("a carga horaria não pode ser negativa");
        } else {
            CargaHorariaComplementar = cargaHorariaComplementar;
        }

    }

    public String getTituloTCC() {
        return TituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        TituloTCC = tituloTCC;
    }

    public String getLocalEstagio() {
        return LocalEstagio;
    }

    public void setLocalEstagio(String localEstagio) {
        LocalEstagio = localEstagio;
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Certifico que o" + getNome() + "  realiza estágio em" + getLocalEstagio());
    }

    @Override
    public void informacoesEstudante() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Carga Horária: " + getCargaHorariaDisciplinas());
        System.out.println("Horas complementares: " + CargaHorariaComplementar);
        System.out.println("Local do estágio: " + CargaHorariaComplementar);
        System.out.println("Título do TCC: " + TituloTCC);
    }
}
