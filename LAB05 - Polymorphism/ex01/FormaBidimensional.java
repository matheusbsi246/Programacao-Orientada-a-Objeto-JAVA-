public abstract class FormaBidimensional extends Forma {
    private double base;

    FormaBidimensional(double base, double altura) {
        super(altura);
        this.base = base;
    }

    FormaBidimensional(double altura) {
        super(altura);
    }

    public abstract double obterArea();

    public double getBase() {
        return base;
    }
}