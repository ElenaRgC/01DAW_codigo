import kotlin.random.Random

class Constantes {
    companion object {

        private var listaNombres =  arrayOf("Juan", "Pedro", "Luis", "Ana", "María", "Lorena")
        private var listaCalles = arrayOf("Libertad", "Ancha", "Mata", "Copa", "Paz")

        fun nombreAleatorio(): String {
            return listaNombres[Random.nextInt(listaNombres.size)]
        }

        fun calleAleatoria(): String {
            return "Calle " + listaCalles[Random.nextInt(listaNombres.size)] + " " + Random.nextInt(0,51)
        }
    }
}