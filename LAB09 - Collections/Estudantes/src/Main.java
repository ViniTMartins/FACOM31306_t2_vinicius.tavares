import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        LinkedList<Estudante> lista = new LinkedList<Estudante>();
        Stack<Estudante> pilha = new Stack<Estudante>();
        ArrayDeque<Estudante> fila = new ArrayDeque<Estudante>();
        Random r = new Random();

        String[] nomes = {"Davi", "Bruno", "Isabelly", "Vinicius", "Tiago", "Gustavo", "Joao",
                "Maria", "Miguel", "Cleber", "Catiana", "Walter", "Rafael", "Pedro", "Marcio",
                "Claudeney", "Murilo", "Leandro", "Anderson", "Arthur"};

        String[] ruas = {"Madureira", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Setembro", "Outubro", "Novembro", "Dezembro", "1", "2", "3", "4", "5",
                "6", "Joao", "Maria"};

        String[] areas = {"Ciencia de dados", "Websegurança", "IA", "computacao bioinspirada",
                "Analise de Dados", "Teoria da computacao", "computacao ubiqua", "Sistemas de redes",
                "Redes neurais", "Estatistica"};

        String[] palavrasChave = {"Estudos", "Analises", "Experimentos", "Testes", "Criações"};

        String[] formacoes = {"Engenharia Eletrica", "Engenharia de Software",
                "Ciencia da computacao", "Sistemas da informacao", "Fisica", "Estatistica"};

        String[] tipoMestrado = {"Academico", "Profissional"};
        Estudante e;
        int opcao;
        for(int i = 0; i < 10; i++){

            opcao = r.nextInt(1,4);
            e = switch (opcao) {
                case 1 -> new EstudanteGraduacao(nomes[r.nextInt(0, nomes.length)],
                        "Rua " + ruas[r.nextInt(0, ruas.length)],
                        palavrasChave[r.nextInt(0, palavrasChave.length)] + " na área de " + areas[r.nextInt(0, areas.length)]);
                case 2 -> new EstudanteMestrado(nomes[r.nextInt(0, nomes.length)],
                        "Rua " + ruas[r.nextInt(0, ruas.length)],
                        formacoes[r.nextInt(0, formacoes.length)],
                        areas[r.nextInt(0, areas.length)],
                        tipoMestrado[r.nextInt(0, 2)],
                        palavrasChave[r.nextInt(0, palavrasChave.length)] + " na área de " + areas[r.nextInt(0, areas.length)]);
                case 3 -> new EstudanteDoutorado(nomes[r.nextInt(0, nomes.length)],
                        "Rua " + ruas[r.nextInt(0, ruas.length)],
                        formacoes[r.nextInt(0, formacoes.length)],
                        areas[r.nextInt(0, areas.length)],
                        palavrasChave[r.nextInt(0, palavrasChave.length)] + " na área de " + areas[r.nextInt(0, areas.length)]);
                default -> new EstudanteGraduacao("", "", "");
            };
            pilha.push(e);
            lista.add(e);
        }
        Comparador c = new Comparador();
        lista.sort(c);

        System.out.println("Lista: ");

        for(Estudante es : lista){
            es.print();
        }


        int aux = lista.size() - 1;
        for(int i = 0; i < aux; i++){
            System.out.println("Elemento sendo removido: " + lista.remove().getNome() );
        }

        System.out.println(" \n\n\n --------------------------------------- \n\n\n");

        System.out.println("Apenas o ultimo estudante nao removido:");

        for(Estudante es : lista){
            es.print();
        }

        System.out.println(" \n\n\n --------------------------------------- \n\n\n");

        System.out.println("Pilha: ");

        for(Estudante es : pilha){
            es.print();
        }


        int temp = pilha.size() - 1;
        for(int i = 0; i < temp; i++){
            pilha.pop();
        }

        System.out.println(" \n\n\n --------------------------------------- \n\n\n");

        System.out.println("Apenas o primeiro estudante nao removido:");

        for(Estudante es : pilha){
            es.print();
        }

        System.out.println(" \n\n\n --------------------------------------- \n\n\n");
        System.out.println("Insercoes e remoções usando Deque:");

        if(fila.offerLast(new EstudanteGraduacao("A","",""))){
            System.out.println("Estudante Adicionado");
        }
        if(fila.offerLast(new EstudanteGraduacao("B","",""))){
            System.out.println("Estudante Adicionado");
        }
        for(int i = 0; i < 10; i++){
            try{
                e = fila.removeFirst();
            }catch (Exception ex){
                System.out.println("Fila Vazia");
                continue;
            }
            System.out.print("\n\nElemento removido: " );
            e.print();
        }

        System.out.println(" \n\n\n --------------------------------------- \n\n\n");
        System.out.println("Insercoes e remoções usando Deque:");


        try{
            fila.addLast(new EstudanteGraduacao("A","",""));
        }catch (Exception ex){
            System.out.println("Estudante nao pode ser adicionado");
        }

        try{
           fila.addLast(new EstudanteGraduacao("B","",""));
        }catch (Exception ex){
            System.out.println("Estudante nao pode ser adicionado");
        }
        for(int i = 0; i < 10; i++){
            e = fila.pollFirst();
            if(e == null){
                System.out.println("Fila Vazia");
                continue;
            }
            System.out.print("\n\nElemento removido: " );
            e.print();
        }






    }
}
