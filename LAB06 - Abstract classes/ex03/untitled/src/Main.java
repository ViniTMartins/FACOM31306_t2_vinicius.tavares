import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        float limite;
        ContaCorrente conta;
        UsaBanco usa = new UsaBanco();

        Scanner sc = new Scanner(System.in);
        limite = sc.nextFloat();
        if(limite == 0){
            conta = new ContaComum(sc.nextFloat(), sc.nextInt(), sc.nextInt());
        }
        else{
            conta = new ContaEspecial(sc.nextFloat(), sc.nextInt(), sc.nextInt(), limite);
        }

        usa.simulacaoContas();
    }
}
