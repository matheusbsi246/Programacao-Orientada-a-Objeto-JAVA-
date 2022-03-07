public class Universidade {

    public static void main(String[] args) {
        Estudante alunos[] = new Estudante[6];

        alunos[0] = new EstudanteGrad("012.123.432-44", "12411BSI382", "Maria Joaquina");
        alunos[1] = new EstudanteGrad("231.123.222-46", "12421BSI082", "Jaime Palillo");
        alunos[2] = new EstudanteGrad("982.147.472-34", "12421BSI142", "Kokimoto Mishima");

        alunos[3] = new EstudantePosGrad("482.347.472-44", "12313CCP105", "Cirilo Rivera");
        alunos[4] = new EstudantePosGrad("352.147.482-35", "12213CCP055", "Valéria Ferreira");
        alunos[5] = new EstudantePosGrad("788.245.742-94", "12213CCP048", "Helena Fernandes");

        for (int i = 0; i < 6; i++) {
            alunos[i].informacoesEstudante();
        }
        System.out.println("==================");
        System.out.println("tratando excessões");
        System.out.println("==================");

        EstudanteGrad estudante;
        estudante = (EstudanteGrad) alunos[0];
        try{
            estudante.setCargaHorariaComplementar(-2);
        }
        catch(CargaHorariaException e){
            System.out.println(e.getMessage());
        }
        try{
            estudante.setCargaHorariaComplementar(3001);
        }
        catch(CargaHorariaException e){
            System.out.println(e.getMessage());
        }
      

    }
}
