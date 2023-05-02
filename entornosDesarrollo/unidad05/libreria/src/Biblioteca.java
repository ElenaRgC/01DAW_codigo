import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> listaLibros;
    private ArrayList<Persona> listaPersonas;

    public Biblioteca() {
        listaLibros = new ArrayList<Libro>();
        listaPersonas = new ArrayList<Persona>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void removerLibro(Libro libro) {
        listaLibros.remove(libro);
    }

    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public void removerPersona(Persona persona) {
        listaPersonas.remove(persona);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public Persona buscarPersona(String nombre) {
        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }
        return null;
    }
}
