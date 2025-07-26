package code;

public abstract class Animal {

    // Attributes
    private String color = "";
    private String nombre = "";
    private int edad = 0;

    // Constructor
    public Animal(String c, String n, int e){
    
    this.setColor(c);this.setNombre(n);this.setEdad(e);}

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // methods

    public String comer() {

        return "comiendo...";

    }

    public String dormir() {

        return "ZzZzZz";

    }   

    abstract String emitirSonido();
}
