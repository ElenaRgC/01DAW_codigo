fun main() { // Elena Rodríguez Calderón
    /*
    Dada una cadena, y un carácter, verificar cuántas veces se repite el carácter en la
    cadena, por ejemplo:
    Entrada: cad = "casa blanca", car = 'a'
    Salida: El carácter 'a' se repite 4 veces.
     */

    println("Introduce una cadena: ")
    val cadena: String = readln().lowercase()
    println("Introduce un carácter: ")
    val caracter: String = readln().lowercase()

    contarCaracteres(cadena, caracter)

}


fun contarCaracteres(cadena: String, caracter:String) {
    var i = 0
    var numeroCaracteres = 0

    while (i < cadena.length) {
        if (cadena[i] == caracter[0]) {
            numeroCaracteres++
        }
        i++
    }

    println("La cadena tiene $numeroCaracteres $caracter.")
}