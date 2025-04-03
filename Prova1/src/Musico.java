public class Musico {
    // definições
    private String nome;
    private String papel;
    private int experiencia;
    private float remuneracao;
    // construtor
    public Musico(String nome, String papel, int experiencia, float remuneracao){
        this.nome = nome;
        this.papel = papel;
        this.experiencia = experiencia;
        this.remuneracao = remuneracao;

    }

    // Métodos Get/Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public float getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(float remuneracao) {
        this.remuneracao = remuneracao;
    }



    public String toString(){
        return "nome: " + nome + "\n" + "papel: " + papel  + "\n" + "experiencia: " + experiencia + "\n" +  "remuneração: " + remuneracao + "\n";
    }

}
