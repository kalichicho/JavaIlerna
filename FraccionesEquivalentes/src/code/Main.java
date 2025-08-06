package code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables de clase Main

        int[] numFracciones = new int[4];
        boolean valores = true;
        int valor1;
        int valor;

        // Instanciamos el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // bucle para rellenar el array con lo números

        for (int i = 0; i < numFracciones.length; i++) {

            switch (i) {
                case 0:
                    System.out.println("Introduce el numerador para la primera fracción");

                    while (valores) {
                        if (sc.hasNextInt()) {
                            numFracciones[i] = sc.nextInt();
                            valores = false;
                        } else {
                            System.out.println("el valor introducido no es un entero.");
                            System.out.println("Introduce el numerador para la primera fracción");
                            sc.next(); // limpiamos el buffer
                        }
                    }
                    valores = true;
                    break;
                case 1:
                    System.out.println(
                            "Introduce el denominador para la primera fracción. No se adminte el número 0(cero)");
                    while (valores) {

                        if (sc.hasNextInt()) {
                            valor1 = sc.nextInt();
                            if (valor1 != 0) {
                                numFracciones[i] = valor1;
                                valores = false;
                            } else{
                                System.out.println("El número introducido no puede ser 0");
                            }
                        } else {
                            System.out.println("el valor introducido no es un entero.");
                            System.out.println("Introduce el denominador para la primera fracción");
                            sc.next(); // limpiamos el buffer
                        }

                    }
                    
                    valores = true;
                    break;
                case 2:
                    System.out.println("Introduce el numerador para la segunda fracción");
                    while (valores) {
                        if (sc.hasNextInt()) {
                            numFracciones[i] = sc.nextInt();
                            valores = false;
                        } else {
                            System.out.println("el valor introducido no es un entero.");
                            System.out.println("Introduce el numerador para la segundafracción");
                            sc.next(); // limpiamos el buffer
                        }
                    }
                    valores = true;
                    break;
                case 3:
                    System.out.println("Introduce el denominaodr para la segunda fracción");
                      while (valores) {

                        if (sc.hasNextInt()) {
                            valor = sc.nextInt();
                            if (valor != 0) {
                                numFracciones[i] = valor;
                                valores = false;
                            } else{
                                System.out.println("El número introducido no puede ser 0");
                            }
                        } else {
                            System.out.println("el valor introducido no es un entero.");
                            System.out.println("Introduce el denominador para la segunda fracción");
                            sc.next(); // limpiamos el buffer
                        }

                    }
                    valores = true;
                    break;
                default:
                    System.out.println("Caso no encontrado");
                    break;
            }
        }

        sc.close(); // cerramos el objeto

        // Instanciamos un objeto de la clase Comparador

        Comparador fraccion1 = new Comparador(numFracciones[0], numFracciones[1], numFracciones[2], numFracciones[3]);

        // llamamos al metodo con el objeto

        fraccion1.comprobador(fraccion1.getNumerador1(), fraccion1.getDenominador1(), fraccion1.getNumerador2(),
                fraccion1.getDenominador2());
    }
}
