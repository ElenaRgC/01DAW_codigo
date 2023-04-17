fun main(args: Array<String>) {
    var artistaImp = ArtistaDAOImp()

    artistaImp.selectAllArtists()
    // artistaImp.selectArtist(9)

    artistaImp.insertArtist(10,"Sungmin", "Lee", "Sungmin")

    //artistaImp.updateArtist("apellido", "Lee", "Liu")
    artistaImp.updateArtist("apellido", "Liu", "Lee")

    artistaImp.deleteArtist(10)
}