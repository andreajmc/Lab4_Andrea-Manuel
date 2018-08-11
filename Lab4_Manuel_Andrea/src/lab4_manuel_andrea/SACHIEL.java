package lab4_manuel_andrea;

import java.awt.Color;
public class SACHIEL extends ANGELES {

    public SACHIEL() {
        super();
    }

    public SACHIEL(Color color, String descripcion, String sangre, String fecha, String nombre, String volar, int potencia) {
        super(color, descripcion, sangre, fecha, nombre, volar, potencia);
    }
    @Override
     public  boolean movimiento(int x,int y,int x_actual,int y_actual){
         boolean t=false;
         if (x_actual+y_actual==x+y) {
             t=true;
         }
         if (x_actual-y_actual== x-y) {
             t=true;
         }
         if (y_actual-x_actual==y-x) {
             t=true;
         }
         return t;
     }
    @Override
      public boolean  ataque(int x,int y , int x_actual,int y_actual){
          boolean t=false;
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
    
}
