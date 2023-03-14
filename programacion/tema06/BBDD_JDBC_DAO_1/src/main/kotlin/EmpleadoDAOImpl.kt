import java.sql.PreparedStatement
import java.sql.SQLException

class EmpleadoDAOImpl: EmpleadoDAO {
    private val conexion = ConexionBD()


    override fun getEmpleadoaByDNI(dni: Int): Empleado? {
        conexion.conectar()
        val query = "SELECT * FROM empleados WHERE SNI = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, dni)
        val rs = ps?.executeQuery()
        var empleado: Empleado? = null
        if (rs?.next() == true) {
            empleado = Empleado(rs.getInt("dni"), rs.getString("nombre"), rs.getInt("puesto"))
        }
        ps?.close()
        conexion.desconectar()
        return empleado
    }

    override fun getAllEmpleados(): List<Empleado> {
        conexion.conectar()
        val query = "SELECT * FROM empleados"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val empleados = mutableListOf<Empleado>()
        while (rs?.next() == true) {
            var empleado = Empleado(rs.getInt("dni"), rs.getString("nombre"), rs.getInt("puesto"))
            empleados.add(empleado)
        }
        st?.close()
        conexion.desconectar()
        return empleados
    }

    override fun insertEmpleado(empleado: Empleado): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null
        try {
            conexion.conectar()
            val query = "INSERT INTO empleados (dni, nombre, puesto) VALUES (?, ?, ?)"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, empleado.dni)
            ps?.setString(2, empleado.nombre)
            ps?.setInt(3, empleado.puesto)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println(e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }
        return result == 1
    }

    override fun updateEmpleado(empleado: Empleado): Boolean {
        conexion.conectar()
        val query = "UPDATE empleados SET nombre = ? WHERE dni = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setString(1, empleado.nombre)
        ps?.setInt(2, empleado.dni)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun deleteEmpleado(dni: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM empleados WHERE dni = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, dni)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}