class Persona {//class
    var edad: Int = 0
        get() {
            return field
        }

        set(value) {
            field = value
        }
    var nombre: String = ""
    var altura: Int = 0 //cm

    constructor(edad: Int) {
        this.edad = edad
    }

    constructor(edad: Int, nombre: String) {
        this.edad = edad
        this.nombre = nombre
    }

    constructor(e: Int, a: Int) {
        this.edad = e
        this.altura = a
    }

    constructor(e: Int, n: String, a: Int) {
        this.edad = e
        this.nombre = n
        this.altura = a
    }

    override fun toString(): String {
        return "Persona(edad=$edad, nombre='$nombre', altura=$altura)"
    }


}