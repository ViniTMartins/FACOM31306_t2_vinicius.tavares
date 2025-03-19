public class Universidade {
    private String nome;
    private int diaFund, mesFund, anoFund;
    private Estudante[] estudantes = new Estudante[100];

    public Universidade(String nome, int diaFund, int mesFund, int anoFund, Estudante[] estudantes) {
        this.nome = nome;
        this.diaFund = diaFund;
        this.mesFund = mesFund;
        this.anoFund = anoFund;
        this.estudantes = estudantes;
    }

    public void TiposEstudantes() {
        int qtdGrad = 0;
        int qtdMes = 0;
        int qtdDoc = 0;
        for(Estudante estudante : estudantes) {
            if(estudante instanceof EstudanteGraduacao){
                qtdGrad++;
            }
            else if(estudante instanceof EstudanteMestrado){
                qtdMes++;
            }
            else if(estudante instanceof EstudanteDoutorado){
                qtdDoc++;
            }
        }
        System.out.println("Quantidade de estudantes de Graduação: " + qtdGrad +
                           "\nQuantidade de estudantes de Mestrado: " + qtdMes +
                           "\nQuantidade de estudantes de Doutorado: " + qtdDoc);
    }

    public void infoEstudantes(){
        for(Estudante estudante : estudantes) {
            System.out.println("Nome: " + estudante.getNome());
            if(estudante instanceof EstudanteDoutorado){
                System.out.println("Titulo tese: " + ((EstudanteDoutorado) estudante).getTituloTese() + "\nLinha de Pesquisa " + ((EstudanteDoutorado) estudante).getLinhaDePesquisa());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaFund() {
        return diaFund;
    }

    public void setDiaFund(int diaFund) {
        this.diaFund = diaFund;
    }

    public int getMesFund() {
        return mesFund;
    }

    public void setMesFund(int mesFund) {
        this.mesFund = mesFund;
    }

    public int getAnoFund() {
        return anoFund;
    }

    public void setAnoFund(int anoFund) {
        this.anoFund = anoFund;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
