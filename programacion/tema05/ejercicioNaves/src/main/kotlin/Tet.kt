class Tet {
    var almacenDrones = arrayOf<Dron>(200)

    private fun rellenarTet() {
        for (i in 1..200) {
            almacenDrones.add(Dron())
        }
    }

}