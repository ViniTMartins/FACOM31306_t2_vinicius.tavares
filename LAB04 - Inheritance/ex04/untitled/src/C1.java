public class C1 {
    public int xi;
    protected int yi;
    private int zi;

    public C1(int xi, int yi, int zi) {
        this.xi = xi;
        this.yi = yi;
        this.zi = zi;
        System.out.println("C1: Chamada do construtor com parametros");
    }
    public C1(){
        this.xi = 0;
        this.yi = 0;
        this.zi = 0;
        System.out.println("C1: Chamada do construtor sem parametros");
    }

    public int getXi() {
        return xi;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public int getYi() {
        return yi;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }

    public int getZi() {
        return zi;
    }

    public void setZi(int zi) {
        this.zi = zi;
    }

    public void mostrar_atributos(){
        System.out.println("x1:" + xi);
        System.out.println("y1:" + yi);
        System.out.println("z1:" + zi);
    }
}
