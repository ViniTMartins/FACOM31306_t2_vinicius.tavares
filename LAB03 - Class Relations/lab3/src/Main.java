//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme1;
        Ator ator1;
        Ator ator2;
        Ator ator3;
        Ator[] atores = new Ator[3];
        Diretor diretor1;
        Avaliacao[] avaliacoes = new Avaliacao[5];
        String[] nomes = {"Joao", "Pedro", "Maria", "Augusto", "Eduarda"};
        String[] descs = {"Otimo Filme!", "Pessimo!!", "Merece mais reconhecimento", "Nada de mais", "PERFEITO!!!"};

        ator1 = new Ator("Isabelly Oliveira", 17, 0);
        ator2 = new Ator("Vinicius Martins", 18, 0);
        ator3 = new Ator("Pedro Silva", 24, 5);
        atores[0] = ator1;
        atores[1] = ator2;
        atores[2] = ator3;
        diretor1 = new Diretor("Bill Condon", 72, 40);

        for(int i = 0; i<5; i++){
            avaliacoes[i] = new Avaliacao(nomes[((int) (Math.random() * 5))], descs[((int) (Math.random() * 5))], (int) ((Math.random()* 10) + 1) );
        }

        filme1 = new Filme("606 Km", "Romance", "A historia de uma bela moça e um rapaz e a saga para combater os desafios impostos pela distancia e outros",
                            atores, diretor1, avaliacoes);

        System.out.println(filme1);
        System.out.print("\n\n\n\n\n\n\n");
        filme1.PrintAvaliacoes();
        System.out.print("\n\n\n\n\n\n\n");
        filme1.PrintElenco();

        //filme1 = null;
        //caso esse comando seja executado as avaliações dentro do filme serao deletadas tambem, caraterizando uma composição
        //entre as 2 classes

    }
}