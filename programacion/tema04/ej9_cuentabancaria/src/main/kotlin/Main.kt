fun main() { // Elena Rodríguez Calderón
    var banco = ArrayList<Cuenta>()
    var grupo = ArrayList<Persona>()

    var nombres = arrayOf("José", "María", "Ana", "Eva", "Juan")
    var edades = intArrayOf(17, 50, 22, 16, 80)

    // Jose 17, Maria 50, Ana 22, Eva 16, Juan 80

    for (i in 0..4) {
        var persona = Persona()
        grupo.add(persona)
        persona.nombre = nombres[Random.NextInt(0, nombres.size)]
        persona.edades = edades[Random.NextInt(0, edades.size)]
        persona.dni = i + 1
    }
}