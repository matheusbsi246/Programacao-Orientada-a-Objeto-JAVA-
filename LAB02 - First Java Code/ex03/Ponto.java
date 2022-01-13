import java.util.Scanner;

public class Ponto {
    float coordenadaX;
    float coordenadaY;

    public void imprimePonto() {
        System.out.printf("(%.2f, %.2f) \n", coordenadaX, coordenadaY);
    }

    public void somaPonto(Ponto p, Ponto p2) {
        Ponto p3 = new Ponto();
        p3.coordenadaX = p.coordenadaX + p2.coordenadaX;
        p3.coordenadaY = p.coordenadaY + p2.coordenadaY;
        p.imprimePonto();
        System.out.print("a Soma de ");
        p.imprimePonto();
        System.out.print("com ");
        p2.imprimePonto();
        System.out.print("é ");
        p3.imprimePonto();
    }

    public static void somaPontoVoid(Ponto p, Ponto p2, Ponto p3) {
        p3.coordenadaX = p.coordenadaX + p2.coordenadaX;
        p3.coordenadaY = p.coordenadaY + p2.coordenadaY;
    }

    public static float calculaAreaRetangulo(Ponto p, Ponto p2) {
        if (p.coordenadaX == p2.coordenadaX || p2.coordenadaX == p.coordenadaY) {
            return -1;
        } else {
            float base;
            float altura;
            base = (p.coordenadaX - p2.coordenadaX) * (p.coordenadaX - p2.coordenadaX);
            altura = (p.coordenadaY - p2.coordenadaY) * (p.coordenadaY - p2.coordenadaY);
            return base * altura;
        }
    }

    public Ponto multiplicaPonto(Ponto p, int x) {
        Ponto p2 = new Ponto();
        p2.coordenadaX = p.coordenadaX * x;
        p2.coordenadaY = p.coordenadaY * x;
        return p2;
    }

    public Ponto inc_dir(Ponto p, char c) {
        Ponto p2 = new Ponto();
        p2 = p;
        if (c == 'n') {
            p2.coordenadaY++;
        }
        if (c == 's') {
            p2.coordenadaY--;
        }
        if (c == 'l') {
            p2.coordenadaX++;
        }
        if (c == 'o') {
            p2.coordenadaX--;
        }
        return p2;
    }

    public Ponto inc_diagonal(Ponto p, String c) {
        Ponto p2 = new Ponto();
        if (c == "sudoeste") {
            p2 = inc_dir(p, 's');
            p2 = inc_dir(p, 'o');
        }
        if (c == "nordeste") {
            p2 = inc_dir(p, 'n');
            p2 = inc_dir(p, 'o');
        }
        if (c == "noroeste") {
            p2 = inc_dir(p, 'l');
            p2 = inc_dir(p, 'n');
        }
        if (c == "sudeste") {
            p2 = inc_dir(p, 's');
            p2 = inc_dir(p, 'l');
        }
        return p2;
    }
    public static Ponto[] arrayPonto(int i){
        Ponto[] vP = new Ponto[i];
        for ( int j = 0; j < i; j++){
            vP[j] = new Ponto();
        }
        return vP;
    }
    public static void main(String args[]) {
        System.out.println("Quantos Pontos deseja cadastrar?");
        Scanner entrada = new Scanner(System.in);
        int nPontos = entrada.nextInt();
        Ponto[] vP = arrayPonto(nPontos);
        Ponto p = new Ponto();
        p.coordenadaX = 0;
        p.coordenadaY = 0;
        for (int i = 0; i < nPontos; i++) {
            System.out.println("digite a coordenada X e do Y, respectivamente, do ponto " + (i + 1));
            p.coordenadaX = entrada.nextFloat();
            p.coordenadaY = entrada.nextFloat();
            vP[i] = p;
            vP[i].imprimePonto();
        }
        System.out.println("fddddddddddddddddddddddddddddsddddddddddddddddddddfd ");
        vP[0].imprimePonto();
        Ponto maisADireita = new Ponto();
        Ponto maisAEsquerda =new Ponto();
        Ponto maisAcima =new Ponto();
        Ponto maisAbaixo = new Ponto();
        for (int j = 1; j < nPontos; j++) {
            if (maisADireita.coordenadaX < vP[j].coordenadaX) {
                maisADireita = vP[j];
                System.out.println("fdsddddddddddddddddddddfd ");
                maisADireita.imprimePonto();
            }
            if (maisAEsquerda.coordenadaX > vP[j].coordenadaX) {
                maisAEsquerda = vP[j];
            }
            if (maisAcima.coordenadaY < vP[j].coordenadaY) {
                maisAcima = vP[j];
            }
            if (maisAbaixo.coordenadaY > vP[j].coordenadaY) {
                maisAbaixo = vP[j];
            }
        }
        System.out.print("Ponto mais a direita ");
        maisADireita.imprimePonto();
        System.out.print("Ponto mais a esquerda ");
        maisAEsquerda.imprimePonto();
        System.out.print("Ponto mais abaixo ");
        maisAbaixo.imprimePonto();
        System.out.print("Ponto mais acima ");
        maisAcima.imprimePonto();
        entrada.close();
    }
}