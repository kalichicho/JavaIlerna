package code;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //instanciar la clase Scanner
        Scanner lectura = new Scanner(System.in);

        //instanciar la clase Calculadora
        Calculadora operacion1 = new Calculadora();


        int num1 = 0;
        int num2 = 0;
        String entradaOperacion = "";


        //Solicitar al usuario el primer número
        System.out.println("Ingrese el primer número:");
        num1 = lectura.nextInt();
        lectura.nextLine();
        num2 = lectura.nextInt();
        lectura.nextLine();

        //Solicitar al usuario el tipo de operación
        System.out.println("Ingrese el tipo de operación (sumar, restar. Si no introduce nada u otra cosa, entonces se procederá a multiplicar):");
        entradaOperacion = lectura.nextLine();


        if (entradaOperacion.equalsIgnoreCase("sumar") || entradaOperacion.equalsIgnoreCase("restar")) {
            operacion1.operacion(num1, num2, entradaOperacion);
        } else {
            operacion1.operacion(num1, num2);
        }

        //Cerrar el scanner
        lectura.close();
    }
}
