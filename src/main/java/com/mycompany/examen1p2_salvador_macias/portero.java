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
public class portero extends jugador {

    public portero(String nombre, int edad, String nacionalidad, String pie, com.mycompany.examen1p2_salvador_macias.equipo equipo) {
        super(nombre, edad, nacionalidad, pie, equipo);
    }

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
        this.fisico = i;
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
        int num = random.nextInt(6);
        int i = num * 13;
        this.vision = i;
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
        int num = random.nextInt(6);
        int i = num * 13;
        this.regate = i;
    }

    @Override
    public void disparo() {
        Random random = new Random();
        int num = random.nextInt(6);
        int i = num * 13;
        this.disparo = i;
    }

    @Override
    public void agarre() {
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
    public void lanzamiento() {
        Random random = new Random();
        boolean bool = true;
        while (bool) {
            int num_rand = random.nextInt(13);
            int i = num_rand * 12;
            if (i >= 70 && i < 100) {
                this.passing = i;
                bool = false;
            } else {
                bool = true;
            }
        }
    }

    @Override
    public void rating() {
        int rating = (this.fisico + this.agarre + this.disparo + this.entrada + this.lanzamiento
                + this.passing + this.ritmo + this.regate + this.vision) / 9;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
