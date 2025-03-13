public class C2 extends C1{
    public int xii;
    protected int yii;
    private int zii;

    public C2(int xi, int yi, int zi, int xii, int yii, int zii) {
        super(xi, yi, zi);
        this.xii = xii;
        this.yii = yii;
        this.zii = zii;
        System.out.println("C2: Chamada do construtor com parametros");
    }
    public C2(){
        this.xii = 0;
        this.yii = 0;
        this.zii = 0;
        System.out.println("C2: Chamada do construtor sem parametros");
    }

    public int getXii() {
        return xii;
    }

    public void setXii(int xii) {
        this.xii = xii;
    }

    public int getYii() {
        return yii;
    }

    public void setYii(int yii) {
        this.yii = yii;
    }

    public int getZii() {
        return zii;
    }

    public void setZii(int zii) {
        this.zii = zii;
    }

    public void  mostrar_atributos(){
        System.out.println("x1:" + xi);
        System.out.println("y1:" + yi);
        System.out.println("z1:" + getZi());
        System.out.println("x2:" + xii);
        System.out.println("y2:" + yii);
        System.out.println("z2:" + getZii());
    }

    public void  mostrar_atributos_super(){
        super.mostrar_atributos();
        System.out.println("x2:" + xii);
        System.out.println("y2:" + yii);
        System.out.println("z2:" + zii);
    }
}
