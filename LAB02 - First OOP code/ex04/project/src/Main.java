public class Main {
    public static void main(String[] args){
        Candidato c1 = new Candidato("FRANCISCO SALES DE OLIVEIRA", 29, 1, 1967, 'M', 1130000.00, true, 10, "Prefeito");
        Candidato c2 = new Candidato("RADSON ALVES DE SOUZA", 18, 9, 1982, 'M', 200000.00, false, 15, "Prefeito");
        Candidato c3 = new Candidato("FRANCE MARIA NASCIMENTO MARTINS", 24, 5, 1967, 'F', 600000.00, false, 11111, "Vereador");


        c1.PrintNome();
        c1.PrintData();
        c1.PrintGenero();
        c1.PrintTotalBens();
        c1.PrintReeleicao();
        c1.PrintNpartido();
        c1.PrintCargo();

        System.out.print("\n\n\n");

        c2.PrintNome();
        c2.PrintData();
        c2.PrintGenero();
        c2.PrintTotalBens();
        c2.PrintReeleicao();
        c2.PrintNpartido();
        c2.PrintCargo();

        System.out.print("\n\n\n");

        c3.PrintNome();
        c3.PrintData();
        c3.PrintGenero();
        c3.PrintTotalBens();
        c3.PrintReeleicao();
        c3.PrintNpartido();
        c3.PrintCargo();
    }
}
