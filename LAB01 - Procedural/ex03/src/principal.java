import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("\n<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.print("Os valores lidos são: ");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("\n\n<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.print("Os valores lidos são: ");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("\n\n<< Listando um vetor em ordem inversa>>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.print("A ordem inversa dos números é: ");
        for (int i = 5; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("\n\n<< Listando um vetor de números pares >>");

        for (int i = 0; i < 6;){
            System.out.printf("Entre com o número %d:\n",i+1);
            int val = sc.nextInt();
            if(val%2 == 0){
                vet[i++] = val;
            }
            else{
                System.out.print("Erro: Valor invalido\n\n");
            }

        }

        System.out.print("Os números pares digitados foram: ");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("\n\n<< 5 valores >>");
        int max = 0, min = 0;
        float med = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(i == 0 || vet[i] > max){
                max = vet[i];
            }
            if(i == 0 || vet[i] < min){
                min = vet[i];
            }
            med = med + vet[i];
        }
        med = med/5;

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\no maior valor é: %d \n",max);
        System.out.printf("o menor valor é: %d \n",min);
        System.out.printf("média é: %.1f \n",med);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("\n<< 5 valores >>");
        int max = 0, min = 0, idmax = 0, idmin = 0;
        float med = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(i == 0 || vet[i] > max){
                max = vet[i];
                idmax = i;
            }
            if(i == 0 || vet[i] < min){
                min = vet[i];
                idmin = i;
            }
            med = med + vet[i];
        }
        med = med/5;

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\no maior valor é: %d localizado na posição %d do vetor\n",max, idmax);
        System.out.printf("o menor valor é: %d ,localizado na posição %d do vetor\n",min, idmin);
        System.out.printf("média é: %.1f \n",med);
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("\n<< Normalizando as notas >>");
        int max = 0;
        double ratio = 0;
        float med = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(i == 0 || vet[i] > max){
                max = vet[i];
            }
        }
        ratio = (100.0/max);

        System.out.println("Notas normalizadas\n\n");

        for (int i = 0; i < 5; i++){
            System.out.printf("A nota do aluno %d é %f\n",i+1, (vet[i]) * ratio);
        }


    }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("\n<< Média e desvio-padrão >>");
        float med = 0, devmed = 0;
        double strdev = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            med = med + vet[i];
        }
        med = med/5;

        for (int i = 0; i < 5; i++){
            devmed += (vet[i]-med) * (vet[i]-med);
        }

        strdev = Math.sqrt(devmed/4);

        System.out.printf("A média é %.1f e o desvio-padrão é %.13f \n",med, strdev);
    }

    public static int ex09(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<< Média de n alunos. Máximo 100 alunos >>");
        System.out.print("Entre com o número de alunos:\n");
        int tamanho = sc.nextInt();
        if(tamanho > 100){
            System.out.print("Erro! O número máximo de alunos permitido é 100.\n\n");
            return -1;
        }
        int[] vet = new int[tamanho];

        float med = 0;

        for (int i = 0; i < tamanho; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            med = med + vet[i];
        }
        med = med/tamanho;

        System.out.println("Relatorio de Notas\n\n");
        for (int i = 0; i < tamanho; i++){
            System.out.printf("nota do aluno %d é: %d \n", i+1, vet[i]);
        }
        System.out.printf("média da turma é: %.1f \n",med);
        return 0;
    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[3];
        int[] vetB = new int[3];
        int[] vetC = new int[3];
        System.out.println("\n<< Subtração de vetores>>");

        for (int i = 0; i < 3; i++){
            System.out.printf("Entre com o valor %d de A:\n",i+1);
            vetA[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++){
            System.out.printf("Entre com o valor %d de B:\n",i+1);
            vetB[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++){
            vetC[i] = vetA[i] - vetB[i];
        }

        System.out.print("O vetor C, definido como C = A-B é (");
        for (int i = 0; i < 3; i++){
            if(i + 1 >= 3){
                System.out.printf("%d",vetC[i]);
            }
            else{
                System.out.printf("%d, ",vetC[i]);
            }
        }
        System.out.println(")");
    }
    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int[] vetPar = new int[5];
        int[] vetImpar = new int[5];
        System.out.println("\n\n<< Pares e Ímpares >>");

        int j = 0;
        int k = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(vet[i] % 2 == 0){
                vetPar[j++] = vet[i];
            }
            else{
                vetImpar[k++] = vet[i];
            }
        }

        System.out.print("Impares:");

        for (int i = 0; i < k; i++){
            if(i == k-1){
                System.out.printf("%d \n",vetImpar[i]);
            }
            else{
                System.out.printf("%d, ",vetImpar[i]);
            }

        }

        System.out.print("Pares:");
        for (int i = 0; i < j; i++){
            if(i == j-1){
                System.out.printf("%d\n",vetPar[i]);
            }
            else{
                System.out.printf("%d, ",vetPar[i]);
            }

        }
        System.out.printf("UTILIZADOS: PARES: %d    IMPARES: %d", j, k);

    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);
        int verde = 0, azul = 0, amarela = 0, vermelha = 0;
        int soma = 0;
        int max = 0;

        System.out.println("\n\n<< Probabilidades >>");
        System.out.println("\nDigite a quantidade de bolinhas");
        System.out.println("Verde:");
        verde = sc.nextInt();
        soma += verde;
        max = verde;

        System.out.println("Azul:");
        azul = sc.nextInt();
        soma += azul;
        if(azul > max){
            max = azul;
        }

        System.out.println("Amarela:");
        amarela = sc.nextInt();
        soma += amarela;
        if(amarela > max){
            max = amarela;
        }

        System.out.println("Vermelha:");
        vermelha = sc.nextInt();
        soma += vermelha;
        if(vermelha > max){
            max = vermelha;
        }

        System.out.println("Probabilidades");
        System.out.printf("Verde: %.1f%%",((double)verde/soma)*100);
        if(verde == max){
            System.out.println("<< Maior Probabilidade");
        }
        else{
            System.out.print("\n");
        }
        System.out.printf("Azul: %.1f%%",((double)azul/soma)*100);
        if(azul == max){
            System.out.println("<< Maior Probabilidade");
        }
        else{
            System.out.print("\n");
        }
        System.out.printf("Amarela: %.1f%%",((double)amarela/soma)*100);
        if(amarela == max){
            System.out.println("<< Maior Probabilidade");
        }
        else{
            System.out.print("\n");
        }
        System.out.printf("Vermelha: %.1f%%",((double)vermelha/soma)*100);
        if(vermelha == max){
            System.out.println(" << Maior Probabilidade");
        }
        else{
            System.out.print("\n");
        }

    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("\n<< Zerando negativos >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            int val = sc.nextInt();
            if(val > 0){
                vet[i] = val;
            }
            else{
                vet[i] = 0;
            }

        }

        System.out.print("Zerando os negativos, obtém-se: ");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static int ex14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n<< Universidade X >>");
        System.out.print("Quantos alunos serão cadastrados:\n");
        int tamanho = sc.nextInt();
        if(tamanho > 10000){
            System.out.print("Erro! O número máximo de alunos permitido é 10000.\n\n");
            return -1;
        }
        int[] vet = new int[tamanho];
        char[] vetCS = new char[tamanho];
        float[] vetCRA = new float[tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.print("Entre com o número do aluno:\n");
            vet[i] = sc.nextInt();
            System.out.printf("Entre com a classe social do aluno %d:\n", vet[i]);
            vetCS[i] = sc.next().charAt(0);
            System.out.printf("Entre com o CRA do aluno %d:\n", vet[i]);
            vetCRA[i] = sc.nextFloat();
            System.out.print("\n");
        }

        System.out.println("====Alunos Cadastros====\n");
        for (int i = 0; i < tamanho; i++){
            System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", vet[i], vetCS[i], vetCRA[i]);
        }
        return 0;
    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] dup = new int[4];
        System.out.println("\n<< Valores iguais >>");

        for (int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }
        int k = 0;
        int con = 0;
        for (int i = 0; i < 8; i++){
            for(int j = i+1; j < 8; j++){
                if(vet[i] == vet[j]){
                    if(k == 0)dup[k++] = vet[i];
                    else {
                        for (int m = 0; m < k; m++) {
                            if (vet[i] == dup[m]){
                                con = 1;
                                break;
                            }
                        }
                        if(con == 0){
                            dup[k++] = vet[i];
                        }
                        con = 0;
                    }
                }
            }
        }

        System.out.print("Valores repetidos: ");
        for (int i = 0; i < k; i++){
            if(i+1 == k){
                System.out.printf("%d ",dup[i]);
            }
            else{
                System.out.printf("%d, ",dup[i]);
            }

        }
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] dup = new int[4];
        int[] dupqtd = new int[4];
        System.out.println("\n\n<< Valores iguais >>");

        for (int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }
        int k = 0;
        int con = 0;
        for (int i = 0; i < 8; i++){
            for(int j = i+1; j < 8; j++){
                if(vet[i] == vet[j]){
                    if(k == 0) {
                        dup[k] = vet[i];
                        dupqtd[k++] = 2;
                    }
                    else {
                        for (int m = 0; m < k; m++) {
                            if (vet[i] == dup[m]){
                                con = 1;
                                dupqtd[m]++;
                                break;
                            }
                        }
                        if(con == 0){
                            dup[k] = vet[i];
                            dupqtd[k++] = 2;
                        }
                        con = 0;
                    }
                    break;
                }
            }
        }

        System.out.println("Valores repetidos: ");
        for (int i = 0; i < k; i++){
                System.out.printf("%d aparece %d vezes \n",dup[i], dupqtd[i]);
        }
    }




    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
    }


}
