import java.lang.Math;

public class Tetraedro extends FormaTridimencional {

    Tetraedro(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double obterArea() {
        return getLado() * Math.pow(getLado(), (1 / 3));
    }

    @Override
    public double obterVolume() {
        double area = (1 / 3) * (getLado() * getLado());
        return getAltura() * area;
    }

}
