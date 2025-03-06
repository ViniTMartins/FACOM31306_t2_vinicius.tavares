public class CandidatoVereador extends Candidato{
    private String bairro;
    private int numero;


    public CandidatoVereador(String nome, int dia, int mes, int ano, char genero, double totalBens, boolean reelei, int npartido, String bairro, int numero){
        super(nome, dia, mes, ano, genero, totalBens, reelei, npartido);
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Candidato a vereador:" +
                " nome: " + nome + '\n' +
                " Data de Nascimento: " + dia + '/'+ mes + '/' + ano +'\n' +
                " genero: " + genero + '\n' +
                " total de bens: " + totalBens + '\n' +
                " candidato a reeleição: " + (reelei ?  "Sim" : "Nao") + '\n' +
                " numero do partido: " + npartido + '\n' +
                " bairro: " + bairro + '\n' +
                " numero do candidato: " + numero + '\n';
    }
}
