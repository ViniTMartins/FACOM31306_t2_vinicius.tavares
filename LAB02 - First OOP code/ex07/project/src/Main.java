import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto prodEspecial = new Produto("especial", 100000, 1);
        prodEspecial = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos a serem cadastrados: ");
        int qtdProdutos = sc.nextInt();

        Produto[] listaProdutos = new Produto[qtdProdutos];

        for(int i = 0; i < listaProdutos.length; i++){
            System.out.println("Digite o nome do produto: ");
            listaProdutos[i] = new Produto(sc.next());
            System.out.println("Digite a quantidade de estoque do produto: ");
            listaProdutos[i].setQuantidade(sc.nextInt());
            System.out.println("Digite o preco do produto: ");
            listaProdutos[i].setPreco(sc.nextDouble());
        }

        for(int i = 0; i < listaProdutos.length; i++){
            int idMin = i;
            Produto temp;
            int j;
            for(j = i + 1; j < listaProdutos.length; j++){
                if(listaProdutos[j].getNome().compareTo(listaProdutos[idMin].getNome()) < 0){
                    idMin = j;
                }
            }
            temp = listaProdutos[i];
            listaProdutos[i] = listaProdutos[idMin];
            listaProdutos[idMin] = temp;

        }

        System.out.println("Produtos cadastrados:");

        for(int i = 0; i < listaProdutos.length; i++){
            listaProdutos[i].PrintProduto();
        }

    }
}