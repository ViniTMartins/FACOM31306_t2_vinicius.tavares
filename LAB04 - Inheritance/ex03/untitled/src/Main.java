public class Main {
    public static void main(String[] args){
        CandidatoPrefeito cp = new CandidatoPrefeito("FRANCISCO SALES DE OLIVEIRA", 29, 1, 1967, 'M', 1130000.00, true, 10, "José Caires", 11);
        CandidatoVereador cv = new CandidatoVereador("FRANCE MARIA NASCIMENTO MARTINS", 24, 5, 1967, 'F', 600000.00, false, 11, "Centro", 111);
        System.out.println(cp);
        System.out.println(cv);
    }
}
