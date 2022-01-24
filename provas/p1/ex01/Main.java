import java.util.Scanner;

public class Main {
    public void main(string args[]){
        int n;
        Retangulo[] retangulos = new Retangulo[100];
        Ponto auxiliar1 = new Ponto();
        Ponto auxiliar2 = new Ponto();
        Ponto auxiliar3 = new Ponto();
        Ponto auxiliar4 = new Ponto();

        Scanner entrada = new Scanner(System.in);
        int x, y;
        n = entrada.nextInt();
        for(int i = 0; i < n; i++){
            x = entrada.nextInt();
            y = entrada.nextInt();
            auxiliar1.Ponto(x, y);
            x = entrada.nextInt();
            y = entrada.nextInt();
            auxiliar2.Ponto(x, y);
            x = entrada.nextInt();
            y = entrada.nextInt();
            auxiliar3.Ponto(x, y);
            x = entrada.nextInt();
            y = entrada.nextInt();
            auxiliar4.Ponto(x, y);
            retangulos[i].Retangulo(auxiliar1, auxiliar2, auxiliar3, auxiliar4);
        }
        entrada.close();
        //questao 02


    }
}
