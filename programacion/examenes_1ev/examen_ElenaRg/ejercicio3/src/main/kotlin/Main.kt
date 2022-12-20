import kotlin.random.Random

fun main(args: Array<String>) { // Elena Rodríguez Calderón
    val N = 3
    var campamento: Array<IntArray> = Array(N) {IntArray(N){0}}

    var zona = -1
    var zonaAtacada = Array(2){-1}

    zona = alerta()
    atacarZona(zona, zonaAtacada)
    if (zonaAtacada[0] != -1) {
        if (campamento[zonaAtacada[0]][zonaAtacada[1]] > 50) {

        }
    }

}

fun alerta(): Int {
    return Random.nextInt(-1,10)
}

fun atacarZona(alerta: Int, zonaAtacada:Array<Int>) {
    // Es una chapuza, lo sé
    // No me da la cabeza para cambiar todas las funciones para que funcione con un int
    // Culpa mía por caer en la trampa del NxN, hubiese sido más fácil con un vector

    if (alerta != -1) {
        zonaAtacada[0] = (alerta / 3)
        zonaAtacada[1] = (alerta / 4)
    }
}

fun ataqueCampamento(campamento: Array<IntArray>, cantidad:Int) {
    var sector = 0
    var zona = 0

    while (sector < campamento.size) {
        while (zona < campamento[sector].size) {
            if (campamento[sector][zona] != 0) {
            campamento[sector][zona] -= cantidad
            }
            zona++
        }
        sector++
    }
}

fun nivelZona(zona: Array<Int>, campamento: Array<IntArray>): Int {
    return campamento[zona[0]][zona[1]]
}

fun aumentarEnergia(zona: Array<Int>, campamento: Array<IntArray>, cantidad: Int){
    campamento[zona[0]][zona[1]] += cantidad
}

fun imprimirCampamento(campamento: Array<IntArray>) {
    var orden = 1
    for (sector in campamento) {
        for (zona in sector) {
            println("Zona $orden: $zona energia")

        }
    }
}