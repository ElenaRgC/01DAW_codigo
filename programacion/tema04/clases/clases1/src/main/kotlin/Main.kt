/*
nuevo proyecto:

Clase cuadrado con atributos que necesite,
tiene que dar una interfaz que pueda calcular el area,
el perimetro y que los imprima

Y una clase circulo que tambien tenga
la clase area y perimetro y los imprima

cada uno con dos constructores

debe contener un main donde comprobar el programa
 */
fun main(args: Array<String>) {
    var a0: Persona
    a0 = Persona(3)
    var a1 = Persona2(7)
    var a2 = Persona2(2, "Pepe")
    a1.setnombre("Juan")
    a1.altura = 7 // ERROR DE CONCEPTO DE PROGRAMACION ORIENTADA A OBJETOS PURA.
    //a1.setaltura(7) si la variable altura de persona 2 fuese privada la forma anterior daria error y habria que hacerlo asi


    var a3 = Persona(3, "Ana", 23)//clase tipo persona con contrustor de 3 elementos


    print(a3.toString())

    a1.presentacion()
    a2.presentacion()

    /*clase "Punto" y objeto "centro" creados como ejemplos pedidos por el profesor
    y comprobar que cada una de las opciones de imprimir propuestas funcionan
     */
    var centro = Punto(7, 8)
    centro.presentacion(1)
    centro.presentacion(2)
    centro.presentacion(3)
    centro.presentacion(6)


    var micasa = Casa(a3, a1)
    micasa.DatosMatrimonio()
}