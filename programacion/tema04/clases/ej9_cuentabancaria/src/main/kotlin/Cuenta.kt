open class Cuenta {
    var titulares = ArrayList<Persona>(3)
    var numeroCuenta: Int = 0
    private var saldo: Double = 0.0
    var comision = true

    fun addTitular(titular: Persona) {
        if (titulares.size < 3) {
            titulares.add(titular)
        } else {
            print("Se ha alcanzado el máximo de titulares.")
        }
    }

    fun delTitular(titular: Persona) {
        if (titulares.size <= 1) {
            println("Debe haber al menos un titular.")
        } else if (titulares.remove(titular)){
            println("Titular eliminado correctamente.")
        } else {
            println("Imposible borrar.")
        }
    }

    fun delTitular(dni: Int) {
        if (titulares.size <= 1) {
            println("Debe haber al menos un titular.")
        } else {
            for (persona in titulares) {
                if (persona.dni == dni && titulares.remove(persona)) {
                    println("Titular eliminado correctamente.")
                }
            }
        }
    }

    fun ingresarDinero(cantidad: Double) {
        if (cantidad > 0) {
            this.saldo += cantidad
        }
    }

    override fun toString(): String {
        return "Cuenta(titulares=$titulares, numeroCuenta=$numeroCuenta, saldo=$saldo, comision=$comision)"
    }


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