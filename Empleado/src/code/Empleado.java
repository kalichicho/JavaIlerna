package code;

public class Empleado {

    //atributos

    private String nombre ="";
    private double sueldo= 0.0;


    //constructor

    public Empleado(String n, double s){
        this.setNombre(n);
        this.sueldo = s;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    





}
