interface EmpleadoDAO {
    fun getEmpleadoaByDNI(dni: Int): Empleado?
    fun getAllEmpleados(): List<Empleado>
    fun insertEmpleado(empleado: Empleado): Boolean
    fun updateEmpleado(empleado: Empleado): Boolean
    fun deleteEmpleado(dni: Int): Boolean
}