public class Main {

    public static void main (String[] args){
        Candidato[] Candidatos = new Candidato[3];

        Candidatos[0] = new Candidato(); 
        Candidatos[0].SetNome("FRANCISCO SALES DE OLIVEIRA");
        Candidatos[0].SetData(29, 1, 1967);
        Candidatos[0].SetGenero('M');
        Candidatos[0].SetTotalBens(1130000.00);
        Candidatos[0].SetReeleicao(true);
        Candidatos[0].SetNpartido(10);
        Candidatos[0].SetCargo("Prefeito");


        Candidatos[1] = new Candidato();
        Candidatos[1].SetNome("RADSON ALVES DE SOUZA");
        Candidatos[1].SetData(18, 9, 1982);
        Candidatos[1].SetGenero('M');
        Candidatos[1].SetTotalBens(200000.00);
        Candidatos[1].SetReeleicao(false);
        Candidatos[1].SetNpartido(15);
        Candidatos[1].SetCargo("Prefeito");

        Candidatos[2] = new Candidato();
        Candidatos[2].SetNome("FRANCE MARIA NASCIMENTO MARTINS");
        Candidatos[2].SetData(24, 5, 1967);
        Candidatos[2].SetGenero('F');
        Candidatos[2].SetTotalBens(600000.00);
        Candidatos[2].SetReeleicao(false);
        Candidatos[2].SetNpartido(11111);
        Candidatos[2].SetCargo("Vereador");


        for(Candidato c : Candidatos){
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
}
