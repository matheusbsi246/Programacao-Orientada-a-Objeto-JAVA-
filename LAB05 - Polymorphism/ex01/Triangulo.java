public class Triangulo extends FormaBidimensional {

    Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double obterArea() {
        return getAltura() * getBase();
    }
}
