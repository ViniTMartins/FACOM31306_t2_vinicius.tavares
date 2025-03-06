public class CandidatoPrefeito extends Candidato{
    private String nomeVice;
    private int npartidoVice;


    public CandidatoPrefeito(String nome, int dia, int mes, int ano, char genero, double totalBens, boolean reelei, int npartido, String nomeVice, int npartidoVice){
        super(nome, dia, mes, ano, genero, totalBens, reelei, npartido);
        this.nomeVice = nomeVice;
        this.npartidoVice = npartidoVice;
    }

    public String getNomeVice() {
        return nomeVice;
    }

    public void setNomeVice(String nomeVice) {
        this.nomeVice = nomeVice;
    }

    public int getNpartidoVice() {
        return npartidoVice;
    }

    public void setNpartidoVice(int numero) {
        this.npartidoVice = npartidoVice;
    }

    @Override
    public String toString() {
        return "Candidato a prefeito:" +
                super.toString() +
                " Vice-Prefeito: " + nomeVice + '\n' +
                " numero do partido do Vice-Prefeito: " + npartidoVice + '\n';
    }
}
