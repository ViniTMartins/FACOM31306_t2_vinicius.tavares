public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(String descricao, double lado){
        super(descricao);
        this.lado = lado;
    }

    public double obterArea(){
        return (lado * lado);
    }
}
