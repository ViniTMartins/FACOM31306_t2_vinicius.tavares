public class Main {

    public static void main (String[] args){
        Candidato[] CandidatosCaratinga = new Candidato[5];


        CandidatosCaratinga[0] = new Candidato("GIOVANNI CORREA DA SILVA", 21, 3, 1960, 'M',  3175103.20, false, 22, "Prefeito");

        CandidatosCaratinga[1] = new Candidato("JOHNY CLAUDY FERNANDES", 8, 6, 1974, 'M', 540000.00, false, 45, "Prefeito");

        CandidatosCaratinga[2] = new Candidato("JULIO CESAR RIBEIRO ALVES", 28, 1, 1990, 'M',  1175500.00, false, 25, "Prefeito");

        CandidatosCaratinga[3] = new Candidato("PEDRO CLAUDIO COUTINHO LEITAO", 17, 7, 1973, 'M',  1768015.42, false, 12, "Prefeito");

        CandidatosCaratinga[4] = new Candidato("ROGÉRIO SOARES DE FREITAS", 19, 10, 1972, 'M',  202896.65, false, 10, "Prefeito");

        Eleicao eleicao1 = new Eleicao("Caratinga", 47769, CandidatosCaratinga);
        eleicao1.PrintMunicipio();
        eleicao1.PrintVotantes();
        eleicao1.PrintCandidatos();

        System.out.println("Candidato com maior quantidade de bens totais:");

        int idMaiorBens = eleicao1.MaiorBens();
        CandidatosCaratinga[idMaiorBens].PrintNome();
        CandidatosCaratinga[idMaiorBens].PrintData();
        CandidatosCaratinga[idMaiorBens].PrintGenero();
        CandidatosCaratinga[idMaiorBens].PrintTotalBens();
        CandidatosCaratinga[idMaiorBens].PrintReeleicao();
        CandidatosCaratinga[idMaiorBens].PrintNpartido();
        CandidatosCaratinga[idMaiorBens].PrintCargo();

        System.out.printf("Percentual dos bens do candidato nas eleições: %.1f%% \n", eleicao1.PercentualBens(CandidatosCaratinga[idMaiorBens]));




    }
}
