public class Tetraedro extends FormaTridimensional{
    private double altura;
    private double base;

    public Tetraedro(String descricao, double altura, double base){
        super(descricao);
        this.altura = altura;
        this.base = base;
    }

    public double obterArea(){
        return ((base * altura)/2);
    }
}
