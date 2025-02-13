//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Candidato c1 = new Candidato();
        Candidato c2 = new Candidato();
        Candidato c3 = new Candidato();

        c1.SetNome("FRANCISCO SALES DE OLIVEIRA");
        c1.SetData(29, 1, 1967);
        c1.SetGenero('M');
        c1.SetTotalBens(1130000.00);
        c1.SetReeleicao(true);
        c1.SetNpartido(10);
        c1.SetCargo("Prefeito");

        c2.SetNome("RADSON ALVES DE SOUZA");
        c2.SetData(18, 9, 1982);
        c2.SetGenero('M');
        c2.SetTotalBens(200000.00);
        c2.SetReeleicao(false);
        c2.SetNpartido(15);
        c2.SetCargo("Prefeito");

        c3.SetNome("FRANCE MARIA NASCIMENTO MARTINS");
        c3.SetData(24, 5, 1967);
        c3.SetGenero('F');
        c3.SetTotalBens(600000.00);
        c3.SetReeleicao(false);
        c3.SetNpartido(11111);
        c3.SetCargo("Vereador");

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