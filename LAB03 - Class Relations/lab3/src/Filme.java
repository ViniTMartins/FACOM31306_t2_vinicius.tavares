import java.util.Arrays;

public class Filme {
    private String nome;
    private String genero;
    private String resumo;
    //Relacionamento Atores - Filme: Associação
    //Quando o relacionamento é de associação as classes são independentes, porém se "usam"
    private Ator[] atores;
    //Relacionamento Diretor - Filme: Agregação
    //Na agregação o relacionamento ainda mantem a independencia das classes em que se uma for deleta a outra se mantem,
    //porém nesse caso uma classe é parte de outra, elas nao apesam se usam.
    private Diretor diretor;
    //Relacionamento Avaliações - Filme: Composição
    //Na composição uma classe depende da outra para a sua sobrivivencia, nesse caso, se um filme deixar de existir as
    //suas avaliações tambem de existir.
    private Avaliacao[] avaliacoes;

    public Filme(String nome, String genero, String resumo, Ator[] atores, Diretor diretor, Avaliacao[] avaliacoes){
        this.nome = nome;
        this.genero = genero;
        this.resumo = resumo;
        this.atores = atores;
        this.diretor = diretor;
        this.avaliacoes = new Avaliacao[avaliacoes.length];
        for(int i = 0; i < avaliacoes.length; i++){
            this.avaliacoes[i] = new Avaliacao(avaliacoes[i].getNome(), avaliacoes[i].getDescricao(), avaliacoes[i].getNota());
        }

    }
    public Filme(String nome, String genero, String resumo, Diretor diretor, Avaliacao[] avaliacoes){
        this.nome = nome;
        this.genero = genero;
        this.resumo = resumo;
        this.atores = null;
        this.diretor = diretor;
        this.avaliacoes = new Avaliacao[avaliacoes.length];
        for(int i = 0; i < avaliacoes.length; i++){
            this.avaliacoes[i] = new Avaliacao(avaliacoes[i].getNome(), avaliacoes[i].getDescricao(), avaliacoes[i].getNota());
        }

    }

    public Filme(String nome, String genero, String resumo, Avaliacao[] avaliacoes){
        this.nome = nome;
        this.genero = genero;
        this.resumo = resumo;
        this.atores = null;
        this.diretor = null;
        this.avaliacoes = new Avaliacao[avaliacoes.length];
        for(int i = 0; i < avaliacoes.length; i++){
            this.avaliacoes[i] = new Avaliacao(avaliacoes[i].getNome(), avaliacoes[i].getDescricao(), avaliacoes[i].getNota());
        }

    }


    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getResumo() {
        return resumo;
    }

    public Ator[] getAtores() {
        return atores;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setAtores(Ator[] atores) {
        this.atores = atores;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public double NotaFilme(){
        int soma = 0;
        for(Avaliacao a : avaliacoes){
            soma += a.getNota();
        }
        return ((double) soma/avaliacoes.length);
    }

    public void PrintAvaliacoes(){
        System.out.println("Avaliações do filme: " + nome + "\n");
        for(Avaliacao a : avaliacoes){
            System.out.println(a.toString());
        }
    }
    public void PrintElenco(){
        System.out.println("Elenco do filme " + nome + "\n");
        System.out.println("Diretor:\n" + diretor + "\n");
        System.out.println("Atores:\n");

        for(Ator a : atores){
            System.out.println(a);
        }
    }

    private String NomeAtores(){
        String nomes = "";
        for(Ator a : atores){
            nomes = nomes + "\n" + a.getNome();
        }
        return nomes;
    }

    public String toString(){
        return "Nome do filme: " + nome + "\n" + "Genero: " + genero + "\n" + "Resumo: " + resumo
                + "\n" + "Nota Filme: " + NotaFilme() + "\n" + "Diretor: " + diretor.getNome() + "\n"
                + "Elenco do filme: " + NomeAtores();

    }
}
