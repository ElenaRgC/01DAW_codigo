package com.example.examen_05_22.Services

import com.example.examen_05_22.Database.destino.Destino
import com.example.examen_05_22.Database.destino.DestinoDAOImpl
import com.example.examen_05_22.Database.usuario.Usuario
import com.example.examen_05_22.Database.usuario.UsuarioDAOImpl

class InsertarServices {

    companion object {

        var destinoDAOImpl = DestinoDAOImpl()
        var usuarioDAOImpl = UsuarioDAOImpl()

        fun recibirDestinos(): ArrayList<Destino> {
            return destinoDAOImpl.selectDestinos()
        }

        fun recibirUsuarios(): ArrayList<Usuario> {
            return usuarioDAOImpl.selectUsuarios()
        }

    }

}