import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Musico musico1;
        Musico musico2;
        Musico sub;
        String nomeDueto;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos duetos serão cadastrados:");
        n = sc.nextInt();
        Dueto[] duetos = new Dueto[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o nome do Dueto: ");
            nomeDueto = sc.next();
            System.out.println("Digite a informação do musico 1: ");
            musico1 = new Musico(sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
            System.out.println("Digite a informação do musico 2: ");
            musico2 = new Musico(sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
            System.out.println("Possui substituto? S/N");
            if(sc.next().equals("S")){
                System.out.println("Digite a informação do musico substituto: ");
                sub = new Musico(sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
                duetos[i] = new Dueto(nomeDueto, musico1, musico2, sub);
            }
            else{
                duetos[i] = new Dueto(nomeDueto, musico1, musico2);
            }

        }

        for(Dueto dueto : duetos){
            System.out.println(dueto);
        }
        int idRemuneracao = 0;
        for(int i = 1; i < n; i++){
            if(duetos[i].CalcRemunMedia() > duetos[idRemuneracao].CalcRemunMedia()){
                idRemuneracao = i;
            }
        }
        System.out.println("Dueto com maior remunaração: \n");
        System.out.println(duetos[idRemuneracao]);

        for(Dueto dueto : duetos){
            dueto = null;
        }

    }
}