import java.lang.Math;

public class Cubo extends FormaTridimencional {
    Cubo(double altura) {
        super(altura);
    }

    @Override
    public double obterArea() {
        return 6 * (getAltura() * getAltura());
    }

    @Override
    public double obterVolume() {
        return Math.pow(getAltura(), 3);
    }
}
