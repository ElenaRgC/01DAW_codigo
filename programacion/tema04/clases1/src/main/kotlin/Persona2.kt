class Persona2 {
    private var edad: Int = 0
    private var nombre: String = ""
    var altura: Int = 0 //cm

    constructor(edad: Int) {
        this.edad = edad
    }

    constructor(edad: Int, nombre: String) {
        this.edad = edad
        this.nombre = nombre
    }
    constructor(nombre: String, altura: Int){
        this.nombre = nombre
        this.altura = altura
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

    fun getnombre():String{
        return this.nombre
    }

    fun setnombre(n:String){
        this.nombre=n
    }

    fun getaltura():Int{
        return this.altura
    }
    fun setaltura(a:Int){
        this.altura=a
    }

    fun getedad():Int{
        return  this.edad
    }

    fun setedad(e:Int){
        this.edad=e
    }

    fun presentacion(){
        println()
        print ("Persona(edad=$edad, nombre='$nombre', altura=$altura)")
    }


}//class