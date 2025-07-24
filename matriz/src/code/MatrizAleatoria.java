package code;

import java.util.Random;

public class MatrizAleatoria {

    // atributos

    int[][] Matriz = new int[2][3];

    // objeto Random
    Random random = new Random();

    // constructor

    public MatrizAleatoria() {

        for (int i = 0; i < Matriz.length; i++) { // recorremos las filas de la matriz

            for (int j = 0; j < Matriz[i].length; j++) { // recorremos las columnas de la matriz
                Matriz[i][j] = random.nextInt(3);
            }
        }

    }

    // getters and setter

    public int[][] getMatriz() {
        return Matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.Matriz = matriz;
    }

    // metodos

    public void imprimirMatriz() {

        for (int i = 0; i < Matriz.length; i++) { // recorremos las filas de la matriz

            for (int j = 0; j < Matriz[i].length; j++) { // recorremos las columnas de la matriz

                System.out.print(Matriz[i][j] + " ");

            }

            System.out.println();
        }

    }

    public void imprimirSumaMatriz() {

        int[] sumaFila = new int[Matriz.length];
        int[] sumaColumna = new int[Matriz[0].length];
        int sumaTotal = 0;

        // bucle para sumar las filas

        for (int i = 0; i < Matriz.length; i++) { // recorremos las filas de la matriz
            sumaFila[i] = 0;
            for (int j = 0; j < Matriz[i].length; j++) { // recorremos las columnas de la matriz

                sumaFila[i] = sumaFila[i] + Matriz[i][j];

                System.out.print(Matriz[i][j] + " ");

            }

            System.out.print(sumaFila[i]);

            System.out.println();
        }

        // bucle para sumar las columnas

        for (int j = 0; j < Matriz[0].length; j++) { // recorremos las columnas

            for (int i = 0; i < Matriz.length; i++) {

                sumaColumna[j] = sumaColumna[j] + Matriz[i][j];

            }

            System.out.print(sumaColumna[j] + " ");

        }

        //sumamos todos los valores del array que contiene la suma de las filas

        for(int i = 0; i <sumaFila.length; i++){

            sumaTotal = sumaTotal+ sumaFila[i];

        }

        //sumamos todos los valores del array que contiene las sumas de las columnas

        for(int i = 0 ; i <sumaColumna.length; i++){

            sumaTotal = sumaTotal + sumaColumna[i];

        }

        //imprimimos el último valor del gráfico que representa la suma de todas las columnas y de todas las filas

        System.out.print(sumaTotal);
        

    }

}
