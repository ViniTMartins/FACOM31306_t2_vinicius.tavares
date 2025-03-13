public class Operarios extends Funcionarios {

    private int valorProd;
    private int qtdProd;

    public Operarios(String nome, int dia, int mes, int ano, int valorProd, int qtdProd){
        super(nome, dia, mes, ano, (double)(valorProd * qtdProd));
        this.valorProd = valorProd;
        this.qtdProd = qtdProd;
    }

    public void Salario(int valorProd, int qtdProd){
        super.setSalario((double)(valorProd * qtdProd));
    }

    public int getValorProd() {
        return valorProd;
    }

    public void setValorProd(int valorProd) {
        this.valorProd = valorProd;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }

    public void print(){
        System.out.println("Tipo de Funcionario: Operario");
        System.out.println("Valor por producao: " + valorProd);
        System.out.println("Quantidade produzida: " + qtdProd);
        super.print();
    }
}
