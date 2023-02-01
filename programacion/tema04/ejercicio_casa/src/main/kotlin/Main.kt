fun main() { // Elena Rodríguez Calderón
    /* Nuevo proyecto:
    Clase cuadrado con atributos que necesite,
    tiene que dar una interfaz que pueda calcular el area,
    el perimetro y que los imprima

    Y una clase circulo que tambien tenga
    la clase area y perimetro y los imprima

    cada uno con dos constructores
    debe contener un main donde comprobar el programa
 */

    var cuadrado1 = Cuadrado(4)
    cuadrado1.imprimirArea()
    cuadrado1.imprimirPerimetro()

    cuadrado1.setlado(5)

    cuadrado1.imprimirArea()
    cuadrado1.imprimirPerimetro()

    var circulo1 = Circulo(1)
    circulo1.imprimirArea()
    circulo1.imprimirPerimetro()
}

