public class Avaliacao {
    private String nome;
    private String descricao;
    private int nota;

    public Avaliacao(String nome, String descricao, int nota){
        this.nome = nome;
        this.descricao = descricao;
        this.nota = nota;
    }
    public Avaliacao(String descricao, int nota){
        this.nome = "Anonimo";
        this.descricao = descricao;
        this.nota = nota;
    }

    public Avaliacao(int nota){
        this.nome = "Anonimo";
        this.descricao = null;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNota() {
        return nota;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String toString(){
        return "Avaliador: " + nome + "\n" +
                "Nota:" + nota + "\n" +
                "Descrição:" + descricao + "\n";
    }
}
