

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to hold Contacto objects
        ArrayList<Contacto> contactosAgenda = new ArrayList<>();
        // Variable to control the exit of the loop
        // This will allow the user to exit the program gracefully
        boolean exit = false;
        do {
            // Solicitar al usuario que ingrese el número de contactos
            System.out.println("Welcome to the contact management system from Umbrella Academy");
            System.out.println("Select an option:");
            System.out.println("1. Add a contact");
            System.out.println("2. List contacts");
            System.out.println("3. Search for a contact with a name");
            System.out.println("4. Delete a contact");
            System.out.println("5. Exit");

            while (!scanner.hasNextInt()) {
                System.out.println("¡Eso no es un número entero válido! Intenta de nuevo.");
                scanner.next(); // consume el token no-int para no entrar en bucle infinito
            }

            int option = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            // Verificar las opciones con un switch case
            switch (option) {

                case 1:
                    System.out.println("Enter the name of the contact:");
                    String name = scanner.nextLine();
                    System.out.println("Enter the phone number of the contact:");

                    while (!scanner.hasNextInt()) {
                        System.out.println("¡Eso no es un número entero válido! Intenta de nuevo.");
                        scanner.next(); // consume el token no-int para no entrar en bucle infinito
                    }
                    int phone = scanner.nextInt();

                    scanner.nextLine(); // Consume the newline character
                    System.out.println("Enter the email of the contact:");
                    String email = scanner.nextLine();

                    // Create a new Contacto object and add it to the list
                    contactosAgenda.add(new Contacto(name, phone, email));
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.println("Lista de todos los contactos:");
                    // iteramos todo los contactos de la agenda
                    for (Contacto c : contactosAgenda) {

                        System.out.println(c.getNombre());
                        System.out.println(c.getTelefono());
                        System.out.println(c.getCorreo());
                        System.out.println("-------------------");

                    }
                    break;

                case 3:
                    System.out.println("Introduce el nombre del contacto que deseas buscar:");
                    String buscarNombre = scanner.nextLine();
                    buscarNombre = buscarNombre.toLowerCase();

                    for (Contacto c : contactosAgenda) {
                        if (c.getNombre().toLowerCase().equalsIgnoreCase(buscarNombre)) {
                            System.out.println("Contacto encontrado:");
                            System.out.println("Nombre:" + c.getNombre());
                            System.out.println("Teléfono:" + c.getTelefono());
                            System.out.println("Correo:" + c.getCorreo());

                        } else {

                            System.out.println("Contacto no encontrado.");

                        }

                    }
                    break;

                case 4:
                    System.out.println("Introduce el número del contacto que deseas eliminar:");
                    int numeroEliminar = scanner.nextInt();
                    scanner.nextLine(); // consumimos el sato de linea en el buffer
                    String nombreEliminar = "";

                    for (Contacto c : contactosAgenda) {

                        if (c.getTelefono() == numeroEliminar) {
                            nombreEliminar = c.getNombre();

                        } else {
                            System.out.println("Contacto no encontrado.");
                            break;

                        }
                    }
                    // Eliminar el contacto de la lista
                    // Utilizamos removeIf para eliminar el contacto por número de teléfono
                    boolean eliminado = contactosAgenda.removeIf(c -> c.getTelefono() == numeroEliminar);
                    if (eliminado == true) {
                    }
                    System.out.println("El usuario " + nombreEliminar + " ha sido eliminado de la agenda.");
                    break;

                case 5:

                    System.out.println("Exiting the contact management system. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;

            }
        } while (!exit);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

}
