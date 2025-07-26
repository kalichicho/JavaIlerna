
public class Main {
    public static void main(String[] args) {
    
        //instanciar objetos
        Perro perro1 = new Perro("rojo", "Firulais", 5);
        Perro perro2 = new Perro("Labrador", "Marrón", "Rayo", 3);
        Gato gato1 = new Gato("Naranja", "Michi", 2);

        //mostrar atributos y métodos

        
        
       
        System.out.println(gato1.emitirSonido());
        System.out.println(gato1.comer());
        System.out.println(perro1.emitirSonido());
        System.out.println("La raza del perro es: " + perro2.getRaza());



    }
}
