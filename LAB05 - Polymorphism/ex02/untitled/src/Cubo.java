public class Cubo extends FormaTridimensional{

    private double lado;

    public Cubo(String descricao, double lado){
        super(descricao);
        this.lado = lado;
    }

    public double obterArea(){
        return (lado * lado * 6);
    }

    public double obterVolume(){
        return (lado * lado * lado);
    }
}
