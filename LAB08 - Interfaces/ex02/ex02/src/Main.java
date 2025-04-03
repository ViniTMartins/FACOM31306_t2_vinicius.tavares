import java.util.Random;

public class Main {
    public static void main (String[] args){
        Cliente[] clientes = new Cliente[10];
        Produto[] produtos = new Produto[10];
        Servico[] servicos = new Servico[10];
        Classificador c = new Classificador();
        Random rand = new Random();
        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n" , "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String nome = new String();

        for(int i = 0; i < 10; i++){
            nome = "";
            for(int j = 0; j < 10; j++){
                nome += alfabeto[rand.nextInt(0, 26)];
            }
            clientes[i] = new Cliente(nome);
            produtos[i] = new Produto(rand.nextInt(0, 9999999));
            servicos[i] = new Servico(rand.nextDouble(0, 999999));
        }

        c.ordena(clientes);
        c.ordena(produtos);
        c.ordena(servicos);

        System.out.println("Clientes:");
        for(int i = 0; i < 10; i++){
            System.out.println(clientes[i].getNome());
        }
        System.out.println("Produtos:");
        for(int i = 0; i < 10; i++){
            System.out.println(produtos[i].getCodigo());
        }
        System.out.println("Servicos:");
        for(int i = 0; i < 10; i++){
            System.out.printf("%.02f \n", servicos[i].getPreco());
        }
    }
}
