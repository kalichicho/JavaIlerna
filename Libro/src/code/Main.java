package code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);



        //array para el String de libros
        int recorrido= 0;
        String[] valores = {"ISBN", "Autor", "Titulo", "año de publicación", "Editorial", "Numero de Paginas"};
        String[] datosLibro = new String[6];
        // Solicitar al usuario que ingrese los datos del libro
        
        while(recorrido <= 5){

            System.out.println("Ingrese el " + valores[recorrido] + " del libro: ");
            datosLibro[recorrido] = scanner.nextLine();
            // Aquí podrías almacenar los datos en un objeto Libro o procesarlos como necesites
            recorrido ++;
        }

        // inicializar el objeto Libro con los datos ingresados
        Libro ejemplar1 = new Libro(datosLibro[0], datosLibro[1], datosLibro[2], Integer.parseInt(datosLibro[3]), datosLibro[4], Integer.parseInt(datosLibro[5]));
        Libro ejemplar2 = new Libro("978-3-16-148410-0", "Autor Ejemplo", "Título Ejemplo", 2023, "Editorial Ejemplo", 300);

        // Mostrar los datos del libro ingresado

      

        ejemplar1.mostrarDatos();
        ejemplar2.mostrarDatos();

        //close scanner

        scanner.close();
        

    }
}
