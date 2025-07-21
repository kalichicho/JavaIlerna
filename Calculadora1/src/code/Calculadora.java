package code;

public class Calculadora {


    //Atributos

    private int numOperaciones;

    //Constructor
    public Calculadora(){
        this.setNumOperaciones(0);
    }

    //Getters y Setters

    public int getNumOperaciones() {
        return numOperaciones;
    } 

    public void setNumOperaciones(int numOperaciones) {
        this.numOperaciones = numOperaciones;
    }

    // Métodos

    public void operacion(int num1, int num2){

        System.out.println("El resultado de la multiplicación es: " + num1 * num2);
        this.setNumOperaciones(this.getNumOperaciones() + 1) ;
        System.out.println("El número de operaciones actualmente es: " + getNumOperaciones());

    }

    public void operacion(int num1 , int num2, String entrada){

        if(entrada.equalsIgnoreCase("sumar")){

            System.out.println("El resultado de la suma es: " + (num1 + num2));
            this.setNumOperaciones(this.getNumOperaciones() + 1);
            System.out.println("El número de operaciones actualmente es: " + getNumOperaciones());

        } else if (entrada.equalsIgnoreCase("restar")){
            System.out.println("El resultado de la resta es: " + (num1 - num2));
            this.setNumOperaciones(getNumOperaciones() + 1 );
            System.out.println("El número de operaciones actualmente es: " + getNumOperaciones());
        }

    }









}
