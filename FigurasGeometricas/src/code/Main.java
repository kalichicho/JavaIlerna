

public class Main {
    public static void main(String[] args) {
        
        //Objetos de las figuras geométricas
        Cuadrado cuadrado1 = new Cuadrado(5.0, "Rojo");
        Circulo circulo1 = new Circulo(2.0,"azul");
        Triangulo triangulo1 = new Triangulo(3.0,4.0,"verde");

        // Imprimir el área del cuadrado

        System.out.println("Área del cuadrado: " + cuadrado1.calcularArea());
        // Imprimir el área del círculo
        System.out.println("Área del círculo: " + circulo1.calcularArea());
        // Imprimir el área del triángulo
        System.out.println("Área del triángulo: " + triangulo1.calcularArea());



    }
}
