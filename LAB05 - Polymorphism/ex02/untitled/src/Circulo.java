public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo( double raio){
        super("Circulo, formado da rotação completa de uma reta");
        this.raio = raio;
    }

    public double obterArea(){
        return (Math.PI * raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
