public class Vendedores extends Funcionarios {
    private double comissao;
    private int vendas;

    public Vendedores(String nome, int dia, int mes, int ano, double salario, double comissao, int vendas) {
        super(nome, dia, mes, ano, (salario + (comissao * vendas)));
    }

    public void Salario(double salario, double comissao, int vendas){
        super.setSalario((salario + (comissao * vendas)));
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
}
