public class Diretor {
    private String nome;
    private int idade;
    private Filme[] filmes;
    private int experiencia;

    public Diretor(String nome, int idade, Filme[] filmes, int experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.filmes = filmes;
        this.experiencia = experiencia;
    }

    public Diretor(String nome, int idade, int experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.filmes = null;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Filme[] getFilmes() {
        return filmes;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setFilmes(Filme[] filmes) {
        this.filmes = filmes;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    private String FilmesDiretor(){
        if(filmes==null){return "";}
        String temp = "";
        for(Filme f : filmes){
            temp = temp + "\n" + f.getNome();
        }
        return temp;
    }

    public String toString() {
        return "nome: " + nome + "\n" +
                "idade: " + idade + "\n" +
                "anos de experiencia: " + experiencia + "\n" +
                "Filmes ja participados: " + FilmesDiretor();
    }

}
