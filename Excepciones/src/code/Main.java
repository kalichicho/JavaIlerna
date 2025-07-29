package code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // instanciamos el objeto de Scanner

        Scanner sc = new Scanner(System.in);

        // delcaramos un array de 5 posiciones y una var int
        int[] ints = new int[5];
        int i = 0;

        // Bucle que se ejecutara sí o sí al menos 1 vez. SOlicitando datos por teclado

        do {
            System.out.println("Introduce otro número. Para salir -1");
            i = sc.nextInt();
            

            try {
                if (i > 5) {

                    throw new IllegalArgumentException("Número demasiado grande, máximo permitido 4");

                }

                if (i != -1) {
                    ints[i] = i;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error aritmetico");
                System.out.println(ex.getMessage() );
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Exepcion fuera de indice");
                System.out.println(ex.getMessage());

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            } finally{
                System.out.println("Numero introducido es " + i);
            }

        } while (i != -1);

        sc.close();

    }

}
