fun main() { // Elena Rodríguez Calderón

    var gatera = ArrayList<Gato>()

    var g1 = Gato()
    g1.nombre = "Sox"

    gatera.add(g1)

    println("Soy g1 $g1.")
    println("Soy gatera[0] " + gatera[0] + ".")

    gatera.add(g1)

    g1 = Gato()

    gatera.add(g1)

    g1 = Gato()

    var colonia = ColoniaDeGatos(g1)  

}

/*
    Interfaz "serVivo":
        - nacer() (es abstracto sí o sí aunque no se especifique)
        - crecer()                  ""
        - morir()                   ""
    Interfaz "animal":
        - atributo                  ""
        - método                    ""
    Clase abstracta "vegetal":
        - atributo abstracto
        - método abstracto
        - atributo
        - método
    Clase "gato":

 */