public class Cubo extends FormaTridimensional{

    private double lado;

    public Cubo( double lado){
        super("Cubo, formado por 6 quadrados.");
        this.lado = lado;
    }

    public double obterArea(){
        return (lado * lado * 6);
    }

    public double obterVolume(){
        return (lado * lado * lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
