public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){
        this.nome = "X";
        this.preco = 0.0;
        this.quantidade = 0;
    }
    public Produto(String nome){
        this.nome = nome;
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.preco = 0.0;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void PrintProduto(){
        System.out.printf("\nNome: %s \nPreco: %f \nQuantidade: %d \n", nome, preco, quantidade);
    }

    public void AlteraPreco(float porcentagem){
        if(porcentagem > -100){
            preco = preco * (1 + (porcentagem/100));
        }
    }
}
