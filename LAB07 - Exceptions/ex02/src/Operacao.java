public class Operacao {
    public void iniciarOperacao(int numerador, int denominador){
        try{
            calcular(numerador, denominador);
        }catch(DivisaoPorZeroException e){
            System.out.println(e);
        }
    }
    public void calcular(int numerador, int denominador) throws DivisaoPorZeroException{
        dividir(numerador, denominador);
    }
    public void dividir(int numerador, int denominador) throws DivisaoPorZeroException{
        if(denominador == 0){
            throw new DivisaoPorZeroException("tentativa de divisao por 0");
        }
        else{
            System.out.println((double)(numerador/denominador));
        }
    }
}
