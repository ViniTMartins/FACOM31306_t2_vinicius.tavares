public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    public void print(boolean l){
        super.print(l);
        if(l){
            System.out.print(tituloTCC + ";");
        }
        else{
            System.out.println(tituloTCC);
        }
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }
}
