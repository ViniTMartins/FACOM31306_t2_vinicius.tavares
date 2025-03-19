public class Esfera extends FormaTridimensional{

    private double raio;

    public Esfera(double raio){
        super("Esfera, um sólido formado a partir da rotação completa de um circulo");
        this.raio = raio;
    }

    public double obterArea(){
        return (4 * Math.PI * raio * raio);
    }

    public double obterVolume(){
        return ((4/3) * Math.PI * raio * raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
