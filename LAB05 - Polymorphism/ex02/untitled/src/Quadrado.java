public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado){
        super("Quadrado, uma forma com 4 angulos e 4 arestas e todos os lado iguais");
        this.lado = lado;
    }

    public double obterArea(){
        return (lado * lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
