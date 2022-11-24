import kotlin.random.Random

fun llenarArrayRandom(array: IntArray, minimo: Int, maximo: Int) {
    for (i in array.indices) {
        array[i] = Random.nextInt(minimo,maximo)
    }
}