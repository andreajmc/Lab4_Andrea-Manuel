package lab4_manuel_andrea;

import java.awt.Color;

public class EVAPM extends EVA {

    public EVAPM(Color C, int añop, double alt, String alma, int ojos, String pais, Piloto P, int codigo, double daño) {
        super(C, añop, alt, alma, ojos, pais, P, codigo, daño);
    }

    public EVAPM() {
    }
    
    

    public boolean movimiento(int x, int y, int x_actual, int y_actual) {
        boolean t=false;
        if (x>=0 && x<=9 && y>=0 && y<=9) {
            t=true;
        }
        return t;
    }

    public boolean ataque(int x, int y, int x_actual, int y_actual) {
        boolean t=false;
        
        return t;
    }

}
