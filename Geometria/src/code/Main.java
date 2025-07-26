package code;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // inicializamos el objeto de scanner
        Scanner sc = new Scanner(System.in);

        // declaramos un array para almadenar los datos de las figuras geometricas
        int[] ladoCuadrado = new int[10];
        int[] radioCirculo = new int[10];
        int[][] baseAlturaTriangulo = new int[2][10];
        String figura = "cuadrado";

        // pedimos al usuario que ingrese los datos de las figuras geometricas
        for (int i = 0; i < ladoCuadrado.length; i++) {

            if ("CUADRADO".equals(figura.toUpperCase())) {

                for (int j = 0; j < ladoCuadrado.length; j++) {

                    System.out.println("ingrese el lado  del cuadrado nº" + (j + 1) + ": ");
                    ladoCuadrado[j] = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer del scanner

                    if (j == (ladoCuadrado.length - 1)) {

                        figura = "circulo";

                    }
                }

            }

            if ("CIRCULO".equals(figura.toUpperCase())) {

                System.out.println("ingrese el radio  del circulo nº" + (i + 1) + ": ");
                radioCirculo[i] = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer del scanner

            }

        }

        // bucle para instanciar el objeto

        // CUADRADOS

        Geometria cuadrado1 = new Geometria(ladoCuadrado[0]);
        Geometria cuadrado2 = new Geometria(ladoCuadrado[1]);
        Geometria cuadrado3 = new Geometria(ladoCuadrado[2]);
        Geometria cuadrado4 = new Geometria(ladoCuadrado[3]);
        Geometria cuadrado5 = new Geometria(ladoCuadrado[4]);
        Geometria cuadrado6 = new Geometria(ladoCuadrado[5]);
        Geometria cuadrado7 = new Geometria(ladoCuadrado[6]);
        Geometria cuadrado8 = new Geometria(ladoCuadrado[7]);
        Geometria cuadrado9 = new Geometria(ladoCuadrado[8]);
        Geometria cuadrado10 = new Geometria(ladoCuadrado[9]);

        // CIRCULOS

        Geometria circulo1 = new Geometria(radioCirculo[0]);
        Geometria circulo2 = new Geometria(radioCirculo[1]);
        Geometria circulo3 = new Geometria(radioCirculo[2]);
        Geometria circulo4 = new Geometria(radioCirculo[3]);
        Geometria circulo5 = new Geometria(radioCirculo[4]);
        Geometria circulo6 = new Geometria(radioCirculo[5]);
        Geometria circulo7 = new Geometria(radioCirculo[6]);
        Geometria circulo8 = new Geometria(radioCirculo[7]);
        Geometria circulo9 = new Geometria(radioCirculo[8]);
        Geometria circulo10 = new Geometria(radioCirculo[9]);

        // llamamos a los metodos del objeto

        // CUADRADOS
        System.out.println(cuadrado1.areaCuadrado(cuadrado1.getLado()));
        System.out.println(cuadrado2.areaCuadrado(cuadrado2.getLado()));
        System.out.println(cuadrado3.areaCuadrado(cuadrado3.getLado()));
        System.out.println(cuadrado4.areaCuadrado(cuadrado4.getLado()));
        System.out.println(cuadrado5.areaCuadrado(cuadrado5.getLado()));
        System.out.println(cuadrado6.areaCuadrado(cuadrado6.getLado()));
        System.out.println(cuadrado7.areaCuadrado(cuadrado7.getLado()));
        System.out.println(cuadrado8.areaCuadrado(cuadrado8.getLado()));
        System.out.println(cuadrado9.areaCuadrado(cuadrado9.getLado()));
        System.out.println(cuadrado10.areaCuadrado(cuadrado10.getLado()));

        // CIRCULOS

        System.out.println(circulo1.areaCirculo(circulo1.getRadio()));
        System.out.println(circulo2.areaCirculo(circulo2.getRadio()));
        System.out.println(circulo3.areaCirculo(circulo3.getRadio()));
        System.out.println(circulo4.areaCirculo(circulo4.getRadio()));
        System.out.println(circulo5.areaCirculo(circulo5.getRadio()));
        System.out.println(circulo6.areaCirculo(circulo6.getRadio()));
        System.out.println(circulo7.areaCirculo(circulo7.getRadio()));
        System.out.println(circulo8.areaCirculo(circulo8.getRadio()));
        System.out.println(circulo9.areaCirculo(circulo9.getRadio()));
        System.out.println(circulo10.areaCirculo(circulo10.getRadio()));
    }
}
