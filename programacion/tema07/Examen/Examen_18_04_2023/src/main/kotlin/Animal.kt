class Animal: SerVivo {

    var fuerza = 0
    var esLibre = true

    constructor()

    override fun toString(): String {
        return "Animal: esperanzaVida=$esperanzaVida, nombre='$nombre', edad=$edad, fuerza=$fuerza, esLibre=$esLibre"
    }

}