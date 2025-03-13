public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double preco, double adicional, String localizacao){
        super(preco, adicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return localizacao;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }


}
