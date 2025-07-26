# Ejercicios básicos de Java

Este repositorio contiene varios proyectos sencillos pensados para practicar conceptos elementales del lenguaje Java. Cada carpeta es un proyecto independiente con su propio código fuente (directorio `src`) y los binarios generados durante las pruebas.

## Proyectos incluidos

- **Animal**: ejemplo de herencia y clases abstractas. Define una clase `Animal` con atributos y métodos comunes y dos subclases (`Gato` y `Perro`) que implementan el método `emitirSonido`. En el `Main` se crean instancias de estas clases para ver cómo se sobrescriben los métodos.
- **Calculadora1**: muestra la sobrecarga de métodos y el uso de `Scanner` para leer datos por consola. Dependiendo de la entrada del usuario, realiza sumas, restas o multiplicaciones y lleva un contador de operaciones realizadas.
- **FigurasGeometricas**: jerarquía de clases para distintas figuras (`Cuadrado`, `Circulo`, `Triangulo`) que heredan de `FiguraGeometrica`. Cada figura implementa su propio cálculo de área.
- **Libro**: solicita por consola varios datos de un libro, los almacena en una clase `Libro` con numerosos atributos y luego muestra la información introducida.
- **Persona**: definición simple de la clase `Persona` con varios campos personales y métodos para presentar los datos y comprobar si la persona es mayor de edad.
- **DetectorIsograma**: comprueba si una palabra es un isograma utilizando un `Set` para detectar letras repetidas.

## Cómo ejecutar

Cada proyecto puede compilarse individualmente desde su carpeta. Por ejemplo:

```bash
cd Animal
javac -d bin src/code/*.java
java -cp bin code.Main
```

Los demás proyectos siguen un esquema similar.
