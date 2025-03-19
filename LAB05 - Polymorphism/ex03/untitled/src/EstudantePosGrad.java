public class EstudantePosGrad extends Estudante {
    private String formacao; // curso  de graduação que o estudante formou
    private String linhaDePesquisa;

    public EstudantePosGrad(String nome, String endereco, String formacao, String linhaDePesquisa) {
        super(nome, endereco);
        this.formacao = formacao;
        this.linhaDePesquisa = linhaDePesquisa;
    }


    public void print() {
        super.print();
        System.out.println("EstudantePosGrad{" +
                "formacao='" + formacao + '\'' +
                ", linhadDePesquisa='" + linhaDePesquisa + '\'' +
                '}');
    }

    //sem a sobrecarga do print nesta classe nao é permitido utilizar o polimorfismo para vetores de estudantes de pos graducao, nem imprimir os atributos dessas classes
    /*
    public void print(boolean l){
        if(l){
            System.out.print(formacao + ";" + linhaDePesquisa + ";");
        }
        else{
            System.out.println(formacao + "\n" + linhaDePesquisa);
        }
    }
     */

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getLinhaDePesquisa() {
        return linhaDePesquisa;
    }

    public void setLinhaDePesquisa(String linhaDePesquisa) {
        this.linhaDePesquisa = linhaDePesquisa;
    }
}
