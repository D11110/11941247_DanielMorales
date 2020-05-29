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
public class Ropa extends Objeto{

    private int talla;
    private String tipoTela;
    private String pais;

    public Ropa() {
    }

    public Ropa(int talla, String tipoTela, String pais, Color color, String desc, String marca, int tam, String calidad, Persona personaIng) {
        super(color, desc, marca, tam, calidad, personaIng);
        this.talla = talla;
        this.tipoTela = tipoTela;
        this.pais = pais;
    }

    

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tipoTela=" + tipoTela + ", pais=" + pais + '}';
    }
    
    
    
}
