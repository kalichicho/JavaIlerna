package code;
import java.util.Iterator;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Character> lista = new ArrayList<>();
        


        lista.add('c');
        lista.add('d');
        lista.add('f');


        Iterator<Character> iterador = lista.iterator();

        while(iterador.hasNext()){

            System.out.println(iterador.next());
        }
        
    }

}
