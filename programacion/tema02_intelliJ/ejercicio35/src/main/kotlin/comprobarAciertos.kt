fun comprobarAciertos(cantidadNumeros: Int, numerosJugador: IntArray, numerosPremiados: IntArray) {
    var numerosAcertados: Int = 0

    for (i in 0..cantidadNumeros - 1) {

        for (j in 0..cantidadNumeros - 1) {
            if (numerosJugador[i] == numerosPremiados[j]) {
                numerosAcertados++
            }
        }

    }

    println("Tu número de aciertos es: $numerosAcertados")

    if (numerosAcertados == cantidadNumeros) {
        println("Enhorabuena, has acertado todos los números.")
    }

}