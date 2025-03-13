//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Empresa {
    public static void main(String[] args) {
        Funcionarios[] funcionarios = new Funcionarios[8];

        funcionarios[0] = new Chefes("Isabelly de Jesus Oliveira", 7, 5, 2006, 20000);
        funcionarios[1] = new Chefes("Pedro do Santos Martins", 3, 2, 2000, 30000);

        funcionarios[2] = new Vendedores("Carlos Souza",10 ,3, 2005, 2000, 100, 200);
        funcionarios[3] = new Vendedores("Ana Costa",10 ,11, 1996, 2500, 60, 150);

        funcionarios[4] = new Operarios("Amilly Desjam", 11, 1, 1999, 200, 50);
        funcionarios[5] = new Operarios("Emisma Fectos", 1, 2, 1970, 500, 200);

        funcionarios[6] = new Horistas("Sebastian Shaw", 12, 9, 1995, 20, 400);
        funcionarios[7] = new Horistas("Mobius Thander", 5, 12, 1998, 30, 200);

        for (Funcionarios f: funcionarios){
            f.print();
            System.out.print("\n\n------------\n\n");
        }
    }
}