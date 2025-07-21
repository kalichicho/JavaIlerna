package code;

public class FiguraGeometrica {
    // atributos
    private String color = "";
    private double area = 0.0;

    // constructor

    public FiguraGeometrica(String c) {
        this.setColor(c);
    }

    // getters y setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // métodos

    public double calcularArea(){

        return 0.0;
    }

}
