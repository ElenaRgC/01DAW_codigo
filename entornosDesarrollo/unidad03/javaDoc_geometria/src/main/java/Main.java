/**
 * La clase Main
 * @author Elena Rodríguez Calderón
 * @version 1.0
 */
public class Main {
    /**
     * La función principal
     *
     * @param args los argumentos de entrada
     */
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        rect.ancho = 10;
        rect.alto = 20;
        System.out.println("El área del rectángulo es: " + rect.getArea());

        Circulo circ = new Circulo();
        circ.radio = 5;
        System.out.println("El área del círculo es: " + circ.getArea());
    }
}