class Mapa {
    var maxfilas = 0
    var maxcols = 0
    var tablero = arrayListOf<Casilla>()

    constructor(maxfilas: Int, maxcols: Int) {
        this.maxfilas = maxfilas
        this.maxcols = maxcols
        generarCasillas()
    }

    fun generarCasillas() {
        var fila = 0
        var col = 0

        while (fila < maxfilas) {
            col = 0
            while (col < maxcols) {
                tablero.add(Casilla(fila,col))
                col++
            }
            fila++
        }
    }

    fun estanTodasOcupadas(): Boolean {
        for (casilla in tablero) {
            if (casilla.propietario == null) {
                return false
            }
        }
        return true
    }


}