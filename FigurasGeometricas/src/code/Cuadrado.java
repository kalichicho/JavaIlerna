package code;

public class Cuadrado extends FiguraGeometrica {

    //atributos
    private double lado;

    //constructor
    public Cuadrado(double l, String c){
        super(c);
        this.setLado(l);

    }

    //getters y setters
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }   

    //métodos

    @Override
    public double calcularArea(){

        double areaCuadrado= this.getLado()* this.getLado();
        return areaCuadrado;
    }



}
