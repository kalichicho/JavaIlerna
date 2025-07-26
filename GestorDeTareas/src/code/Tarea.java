package code;

public class Tarea {

    // atributos
    public static enum EstadoTarea{

        PENDIENTE,
        EN_PROCESO,
        COMPLETADA;

    }
    private String titulo ="";
    private String descripcion = "";
    private EstadoTarea estado;

    //constructor

    public Tarea(String t, String d, EstadoTarea e){

        this.setTitulo(t);
        this.setDescripcion(d);
        this.setEstado(e);

    }

    // getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public EstadoTarea getEstado() {
        return estado;
    }
    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
    }

    //Metodos


}
