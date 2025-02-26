public class Main {

    public static void main (String[] args){
        Candidato[] CandidatosTonantins = new Candidato[3];


        CandidatosTonantins[0] = new Candidato("FRANCISCO SALES DE OLIVEIRA", 29, 1, 1967, 'M', 1130000.00, true, 10, "Prefeito");

        CandidatosTonantins[1] = new Candidato("RADSON ALVES DE SOUZA", 18, 9, 1982, 'M', 200000.00, false, 15, "Prefeito");

        CandidatosTonantins[2] = new Candidato("FRANCE MARIA NASCIMENTO MARTINS", 24, 5, 1967, 'F', 600000.00, false, 11111, "Vereador");

        Eleicao eleicao1 = new Eleicao("Tonantis", 10362, CandidatosTonantins);
        eleicao1.PrintMunicipio();
        eleicao1.PrintVotantes();
        eleicao1.PrintCandidatos();

        Candidato[] CandidatosBelmonte= new Candidato[3];


        CandidatosBelmonte[0] = new Candidato("IEDO JOSE MENEZES ELIAS", 10, 8, 1958, 'M', 3357413.17, true, 55, "Prefeito");

        CandidatosBelmonte[1] = new Candidato("ALEX DO ROSARIO DOS SANTOS", 8, 10, 1985, 'M', 310000.00, false, 33, "Prefeito");

        CandidatosBelmonte[2] = new Candidato("FLAVIELLE VICTOR JOSÉ DE SÁ", 9, 9, 1972, 'M', 169800.00, false, 10, "Prefeito");

        Eleicao eleicao2 = new Eleicao("Belmonte", 12510, CandidatosBelmonte);
        eleicao2.PrintMunicipio();
        eleicao2.PrintVotantes();
        eleicao2.PrintCandidatos();




    }
}
