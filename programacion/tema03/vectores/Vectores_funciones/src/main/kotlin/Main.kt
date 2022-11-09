//Paso por valor, paso por referencia.
fun main(args: Array<String>) {
    //paso por referencia, llega puntero a la dirección de memoria
    val N = 5
    //creo un array inicializado a ceros de tamañio N
    var numeros = Array(N){0}

    rellenar(numeros)

    println("Vector:")
    for (i in 0 until numeros.size){
        print("["+ numeros[i]+ "] ")
    }


    var digito : Int = 0
    digito = rellenarNumero()
    println(" El número vale: ${digito}")

    //paso por valor, llega una copia del elemento.
    sumaNumeroAvector(numeros, digito)

    imprimir("La suma del número y vector",numeros)
}


fun rellenar(n:Array<Int>){
    for (i in n.indices){
        println ("Dame el número ${i + 1}")
        n[i]= readln().toInt()
    }
}
fun rellenarNumero():Int{
    println ("\nDame el número")
    return (readln().toInt())
}
fun sumaNumeroAvector(n:Array<Int>, d:Int){
    for (i in n.indices){
        n[i]= n[i] + d
    }
}

fun imprimir(s: String,n:Array<Int>){
    println(s)
    for (i in 0 until n.size){
        print("["+ n[i]+ "] ")
    }
}