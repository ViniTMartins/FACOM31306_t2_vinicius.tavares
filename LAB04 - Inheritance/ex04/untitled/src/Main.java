public class Main {

  public static void main(String[] args) {
    C3 c3 = new C3(1,2,3,4,5,6,7,8,9);
    C3 np = new C3();
    c3.mostrar_atributos();
    System.out.println("----------------");
    c3.mostrar_atributos_super();
    System.out.println("----------------");
    np.mostrar_atributos();
    System.out.println("----------------");
    np.mostrar_atributos_super();
  }
}
