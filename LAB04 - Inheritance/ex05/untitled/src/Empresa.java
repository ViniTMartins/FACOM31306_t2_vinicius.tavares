//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Empresa {
    public static void main(String[] args) {
        Chefes[] chefes = new Chefes[2];
        Vendedores[] vendedores = new Vendedores[2];
        Operarios[] operarios = new Operarios[2];
        Horistas[] horistas = new Horistas[2];

        chefes[0] = new Chefes("Isabelly de Jesus Oliveira", 7, 5, 2006, 20000);
        chefes[1] = new Chefes("Pedro do Santos Martins", 3, 2, 2000, 30000);

        vendedores[0] = new Vendedores("Carlos Souza",10 ,3, 2005, 2000, 100, 200);
        vendedores[1] = new Vendedores("Ana Costa",10 ,11, 1996, 2500, 60, 150);

        operarios[0] = new Operarios("Amilly Desjam", 11, 1, 1999, 200, 50);
        operarios[1] = new Operarios("Emisma Fectos", 1, 2, 1970, 500, 200);

        horistas[0] = new Horistas("Sebastian Shaw", 12, 9, 1995, 20, 400);
        horistas[1] = new Horistas("Mobius Thander", 5, 12, 1998, 30, 200);

        chefes[0].setSalario(21000);
        vendedores[0].Salario(3000, 200, 100);
        operarios[0].Salario(200, 500);
        horistas[0].Salario(150, 300);

        for (Chefes chefe : chefes) {
            System.out.println("Chefe: " + chefe.getNome() + "    Salário: " + chefe.getSalario());
        }

        for (Vendedores vendedor : vendedores) {
            System.out.println("Vendedor: " + vendedor.getNome() + "    Salário: " + vendedor.getSalario());
        }

        for (Operarios operario : operarios) {
            System.out.println("Operário: " + operario.getNome() + "    Salário: " + operario.getSalario());
        }

        for (Horistas horista : horistas) {
            System.out.println("Horista: " + horista.getNome() + "    Salário: " + horista.getSalario());
        }
    }
}