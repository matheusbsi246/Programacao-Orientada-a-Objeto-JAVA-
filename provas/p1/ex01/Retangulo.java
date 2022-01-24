public class Retangulo {
    private Ponto p1 = new Ponto();
    private Ponto p2 = new Ponto();
    private Ponto p3 = new Ponto();
    private Ponto p4 = new Ponto();

    public void Retangulo(Ponto x, Ponto y, Ponto z, Ponto w){
        this.p1.Ponto(x);
        this.p2.Ponto(y);
        this.p3.Ponto(z);
        this.p4.Ponto(w);
    }

    public void Retangulo(){
        this.p1 = null;
        this.p2 = null;
        this.p3 = null;
        this.p4 = null;
    }


    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public Ponto getP3() {
        return p3;
    }

    public Ponto getP4() {
        return p4;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public void setP3(Ponto p3) {
        this.p3 = p3;
    }

    public void setP4(Ponto p4) {
        this.p4 = p4;
    }
}
