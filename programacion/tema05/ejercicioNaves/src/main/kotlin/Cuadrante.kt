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

}