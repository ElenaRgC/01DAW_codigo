package com.example.ventanas

class Persona {
    var nombre:String=""

    constructor(n:String){
        nombre = n
    }

    override fun toString(): String {
        return "com.example.ventanas.Persona(nombre='$nombre')"
    }

}