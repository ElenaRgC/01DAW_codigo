interface ArtistaDAO {

    val conexion: ConexionBD

    fun selectAllArtists(): Boolean
    fun selectArtist(cod: Int): Boolean

    fun insertArtist(cod: Int, nombre_artistico: String, apellido: String, nombre: String): Boolean
    fun insertArtist(artista: Artista): Boolean
    fun insertArtists(artistas: ArrayList<Artista>): ArrayList<Artista>

    fun updateArtist(cod: Int, campo: String, nuevoValor: String): Boolean
    fun updateArtistName(cod: Int, nuevoNombre: String): Boolean

    fun deleteArtist(cod: Int): Boolean

}