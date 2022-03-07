public class Cliente extends Classificador implements Classificavel {
        private String Nome;

        public boolean eMenorQue(Classificavel obj) {
            Cliente compara = (Cliente) obj;
            if (this.Nome.compareTo(compara.Nome) < 0) {
                return true;
            } else {
                return false;
            }
        }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Cliente(String nome) {
        Nome = nome;
    }
}
