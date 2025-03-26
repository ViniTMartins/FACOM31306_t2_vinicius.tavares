import java.util.Random;

public class UsaBanco {

    Random rd = new Random();

    public void simulacaoContas(){
        ContaEspecial[] contas = new ContaEspecial[100];
        for(int i = 0; i < 100; i++){
            contas[i] = new ContaEspecial(rd.nextInt(), rd.nextInt(), 1234, rd.nextInt()%10000);
        }
        for(int i = 0; i < 100; i++){
            System.out.println(contas[i]);
            System.out.println("\n-----------------\n");
            System.out.println(contas[i].debitaValor(rd.nextInt(), 1234));
            System.out.println("\n-----------------\n");
            System.out.println(contas[i]);
        }
    }
}
