package lab4_manuel_andrea;

import java.awt.Color;

public class ZERUEL extends ANGELES {

    public ZERUEL() {
        super();
    }

    public ZERUEL(Color color, String descripcion, String sangre, String fecha, String nombre, String volar, int potencia) {
        super(color, descripcion, sangre, fecha, nombre, volar, potencia);
    }
     public  boolean movimiento(int x,int y,int x_actual,int y_actual){
         boolean t=false;
       
         if ((x==x_actual+2 || x==x_actual-2) && y>=y_actual-2 && y==y_actual+2) {
             t=true;
         }
         if ((y==y_actual+2 || y==y_actual-2) && x>=x_actual-2 && x==x_actual+2) {
             t=true;
         }
         
         return t;
     }
      public boolean  ataque(int x,int y , int x_actual,int y_actual){
          boolean t=false;
          if (x==x_actual-1 && y==y_actual-1) {
              t=true;
          }
          if (x==x_actual-1 && y==y_actual-2) {
              t=true;
          }
          if (x==x_actual-2 && y==y_actual-1) {
              t=true;
          }
          if (x==x_actual-1 && y==y_actual+1) {
              t=true;
          }
          if (x==x_actual-1 && y==y_actual+2) {
              t=true;
          }
          if (x==x_actual-2 && y==y_actual+1) {
              t=true;
          }
          if (x==x_actual+1 && y==y_actual-1) {
              t=true;
          }
          if (x==x_actual+1 && y==y_actual-2) {
              t=true;
          }
          if (x==x_actual+2 && y==y_actual-1) {
              t=true;
          }
          if (x==x_actual+1 && y==y_actual+1) {
              t=true;
          }
          if (x==x_actual+1 && y==y_actual+2) {
              t=true;
          }
          if (x==x_actual+2 && y==y_actual+1) {
              t=true;
          }
          return t;
      }
}
