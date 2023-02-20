import kotlin.random.Random

class Cuadrante {
    private var filaCuadrante: Int
    private var columnaCuadrante: Int
    var flotaDrones = arrayListOf<Dron>()

    // Dado que en el enunciado no se menciona que sean Vika y Jack quienes reparen
    // se les considerará como un simple atributo

    private var mecanico = "Jack"
    private var supervisora = "Vika"

    constructor(fila: Int, col: Int) {
        filaCuadrante = fila
        columnaCuadrante = col

        mecanico += "$fila$col"
        supervisora += "$fila$col"
    }

    fun estropearDrones() {
        for (dron in flotaDrones) {
            var prob = Random.nextInt(0,10)
            if (prob < 2) {
                dron.estropearse()
            }
        }
    }

    fun recorrerDrones() {

    }

}