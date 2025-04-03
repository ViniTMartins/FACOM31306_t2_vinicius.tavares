public class Funcionario {
    private String CPF;
    private String nome;
    private double salario;

    private double teto;

    public Funcionario (String CPF, String nome, double salario){
        this.CPF = CPF;
        this.nome = nome;
        this.salario = salario;
        this.teto = 40000;
    }

    public double getTeto() {
        return teto;
    }

    public void setTeto(double teto) {
        this.teto = teto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void Aumento(int porcento) throws IllegalRaiseException{
        double temp;
        temp = salario * (porcento/100.0 + 1);
        if(temp < 0){
            throw new IllegalRaiseException("Valor inválido de salário");
        }
        if(temp > teto) {
            throw new IllegalRaiseException("Valor ultrapassa o teto");
        }
        salario = temp;
    }
}
