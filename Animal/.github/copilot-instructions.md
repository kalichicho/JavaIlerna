# Copilot Instructions for Animal Java Project


## respuesta
- reponde siempre en español
## Project Overview
- This is a simple Java OOP project modeling animals (`Perro`, `Gato`) with inheritance and polymorphism.
- Main source code is in `src/code/`. Compiled classes are in `bin/code/`.
- Entry point: `Main.java` in `src/code/`.
- Each animal class (`Perro`, `Gato`) extends a base class (`Animal`).

## Key Files & Structure
- `src/code/Animal.java`: Base class for all animals.
- `src/code/Perro.java`, `src/code/Gato.java`: Subclasses with specific attributes/methods.
- `src/code/Main.java`: Instantiates objects and demonstrates usage.
- `bin/`: Contains compiled `.class` files.
- `lib/`: For external dependencies (currently unused).

## Build & Run Workflow
- Compile: `javac -d bin src/code/*.java`
- Run: `java -cp bin code.Main`
- No build scripts; use above commands in PowerShell or VS Code terminal.

## Coding Patterns
- Constructors in subclasses may differ in parameters (see `Perro` with/without breed).
- Methods like `emitirSonido()` and `comer()` are implemented in subclasses.
- Use `getRaza()` for breed info in `Perro`.
- Follow the pattern in `Main.java` for instantiation and method calls.

## Conventions
- Package declaration: All source files in `src/code/` use `package code;`.
- Class names are capitalized and match filenames.
- No external libraries or frameworks used.

## Example Usage
```java
Perro perro1 = new Perro("rojo", "Firulais", 5);
Perro perro2 = new Perro("Labrador", "Marrón", "Rayo", 3);
Gato gato1 = new Gato("Naranja", "Michi", 2);
System.out.println(gato1.emitirSonido());
System.out.println(perro1.emitirSonido());
System.out.println("La raza del perro es: " + perro2.getRaza());
```

## Tips for Agents
- Always use the correct package (`code`) when creating new classes.
- Place new source files in `src/code/`.
- Update `Main.java` for new demo/test cases.
- Use the build/run commands above for manual testing.

---
If any conventions or workflows are unclear, please ask for clarification or examples from the user.
