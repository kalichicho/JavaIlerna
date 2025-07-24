package code;

public class Geometria {

    // atributos de la clase Geometria
    // definimos los atributos que vamos a utilizar para calcular el area de las
    // figuras geometric
    private int lado;
    private int radio;
    private int base;
    private int altura;

    // constructor de la clase Geometria
    public Geometria(int l, int r, int b, int a) {
        this.setLado(l);
        this.setRadio(r);
        this.setBase(b);
        this.setAltura(a);
    }
    
    public Geometria(int l) {
        this.setLado(l);

    }

   


    //getters y setters de los atributos
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }


    // metodos para calcular el area de las figuras geometricas

    // calculamos el area de un cuadrado
    public int areaCuadrado(int lado) {
        System.out.print("El area del cuadrado es: ");
        return lado * lado;
    }

    // calculamos el area de un circulo

    public int areaCirculo(int radio) {
        System.out.print("El area del circulo es: ");
        return (int) (Math.PI * (radio * radio));
    }

    // calculamos el area de un triangulo
    public int areaTriangulo(int base, int altura) {
        return (base * altura) / 2;
    }

}
