package code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instanciamos el objeto Scanner para obtener datos por teclado
        Scanner sc = new Scanner(System.in);

        // declaración de array de objetos

        Empleado[] empleados = new Empleado[5];

        // variables para bucle

        String name = "";
        double salary = 0.0;
        double salaryMax = 0.0;
        String nameMax = "";

        for (int i = 0; i < 5; i++) {

            System.out.println("Introduce el nombre del empleado nº " + (i + 1));
            name = sc.nextLine();
            System.out.println("Introduce el salario del empleado " + name);
            salary = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new Empleado(name, salary);
        }

        for (int i = 0; i < empleados.length; i++) {

            if (salaryMax < empleados[i].getSueldo()) {

                salaryMax = empleados[i].getSueldo();
                nameMax = empleados[i].getNombre();

            }
        }

        //mostramos los datos
        System.out.println("El empleado con mayor sueldo es: " + nameMax + " y gana: " + salaryMax + "€");

        //ceramos el scanner

        sc.close();
    }
}
