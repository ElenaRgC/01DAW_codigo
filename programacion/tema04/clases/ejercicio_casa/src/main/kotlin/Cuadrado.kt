class Cuadrado {
    var lado = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor() {
        this.lado = 0
    }

    constructor(lado: Int) {
        this.lado = lado
    }


    var perimetro = 4 * lado
        get() {
            return 4 * lado
        }

    var area = lado * lado
        get() {
            return lado * lado
        }

    fun setlado(lado: Int) {
        this.lado = lado
    }

    fun imprimirPerimetro() {
        println("El perimetro es ${this.perimetro}")
    }

    fun imprimirArea() {
        println("El area es $area")
    }
}