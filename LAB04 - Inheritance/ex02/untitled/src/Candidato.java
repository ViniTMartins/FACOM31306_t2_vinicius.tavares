public class Candidato {
    protected String nome;
    protected int ano, mes, dia;
    protected char genero;
    protected double totalBens;
    protected boolean reelei;
    protected int npartido;

    public Candidato(String nome, int dia, int mes, int ano, char genero, double totalBens, boolean reelei, int npartido){
        this.nome = nome;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reelei = reelei;
        this.npartido = npartido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getTotalBens() {
        return totalBens;
    }

    public void setTotalBens(double totalBens) {
        this.totalBens = totalBens;
    }

    public boolean isReelei() {
        return reelei;
    }

    public void setReelei(boolean reelei) {
        this.reelei = reelei;
    }

    public int getNpartido() {
        return npartido;
    }

    public void setNpartido(int npartido) {
        this.npartido = npartido;
    }

    public String toString() {
        return "Candidato:" +
                " nome: " + nome + '\n' +
                " Data de Nascimento: " + dia + '/'+ mes + '/' + ano +'\n' +
                " genero: " + genero + '\n' +
                " total de bens: " + totalBens + '\n' +
                " candidato a reeleição: " + (reelei ?  "Sim" : "Nao") + '\n' +
                " numero do partido: " + npartido + '\n';
    }
}
