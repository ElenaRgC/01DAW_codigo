package com.example.emociones.Database.Empleado

interface EmpleadoDAO {
    fun sonMismoEmpleado(empleado1: Empleado, empleado2: Empleado): Boolean
    fun selectEmpleado(ID: Int): Empleado
}