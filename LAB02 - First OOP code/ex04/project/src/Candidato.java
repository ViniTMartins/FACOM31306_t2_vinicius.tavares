public class Candidato {
    private String nome;
    private int ano, mes, dia;
    private char genero;
    private double totalBens;
    private boolean reelei;
    private int npartido;
    private String cargo;

    public Candidato(String nome, int ano, int mes, int dia, char genero, double totalBens, boolean reelei, int npartido, String cargo){
        this.nome = nome;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reelei = reelei;
        this.npartido = npartido;
        this.cargo = cargo;
    }

    public void PrintNome(){
        System.out.printf("Nome: %s \n", nome);
    }

    public void PrintData(){
        System.out.printf("Data de Nascimento: %d / %d / %d \n", dia, mes, ano);
    }

    public void PrintGenero(){
        System.out.printf("Genero: %c \n", genero);
    }

    public void PrintTotalBens(){
        System.out.printf("Total de Bens: R$%.2f \n", totalBens);
    }

    public void PrintReeleicao(){
        System.out.printf("Candidato a reeleição: %s \n", reelei ? "Sim" : "Nao");
    }

    public void PrintNpartido(){
        System.out.printf("Numero do partido: %d \n", npartido);
    }

    public void PrintCargo(){
        System.out.printf("Cargo pretendido: %s \n", cargo);
    }

}
