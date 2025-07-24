package code;

import java.util.Scanner;

import code.Tarea.EstadoTarea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        //Creamos una tarea
        ArrayList<Tarea> Tarea1 = new ArrayList<>();
        //instanciamos el scanner
        Scanner sc = new Scanner(System.in);

        boolean exit = true;

        try{

            while (exit) {
                System.out.println("Bienvenido al gestor de tareas");
                System.out.println("Elige una de las siguientes opciones:");
                System.out.println("1. Crear una nueva tarea");
                System.out.println("2. Cambiar el estado de una tarea");
                System.out.println("3. Mostrar todas las tareas agrupadas por su estado actual");
                System.out.println("4. Salir");
                int opcion = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el título de la tarea:");
                        String titulo = sc.nextLine();
                        System.out.println("Introduce la descripción de la tarea:");
                        String descripcion = sc.nextLine();
                        System.out.println("Introduce el estado de la tarea (PENDIENTE, EN_PROCESO, COMPLETADA):");
                        String estadoInput = sc.nextLine().toUpperCase();

                       for (String raw : estadoInput.split(estadoInput)) {
                        String s = raw.trim().toUpperCase();
                        try {
                             EstadoTarea estado = EstadoTarea.valueOf(s);
                             System.out.println(s + " es un estado válido.");

        
                             } catch (IllegalArgumentException ex) {
                                  System.out.println(s + " NO es un estado válido.");
                          continue;}
                        }

                        



                        break;
                
                    default:
                        break;
                }
            


        

    

