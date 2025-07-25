public class Eleicao {
    private String municipio;
    private int votantes;
    private Candidato[] candidatos;

    public Eleicao (String municipio, int votantes, Candidato[] candidatos){
        this.municipio = municipio;
        this.votantes = votantes;
        this.candidatos = candidatos;
    }

    public void PrintMunicipio(){
        System.out.printf("Municipio: %s\n", municipio);
    }

    public void PrintVotantes(){
        System.out.printf("Quantidade de votantes: %d\n", votantes);
    }

    public void PrintCandidatos(){

        System.out.print("Candidatos:\n\n");

        for (Candidato c : candidatos) {
            c.PrintNome();
            c.PrintData();
            c.PrintGenero();
            c.PrintTotalBens();
            c.PrintReeleicao();
            c.PrintNpartido();
            c.PrintCargo();

            System.out.print("\n\n\n");
        }
    }

    public int MaiorBens(){
        int maior = 0;
        for (int i = 0; i < candidatos.length; i++) {
            if(candidatos[i].getTotalBens() > candidatos[maior].getTotalBens()){
                maior = i;
            }
        }
        return maior;
    }

    public double PercentualBens(Candidato c){
        double somaBens = 0;
        for (Candidato candidato: candidatos) {
            somaBens += c.getTotalBens();
        }
        return  (c.getTotalBens()/somaBens)*100;
    }

}
