import kotlin.random.Random

fun main(args: Array<String>) { //Elena Rodríguez Calderón
    val LONGITUDCOLA = 30
    val TURNOSDIARIOS = 25

    var cola = IntArray(LONGITUDCOLA){0}
    var turno = 1
    var personasAtendidas = 0

    llenarColaInicio(cola, 1, 10) //Consideramos que no hay huecos libres al empezar
    println("Cola al inicio de la jornada:")
    imprimirArray(cola)

    do {
        personasAtendidas = atenderPersonas()
        pasarTurno(cola, personasAtendidas)
        escribirInforme(turno, cola, personasAtendidas)
        llenarCola(cola)

        turno++
    } while (turno <= TURNOSDIARIOS /*&& cola[0] != 0*/)

}

fun llenarColaInicio(array: IntArray, minimo: Int, maximo: Int) {
    for (i in array.indices) {
        array[i] = Random.nextInt(minimo,maximo)
    }
}

fun atenderPersonas(): Int {
    return Random.nextInt(1,4)
}

fun pasarTurno(cola: IntArray, atendidos: Int) {
    var i = 0

    while (i < cola.size) {
        if (i < cola.size-atendidos) {
            cola[i] = cola[i+atendidos]
        } else {
            cola[i] = 0
        }
        i++
    }
}

fun imprimirArray(array: IntArray) {
    for (i in array.indices) {
        print("[${array[i]}] ")
    }
    println()
}

fun escribirInforme(turno: Int, array: IntArray,atendidos: Int) {
    println("Turno $turno:")
    println("Cola esperando turno:")
    imprimirArray(array)
    println("Personas atendidas en este turno: $atendidos")
}

fun llenarCola(cola: IntArray) {
    var i = 0
    println("Cola con los huecos generados:")
    while (i < cola.size) {
        if (cola[i] == 0) {
            cola[i] = Random.nextInt(1,10)
        }
        print("[${cola[i]}] ")
        i++
    }
    println("")
}