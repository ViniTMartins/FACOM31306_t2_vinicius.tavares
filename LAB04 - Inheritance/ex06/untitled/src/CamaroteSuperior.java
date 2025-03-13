public class CamaroteSuperior extends VIP{
    private String localizacao;
    private double adicionalSup;

    public CamaroteSuperior(double preco, double adicional, double adicionalSup, String localizacao){
        super(preco, (adicional + adicionalSup));
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return localizacao;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public double getPreco(){
        return preco;
    }
}
