import java.sql.*

class MujerBBDD {

    companion object {

        private var guerrerasExtraidas = 0
        private val maxGuerreras = 15 // Info extraída de la BBDDD

        fun extraerGuerreras(numGuerreras: Int): ArrayList<MujerGuerrera>{
            val conexion = ConexionBD()
            var ps: PreparedStatement? = null
            var guerreras = ArrayList<MujerGuerrera>()

            var i = 0

                try {
                    conexion.conectar()
                    val query = Constantes.queryGuerreras
                    ps = conexion.getPreparedStatement(query)


                    while (i <= numGuerreras) {
                        // Si se acaban, volvemos al principio de la lista
                        if(guerrerasExtraidas == maxGuerreras){
                            guerrerasExtraidas = 0
                        }

                        guerrerasExtraidas++
                        ps?.setInt(1, guerrerasExtraidas)
                        ps?.setInt(2, maxGuerreras)
                        var rs = ps?.executeQuery()

                        if (rs?.next() == true) {

                            var guerrera = MujerGuerrera(
                                rs.getString("nombre"),
                                rs.getInt("edad"),
                                rs.getInt("indice_inteligencia"),
                                rs.getInt("fuerza")
                            )

                            guerreras.add(guerrera)
                        }
                        i++
                    }

                } catch (e: Exception) {
                    println(e.message)
                    println("Se ha producido un error, se devuelve un ArrayList vacío.")
                } finally {
                    ps?.close()
                    conexion.desconectar()
                }

            return guerreras
        }
    }
}