
public class Main {

    public static void main(String[] args){
        Candidato c1 = new Candidato();
        Candidato c2 = new Candidato();
        Candidato c3 = new Candidato();

        c1.nome = "FRANCISCO SALES DE OLIVEIRA";
        c1.dia = 29;
        c1.mes = 1;
        c1.ano = 1967;
        c1.genero = 'M';
        c1.totalBens = 1130000.00;
        c1.reelei = true;
        c1.npartido = 10;
        c1.cargo = "Prefeito";

        c2.nome = "RADSON ALVES DE SOUZA";
        c2.dia = 18;
        c2.mes = 9;
        c2.ano = 1982;
        c2.genero = 'M';
        c2.totalBens = 200000.00;
        c2.reelei = false;
        c2.npartido = 15;
        c2.cargo = "Prefeito";

        c3.nome = "FRANCE MARIA NASCIMENTO MARTINS";
        c3.dia = 24;
        c3.mes = 5;
        c3.ano = 1967;
        c3.genero = 'F';
        c3.totalBens = 600000.00;
        c3.reelei = false;
        c3.npartido = 11111;
        c3.cargo = "Vereador";

        System.out.printf("Nome: %s\nData de Nascimento: %d / %d / %d \nGenero: %c \nTotal de Bens: R$%f \n", c1.nome, c1.dia, c1.mes, c1.ano, c1.genero, c1.totalBens);
        System.out.printf("Candidato a reeleição: %s \n", c1.reelei ? "Sim" : "Nao");
        System.out.printf("Numero do partido: %d \nCargo pretendido: %s", c1.npartido, c1.cargo);
        System.out.print("\n\n\n");
        System.out.printf("Nome: %s\nData de Nascimento: %d / %d / %d \nGenero: %c \nTotal de Bens: R$%f \n", c2.nome, c2.dia, c2.mes, c2.ano, c2.genero, c2.totalBens);
        System.out.printf("Candidato a reeleição: %s \n", c2.reelei ? "Sim" : "Nao");
        System.out.printf("Numero do partido: %d \nCargo pretendido: %s", c2.npartido, c2.cargo);
        System.out.print("\n\n\n");
        System.out.printf("Nome: %s\nData de Nascimento: %d / %d / %d \nGenero: %c \nTotal de Bens: R$%f \n", c3.nome, c3.dia, c3.mes, c3.ano, c3.genero, c3.totalBens);
        System.out.printf("Candidato a reeleição: %s \n", c3.reelei ? "Sim" : "Nao");
        System.out.printf("Numero do partido: %d \nCargo pretendido: %s", c3.npartido, c3.cargo);
    }


}