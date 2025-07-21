package code;

public class isogrma {

    // atributos

    private String palabra = "";

    // constructor

    public void Isograma(String p) {

        this.setPalabra(p);

    }

    // getter and Setters

    public String getPalabra() {

        return palabra;
    }

    public void setPalabra(String pa) {
        this.palabra = pa;
    }

    // metodos

    public void palabraM(String c1) {
        c1 = c1.toLowerCase();
        StringBuilder sb = new StringBuilder(c1.length());
        String c2 = sb.toString();
        int contador = 0;
        for (int i = 0; i <= c1.length; i++) {

            if (iniciardor == 0) {
                sb.setCharAt(0, c1.charAt(0));
                c2 = sb.toString();
            }

            for (int j = 0; j < c1.length; j++) {

                if (j == 0) {
                    contador = 0;
                }
                if (i > 0 && c1.charAt(i) == c2.charAt(j) && contador < c1.length()) {

                    System.out.prinln("La palabra " + c1 + " no es un isograma");

                }

                contador++;
                if(contador == c1.length){
                    c2.setCharAt(i, c1.charAt(i));
                    break;
                }

            }

        }

    }
}
