package code;

import java.util.Set;

public class Cadena {

    // atriburos

    private String palabra = "";

    // constructor

    public Cadena(String p) {

        setPalabra(p);

    }

    // Getters and setters

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    // Metodos

    public void conteoVocales(String param1) {

        param1 = param1.toLowerCase();
        int contadorVocales = 0;

        Set<Character> vocales = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < param1.length(); i++) {

            char c = param1.charAt(i);

            if (vocales.contains(c)) {
                contadorVocales++;
            }

        }

        if (contadorVocales > 0) {
            System.out.println("La palabra introducida contiene " + contadorVocales + " vocales");
        } else {

            System.out.println("La palabra introducida con contiene vocales");
        }

    }

    public void palabraInvertida(String param1) {
        param1 = param1.toLowerCase();
        char[] arrayParam1 = param1.toCharArray();
        int longitudChar = arrayParam1.length;
        String[] invertido = new String[longitudChar];
        int contador = 0;

        for (int i = longitudChar - 1; i >= 0; i--) {

            invertido[contador] = String.valueOf(arrayParam1[i]);
            contador++;

        }

        for (int i = 0; i < invertido.length; i++) {

            System.out.print(invertido[i]);
        }

        System.out.println();
    }


    public void conteoCaracter(char param1, String param2){
        param1 = Character.toLowerCase(param1); //convertimos el caracter introducido en minuscula
        param2 = param2.toLowerCase();
        int contador = 0;

        for(int i = 0; i < param2.length(); i++){

            if(param2.charAt(i) == param1){
              contador++;
            }


        }
        System.out.println(contador);

    }

}
