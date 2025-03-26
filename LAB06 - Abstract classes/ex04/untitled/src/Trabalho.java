public class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String apelido, String nome, String email, int diaAniversario, int mesAniversario, String tipo) {
        super(apelido, nome, email, diaAniversario, mesAniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String imprimirContato(){
        return (super.imprimirBasico()) + "\ntipo: " + tipo;
    }
}