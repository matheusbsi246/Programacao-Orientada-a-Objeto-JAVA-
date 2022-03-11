import java.lang.Math;

public class Circulo extends FormaBidimensional {

    Circulo(double diametro) {
        super(diametro);
    }

    @Override
    public double obterArea() {
        return ((getAltura() / 2) * (getAltura() / 2)) * Math.PI;
    }
}
