import java.lang.Math;

public class Esfera extends FormaTridimencional {

    Esfera(double diametro) {
        super(diametro);
    }

    @Override
    public double obterArea() {
        double raio = getAltura() / 2;
        return 4 * Math.PI * (raio * raio);
    }

    @Override
    public double obterVolume() {
        double raio = getAltura() / 2;
        return (4 / 3) * Math.PI * (Math.pow(raio, 3)) ;
    }

}
