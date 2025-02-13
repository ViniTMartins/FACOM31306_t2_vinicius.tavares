public class Candidato {
    private String nome;
    private int ano, mes, dia;
    private char genero;
    private double totalBens;
    private boolean reelei;
    private int npartido;
    private String cargo;

    public void SetNome(String nomeCandidato){
        nome = nomeCandidato;
    }

    public void SetData(int diaCandidato, int mesCandidato, int anoCandidato){
        dia = diaCandidato;
        mes = mesCandidato;
        ano = anoCandidato;
    }

    public void SetGenero(char generoCandidato){
        genero = generoCandidato;
    }

    public void SetTotalBens(double totalBensCandidato){
        totalBens = totalBensCandidato;
    }

    public void SetReeleicao(boolean reeleicaoCandidato){
        reelei = reeleicaoCandidato;
    }

    public void SetNpartido(int npartidoCandidato){
        npartido = npartidoCandidato;
    }


    public void SetCargo(String cargoCandidato){
        cargo = cargoCandidato;
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