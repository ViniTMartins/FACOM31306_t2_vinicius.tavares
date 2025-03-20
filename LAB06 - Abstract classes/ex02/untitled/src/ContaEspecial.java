public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float val , int num , int pwd, float limite){
        super(val, num, pwd);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean debitaValor ( float val , int pwd ) {
        if ( pwd != senha )
            return ( false ); // senha deve ser vá lida
        if ( estado != 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > saldo )
            return ( false );
        saldo -= val ;
        return ( true ) ;
    }

    @Override
    public String toString() {

        return super.toString() +  " limite: " + limite + ")";
    }
}
