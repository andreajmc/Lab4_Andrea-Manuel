package lab4_manuel_andrea;

import java.awt.Color;
public class RAMIEL extends ANGELES {

    public RAMIEL() {
        super();
    }

    public RAMIEL(Color color, String descripcion, String sangre, String fecha, String nombre, String volar, int potencia) {
        super(color, descripcion, sangre, fecha, nombre, volar, potencia);
    }
     public  boolean movimiento(int x,int y,int x_actual,int y_actual){
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
      public boolean  ataque(int x,int y , int x_actual,int y_actual){
          boolean t=false;
         
          return t;
      }
}
