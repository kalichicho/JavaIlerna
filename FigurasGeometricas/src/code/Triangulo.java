package code;

public class Triangulo extends FiguraGeometrica {

    // atributos
    private double base = 0.0;
    private double altura = 0.0;

    // constructor

    public Triangulo(double b, double a, String c) {

        super(c);
        this.setBase(b);
        this.setAltura(a);
    }

    // getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // metodos

    @Override
    public double calcularArea(){

        double areaTriangulo = (this.getAltura() * this.getBase())/2;
        return areaTriangulo;
    }

}
