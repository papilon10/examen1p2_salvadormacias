/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1p2_salvador_macias;

/**
 *
 * @author papilon10
 */
public class estadio {

    private String nombre;
    private String ciudad;
    private int capacidad;
    private equipo equipo;

    public estadio() {
    }

    public estadio(String nombre, String ciudad, int capacidad, equipo equipo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "estadio{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", capacidad=" + capacidad + ", equipo=" + equipo + '}';
    }

}
