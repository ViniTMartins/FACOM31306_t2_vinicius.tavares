public class Produto implements Classificavel {
    private int codigo ;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int Compare (Classificavel o) {
            Produto compara = (Produto) o;
            return (this.codigo == compara.codigo)? 0 :(this.codigo < compara.codigo)? (-1) : 1;
        }
}
