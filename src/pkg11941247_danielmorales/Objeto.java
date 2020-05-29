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
public class Objeto {
    private Color color;
    private String desc;
    private String marca;
    private int tam;
    private String calidad;
    private Persona personaIng;

    public Objeto() {
    }

    public Objeto(Color color, String desc, String marca, int tam, String calidad, Persona personaIng) {
        this.color = color;
        this.desc = desc;
        this.marca = marca;
        this.tam = tam;
        this.calidad = calidad;
        this.personaIng = personaIng;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getPersonaIng() {
        return personaIng;
    }

    public void setPersonaIng(Persona personaIng) {
        this.personaIng = personaIng;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", desc=" + desc + ", marca=" + marca + ", tam=" + tam + ", calidad=" + calidad + ", personaIng=" + personaIng + '}';
    }
    
    
    
}
