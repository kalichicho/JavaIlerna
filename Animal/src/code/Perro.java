package code;

public class Perro extends Animal {

    // Atributos

    private String raza = "";

    // Constructor

    public Perro(String c, String n, int e) {

        super(c, n, e);
    }

    public Perro(String r, String c, String n, int e) {
        super(c, n, e);
        this.setRaza(r);
    }

    // Getters y Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Métodos
    @Override
    public String emitirSonido() {

        return "Guau!";
    }

}
