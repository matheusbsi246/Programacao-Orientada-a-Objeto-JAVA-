public class Cd extends item {

    private String artista;

    Cd(String titulo, String tempoDuracao, String comentarios, String artista) {
        super(titulo, tempoDuracao, comentarios);
        this.artista = artista;
    }

    @Override
    public void print() {
        super.print();
        System.out.printlm("\nArtista: " + artista);
    }

}