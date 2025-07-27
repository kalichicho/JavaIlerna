package code;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Instanciamos el objeto lista de la clase LinkedList
        LinkedList<Character> lista = new LinkedList<>();

        // añadimos los caracteres solicitados
        lista.add('c');
        lista.add('d');
        lista.add('f');

        // imprimimos la lista
        System.out.print(lista + " ");
        System.out.println();

        // añadimos los caracteres solicitados al principio de la lista
        lista.addFirst('b');
        lista.addFirst('a');

        // imprimimos la lista
        System.out.print(lista + " ");
        System.out.println();

        // añadimos los caracteres solicitados al final de la liosta
        lista.addLast('g');
        System.out.print(lista + " ");
        System.out.println();

        // Bucle para recorrer el ArrayLinked e insertar la letra entre la d y la f

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) == 'f') {

                lista.add(i, 'e');
                break;

            }

        }

        // imprimimos la lista
        System.out.print(lista + " ");
        System.out.println();

        // eliminamos el caracter de la posición indice 2

        lista.remove(2);

        // imprimimos la lista
        System.out.print(lista + " ");
        System.out.println();

    }
}
