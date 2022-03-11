public class Dvd extends item {

    private String diretor;

    Dvd(String titulo, String tempoDuracao, String comentarios, String diretor) {
        super(titulo, tempoDuracao, comentarios);
        this.diretor = diretor;
    }

    @Override
    public void print() {
        super.print();
        System.out.printlm("\nDiretor: " + diretor);
    }

}