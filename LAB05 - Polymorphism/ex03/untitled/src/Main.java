public class Main {

    public static void main(String[] args) {

        Estudante[] estudantes = new Estudante[10];


        estudantes[0] = new Estudante("Carlos","Rua 1o de Abril");
        estudantes[1] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        estudantes[2] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",  "Banco de Dados");
        estudantes[3]  = new EstudanteMestrado("Carla","Rua Primavera","Medicina", "Vacinas de RNA", "academico","Anticorpos");
        estudantes[4] = new EstudanteDoutorado("Bruno","Rua Inverno", "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        estudantes[5] = new Estudante("Carlos","Rua 1o de Abril");
        estudantes[6] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        estudantes[7] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia", "Banco de Dados");
        estudantes[8]= new EstudanteMestrado("Carla","Rua Primavera","Medicina",  "Vacinas de RNA", "Anticorpos","academico");
        estudantes[9] = new EstudanteDoutorado("Bruno","Rua Inverno", "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        Universidade Uni = new Universidade("Uni", 10, 11, 1702, estudantes);

        int size = 0;
        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i] instanceof EstudantePosGrad){
                size++;
            }
        }

        Estudante[] estudantesPos = new Estudante[size];

        for(int i = 0, j = 0; i < estudantes.length; i++){
            if(estudantes[i] instanceof EstudantePosGrad){
                estudantesPos[j++] = estudantes[i];
            }
        }

        Uni.infoEstudantes();

        System.out.println("-------------------");

       for(Estudante estudante : estudantesPos){
           estudante.print();
       }

    }
}
