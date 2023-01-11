class Casa {
    lateinit var padre: Persona
    lateinit var  madre: Persona2

    constructor(p:Persona, m:Persona2 ){
        this.padre = p
        this.madre = m
    }

    fun DatosMatrimonio(){
        println()
        println("Datos matrimonio:")
        println(padre.toString())
        madre.presentacion()
    }
}