public class Main {

     public static void main (String[] args){
         Funcionario f = new Funcionario("102.232.344-11", "nome", 10000);
         try{
             f.Aumento(500);
         }catch(IllegalRaiseException e){
             System.out.println(e);
         }
         try{
             f.Aumento(-101);
         }catch(IllegalRaiseException e){
             System.out.println(e);
         }
         try{
             f.Aumento(-10);
         }catch(IllegalRaiseException e){
             System.out.println(e);
         }
         System.out.println(f.getSalario());
     }
}
