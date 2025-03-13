public class VIP extends Ingresso{
    private double adicional;

    public VIP(double preco, double adicional){
        super((preco + adicional));
    }

    public double getPreco(){
        return preco;
    }

    public void escreverPreco(){
        System.out.println("Tipo: VIP");
        escreveValor();
    }
}
