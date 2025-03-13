public class Ingresso {
    protected double preco;

    public Ingresso(double preco){
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void escreveValor(){
        System.out.println("Preço: " + this.preco);
    }
}
