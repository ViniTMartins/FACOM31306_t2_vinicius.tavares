public class Tetraedro extends FormaTridimensional{
    private double lado;

    public Tetraedro( double lado){
        super("Tetraedro, formado por 4 triangulos");
        this.lado = lado;
    }

    public double obterArea(){
        return (lado*lado * Math.sqrt(3));
    }

    public double obterVolume(){
        return (lado*lado*lado * (Math.sqrt(2)/12));
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
