fun main() { // Elena Rodríguez Calderón

    /*
    Dada una hora por teclado (horas, minutos y segundos) realiza un algoritmo que muestre la hora
    después de incrementarle un segundo.
     */


    println("Introduce la hora.")
    var horas: Int = readln().toInt()

    println("Introduce los minutos.")
    var minutos: Int = readln().toInt()

    println("Introduce los segundos.")
    var segundos: Int = readln().toInt() + 1

 if (segundos - 1 < 60) {
     println("$horas:$minutos:$segundos")
 } else {
     segundos = segundos - 60
     minutos = minutos + 1

     if ( minutos + 1 < 60) {
         println("$horas:$minutos:$segundos")
     } else {
         minutos = minutos - 60
         horas = horas + 1

         if (horas > 23) {
             horas = 0
             println("$horas:$minutos:$segundos")
         } else {
             println("$horas:$minutos:$segundos")
         }
     }
 }

}