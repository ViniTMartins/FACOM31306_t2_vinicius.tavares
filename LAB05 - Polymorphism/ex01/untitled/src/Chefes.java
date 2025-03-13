public class Chefes extends Funcionarios {

    public Chefes(String nome, int dia, int mes, int ano, double salario){
        super(nome, dia, mes, ano, salario);
    }

    public void print(){
        System.out.println("Tipo de Funcionario: Chefe");
        super.print();
    }

}

