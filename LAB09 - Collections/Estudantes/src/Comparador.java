import java.util.Comparator;

public class Comparador implements Comparator<Estudante>{


    public int compare(Estudante e1, Estudante e2){
        return e1.getNome().compareTo(e2.getNome());
    }
}
