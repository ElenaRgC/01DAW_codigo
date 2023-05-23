class Tablero {
    constructor()

    fun crearEquipo(numGuerreras: Int): Equipo {
        return Equipo(MujerBBDD.extraerGuerreras(numGuerreras))
    }

    fun jugar(equipo1: Equipo, equipo2: Equipo, retos: ArrayList<Tarea>): ArrayList<MujerGuerrera> {

        var listaGanadoras = ArrayList<MujerGuerrera>()

        for (tarea in retos) {

            var guerrera1 = equipo1.devolverMiembro(retos.indexOf(tarea))
            var guerrera2 = equipo2.devolverMiembro(retos.indexOf(tarea))

            if (realizarReto(guerrera1, tarea)) {
                listaGanadoras.add(guerrera1)
            }

            if (realizarReto(guerrera2, tarea)) {
                listaGanadoras.add(guerrera2)
            }

        }

        return listaGanadoras

    }

    fun realizarReto(guerrera: MujerGuerrera, reto: Tarea): Boolean {
        return guerrera.analizarTarea(reto)
    }

    fun generarRetos(cantidadRetos: Int): ArrayList<Tarea> {
        var retos = ArrayList<Tarea>()

        for (i in 1..cantidadRetos) {
            retos.add(FactoriaTarea.devolverUnaTarea())
        }

        return retos
    }
}