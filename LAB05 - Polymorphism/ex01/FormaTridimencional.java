public abstract class FormaTridimencional extends Forma {

    private double largura;
    private double lado;

    FormaTridimencional(double lado, double altura, double largura) {
        super(altura);
        this.lado = lado;
        this.largura = largura;
    }

    FormaTridimencional(double altura) {
        super(altura);
    }

    FormaTridimencional(double lado, double altura) {
        super(altura);
        this.lado = lado;
    }

    public abstract double obterArea();

    public abstract double obterVolume();

    public double getLargura() {
        return largura;
    }

    public double getLado() {
        return lado;
    }

}