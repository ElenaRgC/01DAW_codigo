public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 30, 'M');

        // Creamos un objeto de la clase Libro
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);

        // Creamos un objeto de la clase Biblioteca
        Biblioteca biblioteca1 = new Biblioteca();

        // Agregamos el libro a la biblioteca
        biblioteca1.agregarLibro(libro1);

        // Agregamos la persona a la biblioteca
        biblioteca1.agregarPersona(persona1);

        // Buscamos el libro por su título
        Libro libroEncontrado = biblioteca1.buscarLibro("El Quijote");

        // Buscamos la persona por su nombre
        Persona personaEncontrada = biblioteca1.buscarPersona("Juan");

        // Imprimimos los resultados de las búsquedas
        System.out.println("Libro encontrado: " + libroEncontrado.getTitulo() + " de " + libroEncontrado.getAutor());
        System.out.println("Persona encontrada: " + personaEncontrada.getNombre() + " de " + personaEncontrada.getEdad() + " años");
    }

}