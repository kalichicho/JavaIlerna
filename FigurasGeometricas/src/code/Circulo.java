

public class Circulo extends FiguraGeometrica {

    // atributos
    private double radio;

    // Constructor

    public Circulo(double r, String c) {

        super(c);
        this.setRadio(r);

    }

    // getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // métodos

    @Override
    public double calcularArea() {

        double areaCirculo = Math.PI * Math.pow(this.getRadio(), 2);
        return areaCirculo;
    }
}
