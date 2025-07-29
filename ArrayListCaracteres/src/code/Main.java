package code;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> lista = new ArrayList<>();

        lista.add('c');
        lista.add('d');
        lista.add('f');

        // Bucle para mostrar datos
        for (int i = 0; i < lista.size(); i++) {

            System.out.print(lista.get(i));
        }
        System.out.println();

        // añadimos datos
        lista.add(0, 'b');
        lista.add(0, 'a');
        

        // Bucle para mostrar datos
        for (int i = 0; i < lista.size(); i++) {

            System.out.print(lista.get(i));
        }

        System.out.println();
        // añadimos datos
        lista.add('g');

        // Bucle para mostrar datos
        for (int i = 0; i < lista.size(); i++) {

            System.out.print(lista.get(i));
        }

        System.out.println();
        // bucle para agregar un caracter entre 2
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) == 'f') {

                lista.add(i, 'e'); // añadimos datos
                break;

            }

        }

        // Bucle para mostrar datos
        for (int i = 0; i < lista.size(); i++) {

            System.out.print(lista.get(i));
        }

        System.out.println();
        // eliminamos un caracter por indice
        lista.remove(2);

        // Bucle para mostrar datos
        for (int i = 0; i < lista.size(); i++) {

            System.out.print(lista.get(i));
        }
        System.out.println();
    }

} 