# Matriz Aleatoria

Este pequeño proyecto genera una matriz de 2x3 con números aleatorios (0..2). Después de cada fila se muestra su suma en verde y, al final, aparecen las sumas de cada columna y el total general en rojo.

## Ejecución

Compila y ejecuta desde esta misma carpeta:

```bash
javac -d bin src/code/*.java
java -cp bin code.Main
```

La salida se ve similar a la siguiente (aquí sin colores):

```
1 0 2 |3
2 1 1 |4
3 1 3 |7
```

En la consola real, los valores después de la barra vertical se muestran coloreados para resaltar la información.

## Estructura del código

- **MatrizAleatoria**: contiene la lógica para rellenar la matriz y calcular sumas.
- **Colores**: define códigos ANSI para imprimir en rojo y verde.
- **Main**: crea un objeto de `MatrizAleatoria` y llama a `imprimirSumaMatriz()`.

Con este ejercicio se practican arrays bidimensionales, bucles anidados y organización básica en clases de Java.
