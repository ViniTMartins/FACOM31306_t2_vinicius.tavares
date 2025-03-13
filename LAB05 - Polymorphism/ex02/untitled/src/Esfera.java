public class Esfera extends FormaTridimensional{

    private double raio;

    public Esfera(String descricao, double raio){
        super(descricao);
        this.raio = raio;
    }

    public double obterArea(){
        return (4 * Math.PI * raio * raio);
    }

    public double obterVolume(){
        return ((4/3) * Math.PI * raio * raio * raio);
    }

}
