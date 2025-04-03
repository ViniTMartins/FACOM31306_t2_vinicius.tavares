public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean eMenorQue (Classificavel o) {
        Servico compara = (Servico) o;
        return (this.preco < compara.preco);
    }
}
