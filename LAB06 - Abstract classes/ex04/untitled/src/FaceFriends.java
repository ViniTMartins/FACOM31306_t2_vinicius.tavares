import java.util.Scanner;

public class FaceFriends {
    int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        String tipo;
        int n;
        String apelido;
        String nome;
        String email;
        int diaAniversario ;
        int mesAniversario ;
        System.out.println("Digite o numero de contatos:");
        n = sc.nextInt();
        Contato contatos[] = new Contato[n];
        int qtdContatos = 0;
        while(true){
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Imprimir contatos");
            System.out.println("3 - Imprimir familiares");
            System.out.println("4 - Imprimir amigos");
            System.out.println("5 - Imprimir colegas de trabalho");
            System.out.println("6 - Imprimir melhores amigos, irmaos, e colegas");
            System.out.println("7 - Imprimir contato especfico");
            System.out.println("8 - Adicionar n contatos");
            System.out.println("0 - Sair");
            escolha = sc.nextInt();
            if(escolha == 1){
                System.out.println("Qual o tipo de contato? (familiar, amigo, trabalho)");
                tipo = sc.next();
                System.out.println("Digite o apelido do contato:");
                apelido = sc.next();
                System.out.println("Digite o nome do contato:");
                nome = sc.next();
                System.out.println("Digite o email do contato:");
                email = sc.next();
                System.out.println("Digite o aniversario do contato:");
                diaAniversario = sc.nextInt();
                mesAniversario = sc.nextInt();
                if(tipo.equals("familiar")){
                    System.out.println("Digite o parentesco do contato:");
                    contatos[qtdContatos] = new Familia(apelido, nome, email, diaAniversario, mesAniversario, sc.next());
                    qtdContatos++;
                }
                else if(tipo.equals("amigo")){
                    System.out.println("Digite o grau do contato:");
                    contatos[qtdContatos] = new Amigos(apelido, nome, email, diaAniversario, mesAniversario, sc.nextInt());
                    qtdContatos++;
                }
                else if(tipo.equals("trabalho")){
                    System.out.println("Digite o tipo do contato:");
                    contatos[qtdContatos] = new Trabalho(apelido, nome, email, diaAniversario, mesAniversario, sc.next());
                    qtdContatos++;
                }
                else{
                    System.out.println("Nao existe esse tipo");
                }
            }
            if(escolha == 2){
                for(int i = 0; i<qtdContatos; i++){
                    if(contatos[i] instanceof Familia){
                        System.out.println(((Familia) contatos[i]).imprimirContato());
                    }
                    if(contatos[i] instanceof Amigos){
                        System.out.println(((Amigos) contatos[i]).imprimirContato());
                    }
                    if(contatos[i] instanceof Trabalho){
                        System.out.println(((Trabalho) contatos[i]).imprimirContato());
                    }
                }
            }
            if(escolha == 3){
                for(int i = 0; i<qtdContatos; i++){
                    if(contatos[i] instanceof Familia){
                        System.out.println(((Familia) contatos[i]).imprimirContato());
                    }
                }
            }
            if(escolha == 4){
                for(int i = 0; i<qtdContatos; i++){
                    if(contatos[i] instanceof Amigos){
                        System.out.println(((Amigos) contatos[i]).imprimirContato());
                    }
                }
            }
            if(escolha == 5){
                for(int i = 0; i<qtdContatos; i++){
                    if(contatos[i] instanceof Trabalho){
                        System.out.println(((Trabalho) contatos[i]).imprimirContato());
                    }
                }
            }
            if(escolha == 6){
                for(int i = 0; i<qtdContatos; i++){
                    if(contatos[i] instanceof Familia && (((Familia) contatos[i]).getParentesco()).equals("irmao")){
                        System.out.println(((Familia) contatos[i]).imprimirContato());
                    }
                    if(contatos[i] instanceof Amigos && (((Amigos) contatos[i]).getGrau()) == 1){
                        System.out.println(((Amigos) contatos[i]).imprimirContato());
                    }
                    if(contatos[i] instanceof Trabalho && (((Trabalho) contatos[i]).getTipo()).equals("colega")){
                        System.out.println(((Trabalho) contatos[i]).imprimirContato());
                    }
                }
            }
            if(escolha == 7){
                int id;
                System.out.println("Digite o id do contato:");
                id = sc.nextInt();
                if(contatos[id] instanceof Familia){
                    System.out.println("Familia");
                    System.out.println(((Familia) contatos[id]).imprimirContato());
                }
                else if(contatos[id] instanceof Amigos){
                    System.out.println("Amigo");
                    System.out.println(((Amigos) contatos[id]).imprimirContato());
                }
                else if(contatos[id] instanceof Trabalho){
                    System.out.println("Trabalho");
                    System.out.println(((Trabalho) contatos[id]).imprimirContato());
                }

            }
            if(escolha == 8){
                for(int i = 0; i<n; i++){
                    System.out.println("Qual o tipo de contato? (familiar, amigo, trabalho)");
                    tipo = sc.next();
                    System.out.println("Digite o apelido do contato:");
                    apelido = sc.next();
                    System.out.println("Digite o nome do contato:");
                    nome = sc.next();
                    System.out.println("Digite o email do contato:");
                    email = sc.next();
                    System.out.println("Digite o aniversario do contato:");
                    diaAniversario = sc.nextInt();
                    mesAniversario = sc.nextInt();
                    if(tipo.equals("familiar")){
                        System.out.println("Digite o parentesco do contato:");
                        contatos[qtdContatos] = new Familia(apelido, nome, email, diaAniversario, mesAniversario, sc.next());
                        qtdContatos++;
                    }
                    else if(tipo.equals("amigo")){
                        System.out.println("Digite o grau do contato:");
                        contatos[qtdContatos] = new Amigos(apelido, nome, email, diaAniversario, mesAniversario, sc.nextInt());
                        qtdContatos++;
                    }
                    else if(tipo.equals("trabalho")){
                        System.out.println("Digite o tipo do contato:");
                        contatos[qtdContatos] = new Familia(apelido, nome, email, diaAniversario, mesAniversario, sc.next());
                        qtdContatos++;
                    }
                    else{
                        System.out.println("Nao existe esse tipo");
                    }
                }
            }
            if(escolha == 0){
                break;
            }

        }

    }

}