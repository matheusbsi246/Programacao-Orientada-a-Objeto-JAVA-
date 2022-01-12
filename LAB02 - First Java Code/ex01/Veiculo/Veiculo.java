class Veiculo {
    private String marca;
    private String placa;
    private int kilometragem;

    public Veiculo(String m, String p, int k) {
        marca = m;
        placa = p;
        kilometragem = k;
    }

    public String getPlaca() {
        return placa;
    }

    public String GetMarca() {
        return marca;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int k) {
        kilometragem = k;
    }
}