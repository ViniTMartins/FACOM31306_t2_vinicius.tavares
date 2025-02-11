import java.util.Scanner;

public class Main {
    public static int altera_preco(int pos, float[] preco, float porcetagem){
        float temp;

        if(porcetagem > -100){
            temp =  1 + porcetagem/100;
            preco[pos] = preco[pos] * temp;
            return 0;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtd_estoque = new int[4];


        for(int i = 0; i < 4; i++){
            System.out.printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d:\n", i);
            nome[i] = scan.next();
            preco[i] = scan.nextFloat();
            qtd_estoque[i] = scan.nextInt();
        }

        System.out.print("\nAumentando o preco em 10% do produto 1 e 3");
        altera_preco(0,preco,-110);
        altera_preco(2,preco,10);
        preco[0] = preco[0]*-110;

        System.out.print("\nReduzindo o preco em 5% do produto 2");
        if (altera_preco(1,preco,-5) == -1)
            System.out.print("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else{
            System.out.print("\n\nPreco alterado com sucesso");
        }

        System.out.print("\nReduzindo o preco do prod. 3");
        if (altera_preco(3,preco,-110) == -1)
            System.out.print("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else{
            System.out.print("\n\nPreco alterado com sucesso");
        }

        System.out.print("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++){
            System.out.printf("\nProduto: %s\nPreco: %f\nEstoque: %d\n", nome[i],preco[i],qtd_estoque[i]);
        }


    }

}