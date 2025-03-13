public class Triangulo extends FormaBidimensional{
    private double altura;
    private double base;

    public Triangulo(String descricao, double altura, double base){
        super(descricao);
        this.altura = altura;
        this.base = base;
    }

    public double obterArea(){
        return ((base * altura)/2);
    }
}
