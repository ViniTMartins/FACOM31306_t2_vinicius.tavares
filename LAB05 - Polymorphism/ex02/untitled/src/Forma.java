public class Forma {
    protected String descricao;

    public Forma(String descricao){
        this.descricao = descricao;
    }

    public void Descricao(){
        System.out.println(descricao);
    }

    public double obterVolume(){
        return 0.0;
    }
    public double obterArea(){
        return 0.0;
    }
}
