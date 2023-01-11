class Circulo {
    var radio = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(radio: Int) {
        this.radio = radio
    }

    val PI = 3.141592654

    var perimetro = 2 * PI * radio
        get() {
            return 2 * PI * radio
        }

    var area = PI * radio * radio
        get() {
            return PI * radio * radio
        }

    fun setradio(radio: Int) {
        this.radio = radio
    }

    fun imprimirPerimetro() {
        println("El perimetro es ${this.perimetro}")
    }

    fun imprimirArea() {
        println("El area es $area")
    }
}