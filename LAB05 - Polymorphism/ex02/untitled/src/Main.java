public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];

        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(5);
        formas[2] = new Triangulo(5,5);
        formas[3] = new Esfera(5);
        formas[4] = new Cubo(5);
        formas[5] = new Tetraedro(5);

        for(Forma f : formas){
            f.Descricao();
            if(f instanceof FormaTridimensional){
                System.out.println("Volume: " + f.obterVolume());
            }
            else if(f instanceof FormaBidimensional){
                System.out.println("Area: " + f.obterArea());
            }
            else{
                System.out.println("Forma nao suportada");
            }
        }
    }
}
