package lab4_manuel_andrea;

import java.awt.Color;

public class EVA extends Ancestrales {

    private Color C;
    private int añop;
    private double alt;
    private String alma;
    private int ojos;
    private String pais;
    private Piloto P;
    private int codigo;
    private double daño;

    public EVA(Color C, int añop, double alt, String alma, int ojos, String pais, Piloto P, int codigo, double daño) {
        this.C = C;
        this.añop = añop;
        this.alt = alt;
        this.alma = alma;
        this.ojos = ojos;
        this.pais = pais;
        this.P = P;
        this.codigo = codigo;
        this.daño = daño;
    }

    public EVA() {
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
