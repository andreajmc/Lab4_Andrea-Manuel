package lab4_manuel_andrea;

import java.awt.Color;

public class EVA02 extends EVA {
private int cont = 5;

 public void setCont(int cont) {
        this.cont = cont;
    }

    public EVA02(Color C, int añop, double alt, String alma, int ojos, String pais, Piloto P, int codigo, double daño) {
        super(C, añop, alt, alma, ojos, pais, P, codigo, daño);
    }

    public EVA02() {
    }
 
    public boolean movimiento(int x, int y, int x_actual, int y_actual) {
        boolean t=false;
        if (((x==x_actual+1)||(x==x_actual-1))&& ((y==y_actual+2) || (y==y_actual-2))) {
            t=true;
        }
        if (((x==x_actual+2)||(x==x_actual-2))&& ((y==y_actual+1) || (y==y_actual-1))) {
            t=true;
        }
            
        
        return t;
    }

    public boolean ataque(int x, int y, int x_actual, int y_actual) {
        boolean t = false;
        if (x==x_actual-1 && y==y_actual) {
            t=true;
        }
        if (x==x_actual-2 && y==y_actual) {
            t=true;
        }
        if (x==x_actual-1 && y==y_actual-1) {
            t=true;
        }
        if (x==x_actual-2 && y==y_actual-2) {
            t=true;
        }
        if (x==x_actual-1 && y==y_actual+1) {
            t=true;
        }
        if (x==x_actual-2 && y==y_actual+2) {
            t=true;
        }
        if (x==x_actual-2 && y==y_actual-1) {
            t=true;
        }
        if (x==x_actual-2 && y==y_actual+1) {
            t=true;
        }
        return t;
    }
    
     public int getCont() {
        return cont;
    }

}
