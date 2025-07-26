package code;

import java.util.HashSet;
import java.util.Set;

public class Isograma {

    // atributos

    private String palabra;

    // constructor

    public Isograma(String p) {

        setPalabra(p);
    }

    // getters and setters

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    // metodo

    public void esIsograma(String palabra1) {
    palabra1 = palabra1.toLowerCase(); // Ignorar mayúsculas/minúsculas
    Set<Character> letras = new HashSet<>();

    for (char c : palabra1.toCharArray()) {
        if (letras.contains(c)) {
            System.out.println("No es isograma");
            return;
        }
        letras.add(c);
    }

    System.out.println("Es un isograma");
}

}
