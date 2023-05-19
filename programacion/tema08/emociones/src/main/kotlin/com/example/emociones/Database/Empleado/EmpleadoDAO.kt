package com.example.emociones.Database.Empleado

interface EmpleadoDAO {
    fun selectEmpleado(IDempleado: Int): Empleado
    fun selectEmpleadosEquipo(IDgrupo:Int): ArrayList<Empleado>
}