class Punto {
    private var x:Int = 0
    private var y:Int = 0

    constructor(){
        x=0
        this.y=0
    }

    constructor(x:Int, y:Int){
        this.x=x
        this.y=y
    }

    fun getx():Int{
        return this.x
    }

    fun setx(x:Int){
        this.x=x
    }

    fun gety():Int{
        return this.y
    }

    fun sety(y:Int){
        this.y=y
    }

    fun presentacion(entrada:Int){
        println()
        when(entrada){
            1-> println("La x es ${x} y la y es " + y)
            2-> println("La x es $x")
            3-> println("La y es ${y}")
            else -> println("Imposible imprimir")
        }
    }

}