public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected int diaAniversario ;
    protected int mesAniversario ;

    public Contato(String apelido, String nome, String email, int diaAniversario, int mesAniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.diaAniversario = diaAniversario;
        this.mesAniversario = mesAniversario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    public String imprimirBasico(){
        return "\nApelido: " + apelido + "\nnome: " + nome + "\nemail: " + email + "\nData de aniversario: " + diaAniversario + "/" + mesAniversario;
    }
}
