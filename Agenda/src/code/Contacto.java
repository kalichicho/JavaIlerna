package code;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Contacto {

    // atributes
    private String nombra = "";
    private int telefono = 0;
    private String correo = "";
    private String ruta= "C:\\Users\\senasa.demanuel\\Java con VSCODE\\Agenda";
    // contructor
    public Contacto(String n, int t, String c) {

        this.setNombre(n);
        this.setTelefono(t);
        this.setCorreo(c);
    }

    // getters and setters
    public String getNombre() {
        return nombra;
    }

    public void setNombre(String n) {
        this.nombra = n;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int t) {
        this.telefono = t;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String c) {
        this.correo = c;
    }

    //metodos


    //guardar contacto en un archivo

    

    public static void guardarAgenda(List<Contacto> contactosAgenda, Path ruta) {

        




    }
        

}
