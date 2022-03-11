public class Quadrado extends FormaBidimensional {

    Quadrado(double lado) {
        super(lado);
    }

    @Override
    public double obterArea() {
        return getAltura() * getAltura();
    }
}
