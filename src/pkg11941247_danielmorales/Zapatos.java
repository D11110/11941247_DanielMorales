/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11941247_danielmorales;

import java.awt.Color;

/**
 *
 * @author danie
 */
public class Zapatos extends Objeto{
    private int talla;
    private String descSuela;
    private int comodidad;

    public Zapatos() {
    }

    public Zapatos(int talla, String descSuela, int comodidad, Color color, String desc, String marca, int tam, String calidad, Persona personaIng) {
        super(color, desc, marca, tam, calidad, personaIng);
        this.talla = talla;
        this.descSuela = descSuela;
        this.comodidad = comodidad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getDescSuela() {
        return descSuela;
    }

    public void setDescSuela(String descSuela) {
        this.descSuela = descSuela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", descSuela=" + descSuela + ", comodidad=" + comodidad + '}';
    }
    
    
}
