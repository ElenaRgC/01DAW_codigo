class Empleado(val dni: Int, val nombre: String, val puesto: Int) {
    override fun toString(): String {
        return "DNI: $dni, nombre: $nombre, puesto: $puesto."
    }
}