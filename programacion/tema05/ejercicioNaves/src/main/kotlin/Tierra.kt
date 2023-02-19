class Tierra {
    private var parrilla = 3 // si la parrilla es N, tendremos NxN cuadrantes
    private var cuadrantes = arrayListOf<Cuadrante>()

    constructor() {
        generarCuadrantes()
    }

    private fun generarCuadrantes() {
        var i = 0
        var j = 0

        while (i < parrilla) {
            j = 0
            while (j < parrilla) {
                cuadrantes.add(Cuadrante(i,j))
                i++
            }
           j++
        }
    }

}