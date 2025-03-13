public class C3 extends C2{
    public int xiii;
    protected int yiii;
    private int ziii;

    public C3(int xi, int yi, int zi, int xii, int yii, int zii, int xiii, int yiii, int ziii) {
        super(xi, yi, zi, xii, yii, zii);
        this.xiii = xiii;
        this.yiii = yiii;
        this.ziii = ziii;
        System.out.println("C3: Chamada do construtor com parametros");
    }

    public C3(){
        xiii = 0;
        yiii = 0;
        ziii = 0;
        System.out.println("C3: Chamada do construtor sem parametros");
    }

    public int getXiii() {
        return xiii;
    }

    public void setXiii(int xiii) {
        this.xiii = xiii;
    }

    public int getYiii() {
        return yiii;
    }

    public void setYiii(int yiii) {
        this.yiii = yiii;
    }

    public int getZiii() {
        return ziii;
    }

    public void setZiii(int ziii) {
        this.ziii = ziii;
    }

    public void mostrar_atributos(){
        System.out.println("x1:" + xi);
        System.out.println("y1:" + yi);
        System.out.println("z1:" + getZi());
        System.out.println("x2:" + xii);
        System.out.println("y2:" + yii);
        System.out.println("z2:" + getZii());
        System.out.println("x3:" + xiii);
        System.out.println("y3:" + yiii);
        System.out.println("z3:" + ziii);
    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("x3:" + xiii);
        System.out.println("y3:" + yiii);
        System.out.println("z3:" + ziii);
    }
}
