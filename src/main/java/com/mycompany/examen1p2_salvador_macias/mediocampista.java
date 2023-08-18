/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1p2_salvador_macias;

import java.util.Random;

/**
 *
 * @author papilon10
 */
public class mediocampista extends jugador {

    public mediocampista(String nombre, int edad, String nacionalidad, String pie, equipo equipo) {
        super(nombre, edad, nacionalidad, pie, equipo);
    }

    @Override
    public void agarre() {
        Random random = new Random();
        int num = random.nextInt(6);
        int i = num * 13;
        this.agarre = i;
    }

    @Override
    public void fisico() {
        Random random = new Random();
        int num = random.nextInt(6);
        int i = num * 13;
        this.fisico = i;
    }

    @Override
    public void ritmo() {
        Random random = new Random();
        int num = random.nextInt(6);
        int i = num * 13;
        this.ritmo = i;
    }

    @Override
    public void entrada() {
        Random random = new Random();
        int num = random.nextInt(6);
        int i = num * 13;
        this.entrada = i;
    }

    @Override
    public void vision() {
        Random random = new Random();
        boolean bool = true;
        while (bool) {
            int num = random.nextInt(13);
            int i = num * 12;
            if (i >= 70 && i < 100) {
                this.vision = i;
                bool = false;
            } else {
                bool = true;
            }
        }
    }

    @Override
    public void passing() {
        Random random = new Random();
        boolean bool = true;
        while (bool) {
            int num = random.nextInt(13);
            int i = num * 12;
            if (i >= 70 && i < 100) {
                this.passing = i;
                bool = false;
            } else {
                bool = true;
            }
        }
    }

    @Override
    public void regate() {
        Random random = new Random();
        boolean bool = true;
        while (bool) {
            int num = random.nextInt(13);
            int i = num * 12;
            if (i >= 70 && i < 100) {
                this.regate = i;
                bool = false;
            } else {
                bool = true;
            }
        }
    }

    @Override
    public void disparo() {
        Random random = new Random();
        int num = random.nextInt(6);
        int i = num * 13;
        this.disparo = i;
    }

    @Override
    public void lanzamiento() {
        Random random = new Random();
        int num = random.nextInt(6);
        int i = num * 13;
        this.lanzamiento = i;
    }

    @Override
    public void rating() {
        int rating = (this.fisico + this.agarre + this.disparo + this.entrada + this.lanzamiento + this.passing
                + this.ritmo + this.regate + this.vision) / 9;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
