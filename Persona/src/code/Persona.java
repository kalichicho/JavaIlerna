package code;

public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private char sexo;
    private int edad;

    public Persona(String n, String a1, String a2, char s, int e) {
        this.setNombre(n);
        this.setApellido1(a1);
        this.setApellido2(a2);
        this.setSexo(s);
        this.setEdad(e);
    }

    // Getters and Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // metodos

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido 1: " + this.getApellido1());
        System.out.println("Apellido 2: " + this.getApellido2());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Edad: " + this.getEdad());
    }

    public void mayorEdad() {
        System.out.println( this.getEdad() >= 18 ? "mayor de edad" : "menor de edad");
    }
}