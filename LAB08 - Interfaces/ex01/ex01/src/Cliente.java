public class Cliente implements Classificavel{

    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue (Classificavel o) {
        Cliente compara = (Cliente) o;
        return (this.nome.compareTo(compara.nome)) < 0;
    }
}
