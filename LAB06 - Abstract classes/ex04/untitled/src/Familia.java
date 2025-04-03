public class Familia extends Contato {
    private String parentesco;

    public Familia(String apelido, String nome, String email, int diaAniversario, int mesAniversario, String parentesco) {
        super(apelido, nome, email, diaAniversario, mesAniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String imprimirContato(){
        return (super.imprimirBasico()) + "\nparentesco: " + parentesco;
    }
}
