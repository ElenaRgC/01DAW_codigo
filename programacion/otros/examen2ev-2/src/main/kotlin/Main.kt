fun main() {
    // Tomé la mala decisión al inicio de usar un arrayOfNulls para limitar los grupos :(
    var entrenador1 = Entrenador(3)
    var entrenador2 = Entrenador(2)

    for (grupo in entrenador1.grupos) {
        grupo?.llenarGrupo()
    }

    for (grupo in entrenador2.grupos) {
        grupo?.llenarGrupo()
    }

    println(entrenador1)
    println(entrenador2)

}