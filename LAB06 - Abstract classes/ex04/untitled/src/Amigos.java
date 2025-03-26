public class Amigos extends Contato {
    private int grau;

    public Amigos(String apelido, String nome, String email, int diaAniversario, int mesAniversario, int grau) {
        super(apelido, nome, email, diaAniversario, mesAniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public String imprimirContato(){
        return (super.imprimirBasico()) + "\ngrau: " + grau;
    }
}