public class Dueto {
    // definições
    private String nomeDueto;
    private Musico musico1, musico2, sub;


    // construtor 1
    public Dueto(String nomeDueto, Musico musico1, Musico musico2, Musico sub) {
        this.nomeDueto = nomeDueto;
        this.musico1 = musico1;
        this.musico2 = musico2;
        this.sub = sub;
    }

    // construtor 2
    public Dueto(String nomeDueto, Musico musico1, Musico musico2) {
        this.nomeDueto = nomeDueto;
        this.musico1 = musico1;
        this.musico2 = musico2;
        sub = null;
    }

    // Métodos Get/Set e CalcRemunMedia()
    public String getNomeDueto() {
        return nomeDueto;
    }

    public void setNomeDueto(String nomeDueto) {
        this.nomeDueto = nomeDueto;
    }

    public Musico getMusico1() {
        return musico1;
    }

    public void setMusico1(Musico musico1) {
        this.musico1 = musico1;
    }

    public Musico getMusico2() {
        return musico2;
    }

    public void setMusico2(Musico musico2) {
        this.musico2 = musico2;
    }

    public Musico getSub() {
        return sub;
    }

    public void setSub(Musico sub) {
        this.sub = sub;
    }

    public float CalcRemunMedia() {
        if (sub != null) {
            return ((musico1.getRemuneracao() + musico2.getRemuneracao() + sub.getRemuneracao()) / 3);
        } else {
            return ((musico1.getRemuneracao() + musico2.getRemuneracao()) / 2);
        }
    }

    public String toString() {
        if(sub != null) {
            return nomeDueto + ": \n" + "musico 1: \n" + musico1.toString() +  "musico 2: \n" + musico2.toString() +  "Substituto: \n" + sub.toString();
        }
        else {
           return nomeDueto + ": \n" + "musico 1: \n" + musico1.toString() +  "musico 2: \n" + musico2.toString();
        }
    }

}
