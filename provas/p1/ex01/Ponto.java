public class Ponto {
    private int coordenadaY;
    private int coordenadaX;

    // check: o ponto é formado por número real

    public void Ponto(int x, int y) {

        this.coordenadaX = x;
        this.coordenadaY = y;
    }
    
    public void Ponto(Ponto a) {
        this.coordenadaX =  a.getCoordenadaX();
        this.coordenadaY =  a.getCoordenadaY();
    }

    public void Ponto() {
        this.coordenadaX = -1;
        this.coordenadaY =  -1;
    }

    public void setCoordenadaX(int x){
        this.coordenadaX = x;

    }

    public int getCoordenadaX(){
       return  coordenadaX;

    }

    public void setCoordenadaY(int y){
        this.coordenadaY = y;

    }

    public int getCoordenadaY(){
       return  coordenadaY;

    }
    

}