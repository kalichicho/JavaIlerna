package code;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {

    //instanciamos el objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);


    //Pedimos al usuario que introduzca la palabra
    System.out.println("Introduce la palabra");
    String palabraUsuario = sc.nextLine();



    //instanciamos un objeto de la clase Cadena

    Cadena palabra1 = new Cadena(palabraUsuario);

    //llamamos a metodos de la clase Cadena con el objeto instanciado

    palabra1.conteoVocales(palabra1.getPalabra());

    palabra1.palabraInvertida(palabra1.getPalabra());

    //pedimos al usuario el caracter
    System.out.println("Introduce el caracter");
    char caracter = sc.next().charAt(0);

    palabra1.conteoCaracter(caracter, palabra1.getPalabra());


    sc.close();

}
}