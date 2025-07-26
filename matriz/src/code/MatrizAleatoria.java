package code;

import java.util.Random;

public class MatrizAleatoria {

    // atributos

    int[][] matriz = new int[2][3];

    // objeto Random
    Random random = new Random();

    // constructor

    public MatrizAleatoria() {

        for (int i = 0; i < matriz.length; i++) { // recorremos las filas de la matriz

            for (int j = 0; j < matriz[i].length; j++) { // recorremos las columnas de la matriz
                matriz[i][j] = random.nextInt(3);
            }
        }

    }

    // getters and setter

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    // metodos

    public void imprimirMatriz() {

        for (int i = 0; i < matriz.length; i++) { // recorremos las filas de la matriz

            for (int j = 0; j < matriz[i].length; j++) { // recorremos las columnas de la matriz

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();
        }

    }

    // metodo para imprimir la matriz más la suma de sus valores
    public void imprimirSumaMatriz() {

        int[] sumaFila = new int[matriz.length];
        int[] sumaColumna = new int[matriz[0].length];
        int sumaTotal = 0;

        // bucle para sumar las filas

        for (int i = 0; i < matriz.length; i++) { // recorremos las filas de la matriz
            sumaFila[i] = 0;
            for (int j = 0; j < matriz[i].length; j++) { // recorremos las columnas de la matriz

                sumaFila[i] = sumaFila[i] + matriz[i][j];

                System.out.print(matriz[i][j] + " ");

            }

            System.out.print("|" + Colores.VERDE + sumaFila[i] + Colores.RESET);

            System.out.println();
        }

        // bucle para sumar las columnas

        for (int j = 0; j < matriz[0].length; j++) { // recorremos las columnas

            for (int i = 0; i < matriz.length; i++) {

                sumaColumna[j] = sumaColumna[j] + matriz[i][j];

            }

            System.out.print(sumaColumna[j] + " ");

        }

        // sumamos todos los valores del array que contiene la suma de las filas

        for (int i = 0; i < sumaFila.length; i++) {

            sumaTotal = sumaTotal + sumaFila[i];

        }

        // imprimimos el último valor del gráfico que representa la suma de todas las
        // columnas y de todas las filas

       

        System.out.print("|" + Colores.ROJO + sumaTotal + Colores.RESET);
        System.out.println();

    }

}
