package com.example.examen_05_22.Database.usuario

interface UsuarioDAO {

    fun selectUsuarios(): ArrayList<Usuario>

    fun insertarUsuarios(usuarios: ArrayList<Usuario>): Boolean

}