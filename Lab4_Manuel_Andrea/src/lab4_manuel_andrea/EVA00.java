package lab4_manuel_andrea;

import java.awt.Color;

public class EVA00 extends EVA {
private int cont = 5;
    

    public EVA00(Color C, int añop, double alt, String alma, int ojos, String pais, Piloto P, int codigo, double daño) {
        super(C, añop, alt, alma, ojos, pais, P, codigo, daño);
    }
    
    public EVA00() {
        super();
    }

    public boolean movimiento(int x, int y, int x_actual, int y_actual) {
        boolean t=false;
         if (x_actual==x && y==y_actual+1 ) {
             t=true;
         }
         if (x_actual==x && y==y_actual-1) {
             t=true;
         }
         if (y_actual==y && x==x_actual+1) {
             t=true;
         }
         if (y_actual==y && x==x_actual-1) {
             t=true;
         }
         if (x==x_actual-1 && y==y_actual-1) {
             t=true;
         }
         if (x==x_actual+1 && y==y_actual+1) {
             t=true;
         }
        return t;
    }

    public boolean ataque(int x, int y, int x_actual, int y_actual) {
        boolean t=true;
        if (y==y_actual && x==x_actual+1) {
            t=true;
        }
          if (y==y_actual && x==x_actual-1) {
            t=true;
        }
          if (y+x==y_actual+x_actual) {
            t=true;
        }
          if (x-y==x_actual-y_actual) {
            t=true;
        }
          if (y-x==y_actual-x_actual) {
            t=true;
        }
        return t;
    }
    
     public void setCont(int cont) {
        this.cont = cont;
    }
     
      public int getCont() {
        return cont;
    }
      
      
    
}
