public class Triangulo extends FormaBidimensional{
    private double altura;
    private double base;

    public Triangulo(double altura, double base){
        super("Triangulo, uma forma com 3 angulos e 3 arestas");
        this.altura = altura;
        this.base = base;
    }

    public double obterArea(){
        return ((base * altura)/2);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
