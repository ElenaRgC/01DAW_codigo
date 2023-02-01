open class Cuenta {
    var titulares = ArrayList<Persona>(3)
    var numeroCuenta: Int = 0
    var saldo: Double = 0.0
    var comision = true

    fun addTitular(titular: Persona) {
        if (titulares.size < 3) {
            titulares.add(titular)
        } else {
            print("Se ha alcanzado el máximo de titulares.")
        }
    }

    //fun borrartitular
    //fun ingresardinero
    //fun sacardinero
    //fun cantidadtitulares
    //get, set
}

/*
    Tipos de cuentas:
        - Cuenta joven: comision = false, ingresar +50,
        - Cuenta nómina: sin comisiones si hay nómina
        - Cuenta ahorro/oro
    Tipos de persona:
        - Persona joven: boolean estudia, <26, dni tutor legal
        - Persona rica: int propiedades, regalos, int tarjetas
        - Persona trabajadora: nómina, CIF
 */