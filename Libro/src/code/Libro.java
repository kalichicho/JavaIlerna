package code;

public class Libro {

    // atributos

    private String ISBN;
    private String Autor;
    private String Titulo;
    private int AnioPublicacion;
    private String Editorial;
    private int NumeroPaginas;

    // constructor
    public Libro(String i, String a, String t, int ap, String e, int np) {
        this.setISBN(i);
        this.setAutor(a);
        this.setTitulo(t);
        this.setAnioPublicacion(ap);
        this.setEditorial(e);
        this.setNumeroPaginas(np);

    }

    // getters y setters

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public int getAnioPublicacion() {
        return AnioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.AnioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        this.Editorial = editorial;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.NumeroPaginas = numeroPaginas;
    }

    // metodos

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + this.getISBN() + '\'' +
                ", Autor='" + this.getAutor() + '\'' +
                ", Titulo='" + this.getTitulo() + '\'' +
                ", AnioPublicacion=" + this.getAnioPublicacion() +
                ", Editorial='" + this.getEditorial() + '\'' +
                ", NumeroPaginas=" + this.getNumeroPaginas() +
                '}';
    }

    public void mostrarDatos() {

        System.out.println("el valor es: " + this.getISBN());
        System.out.println("el valor es: " + this.getAutor());
        System.out.println("el valor es: " + this.getTitulo());
        System.out.println("el valor es: " + this.getAnioPublicacion());
        System.out.println("el valor es: " + this.getEditorial());
        System.out.println("el valor es: " + this.getNumeroPaginas());

    }

}
