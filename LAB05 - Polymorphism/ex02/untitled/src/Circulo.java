

public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(String descricao, double raio){
        super(descricao);
        this.raio = raio;
    }

    public double obterArea(){
        return (Math.PI * raio * raio);
    }
}
