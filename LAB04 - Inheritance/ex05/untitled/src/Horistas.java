public class Horistas extends Funcionarios {
    private double valPorHora;
    private int horasTrabalhadas;

    public Horistas(String nome, int dia, int mes, int ano, int valPorHora, int horasTrabalhadas) {
        super(nome, dia, mes, ano, (double)(valPorHora * horasTrabalhadas));
    }

    public void Salario(int valPorHora, int horasTrabalhadas){
        super.setSalario((double)(valPorHora * horasTrabalhadas));
    }

    public double getValPorHora() {
        return valPorHora;
    }

    public void setValPorHora(double valPorHora) {
        this.valPorHora = valPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
