/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1p2_salvador_macias;

import java.util.ArrayList;

/**
 *
 * @author papilon10
 */
public class equipo {

    private String nombre;
    private String pais;
    private int rating;
    private ArrayList<jugador> plantilla = new ArrayList();

    public equipo() {
    }

    public equipo(String nombre, String pais, int rating) {
        this.nombre = nombre;
        this.pais = pais;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<jugador> plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return "equipo{" + "nombre=" + nombre + ", pais=" + pais + ", rating=" + rating + ", plantilla=" + plantilla + '}';
    }

}
