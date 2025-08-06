package code;

public class Comparador {

    // NOTAS

    /*
     * Las fracciones equivalentes se determinan de la siguiente manera
     * fraccion 1: a/b
     * fraccion 2: c/d
     * si a*d == b*c
     * entonces la fracción 1 es equivalente a la fracción 2
     */

    // Atributos
    // Correspondiente a la primera fracción
    private int numerador1 = 0;
    private int denominador1 = 0;
    // Correspondiente a la segunda fracción
    private int numerador2 = 0;
    private int denominador2 = 0;

    // constructor

    public Comparador(int n1, int d1, int n2, int d2) {

        this.setNumerador1(n1);
        this.setDenominador1(d1);
        this.setNumerador2(n2);
        this.setDenominador2(d2);

    }

    // getters y setters
    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador) {
        this.numerador1 = numerador;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador) {
        this.denominador1 = denominador;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador) {
        this.numerador2 = numerador;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador) {
        this.denominador2 = denominador;
    }
    // Metodos

    // Metodo para comprobar si dos números son equivalentes por regla de
    // equivalencia

    public void comprobador(int parmNumerador1, int parmDenominador1, int parmNumerador2, int parmDenominador2) {

        // asignamos el valor de los parametros que llegan a la función por letras para
        // mejor manejo de formulas
        int a = parmNumerador1;
        int b = parmDenominador1;
        int c = parmNumerador2;
        int d = parmDenominador2;

        // Guardamos en variables equivalentes los valores tras aplicar las formulas de
        // equivalencias en fracciones
        int numeradorEquivalente = a * d;
        int denominadorEquivalente = b * c;

        // comprobamos si las fracciones son equivalentes
        if (numeradorEquivalente == denominadorEquivalente) {

            System.out.println("Felicidades pequeño timi has introducido 2 fracciones equivalentes");
        } else {
            System.out.println("Las fracciones que has introducido no son equivalentes");

        }

        System.out.println(mcd(a, b, c, d));

    }

    // Metodo máximo común divisor
    public static String mcd(int a, int b, int c, int d) {

        int num1 = a;
        int num2 = b;
        int num3 = c;
        int num4 = d;
        double numerador1;
        double denominador1;
        double numerador2;
        double denominador2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        numerador1 = num1 / a;
        denominador1 = num2 / a;

        while (d != 0) {
            int temp1 = d;
            d = c % d;
            c = temp1;
        }

        numerador2 = num3 / c;
        denominador2 = num4 / c;

        String retorno = "El máximo común divisor de la primer fracción es: " + a
                + " el máximo común divisor de la segunda fracción es: " + c
                + " lo que da como resultado de reduccion en la fracción 1: " + numerador1 + "/" + denominador1
                + " y en la fracción 2: " + numerador2 + "/" + denominador2;
        return retorno;
    }

}
