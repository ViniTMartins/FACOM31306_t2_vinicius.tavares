import java.util.Random;


public class UsaBanco {
    ContaCorrente[] contas = new ContaCorrente[100];
    Random rand = new Random();

    public void CriaContas(){
        for(int i = 0; i< 100; i++){
            contas[i] = new ContaEspecial(rand.nextFloat()*i*100, 1, rand.nextInt(1, 10000), rand.nextInt(1, 10000));
        }
    }

    public void ImprimeContas(){
        for(ContaCorrente c : contas){
            System.out.println(c);
        }

    }

    public void debitaContas(){
        for(ContaCorrente c : contas){
            //System.out.println("\n\n\n" + c);
        }
    }
}
