class Ciudad {
    var lado = 3
    var sectores = ArrayList<Sector>()

    constructor()

    constructor(lado: Int) {
        this.lado = lado
        generarSectores()
    }

    private fun generarSectores() {
        var i = 0
        var j = 0

        while (i < lado) {
            j = 0
            while (j < lado) {
                sectores.add(Sector(i,j))
                j++
            }
            i++
        }
    }

    fun generarPaquetes() {
        for (sector in sectores) {
            sector.generarPaquetes()
        }
    }
}