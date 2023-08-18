/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1p2_salvador_macias;

/**
 *
 * @author papilon10
 */
public abstract class jugador {

    String nombre;
    int edad;
    String nacionalidad;
    String pie;
    int rating;
    equipo equipo;
    int agarre;
    int lanzamiento;
    int fisico;
    int ritmo;
    int entrada;
    int vision;
    int passing;
    int regate;
    int disparo;

    public jugador() {
    }

    public jugador(String nombre, int edad, String nacionalidad, String pie, equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pie = pie;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPHabil() {
        return pie;
    }

    public int getRating() {
        return rating;
    }

    public equipo getEquipo() {
        return equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public int getVision() {
        return vision;
    }

    public int getPassing() {
        return passing;
    }

    public int getRegate() {
        return regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public void setEquipo(equipo Equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + nombre + ", Edad=" + edad + ", Nacionalidad=" + nacionalidad + ", PHabil=" + pie + ", Rating=" + rating + ", Equipo=" + equipo + ", Agarre=" + agarre + ", Lanzamiento="
                + lanzamiento + ", Fisico=" + fisico + ", Ritmo=" + ritmo + ", Entrada=" + entrada + ", Vision=" + vision + ", Passing=" + passing + ", Regate=" + regate + ", Disparo=" + disparo + '}';
    }

    public abstract void agarre();

    public abstract void fisico();

    public abstract void ritmo();

    public abstract void entrada();

    public abstract void vision();

    public abstract void passing();

    public abstract void regate();

    public abstract void disparo();

    public abstract void lanzamiento();

    public abstract void rating();
}
