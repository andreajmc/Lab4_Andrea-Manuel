package lab4_manuel_andrea;

import java.awt.Color;

public class EVA01 extends EVA {
private int cont = 5;

    public EVA01(Color C, int añop, double alt, String alma, int ojos, String pais, Piloto P, int codigo, double daño) {
        super(C, añop, alt, alma, ojos, pais, P, codigo, daño);
    }

    public EVA01() {
    }

    public boolean movimiento(int x, int y, int x_actual, int y_actual) {
        boolean t=false;
          if ((x==x_actual+3 || x==x_actual-3) && y>=y_actual-3 && y==y_actual+3) {
             t=true;
         }
         if ((y==y_actual+3 || y==y_actual-3) && x>=x_actual-3 && x==x_actual+3) {
             t=true;
         }
        return false;
    }

    public boolean ataque(int x, int y, int x_actual, int y_actual) {
        boolean t=true;
         if (((x==x_actual )|| (x<=x_actual+2) || (x>=x_actual-2))&&((y<=y_actual+2)||(y>=y_actual-2))) {
              t=true;
          }
        return false;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return cont;
    }
    
    

}
