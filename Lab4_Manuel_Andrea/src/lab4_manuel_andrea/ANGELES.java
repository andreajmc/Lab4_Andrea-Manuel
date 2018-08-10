/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_manuel_andrea;

import java.awt.Color;

/**
 *
 * @author mevl1
 */
public class ANGELES extends Ancestrales {
    private Color color;
    private String descripcion;
    private String sangre;
    private String fecha;
    private String nombre;
    private String volar;
    private int potencia;

    public ANGELES() {
        super();
    }

    public ANGELES(Color color, String descripcion, String sangre, String fecha, String nombre, String volar, int potencia) {
        this.color = color;
        this.descripcion = descripcion;
        this.sangre = sangre;
        this.fecha = fecha;
        this.nombre = nombre;
        this.volar = volar;
        this.potencia = potencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public boolean movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
