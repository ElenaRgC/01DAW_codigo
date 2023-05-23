package com.example.examen_05_22.Database.ciudad

interface CiudadDAO {

    fun selectNombreCiudades(): ArrayList<String>
    fun insertarCiudades(ciudades: ArrayList<String>): Boolean

}