public class Operarios extends Funcionarios {

    private int valorProd;
    private int qtdProd;

    public Operarios(String nome, int dia, int mes, int ano, int valorProd, int qtdProd){
        super(nome, dia, mes, ano, (double)(valorProd * qtdProd));
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
}
