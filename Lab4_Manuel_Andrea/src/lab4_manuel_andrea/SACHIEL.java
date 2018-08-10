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
public class SACHIEL extends ANGELES {

    public SACHIEL() {
        super();
    }

    public SACHIEL(Color color, String descripcion, String sangre, String fecha, String nombre, String volar, int potencia) {
        super(color, descripcion, sangre, fecha, nombre, volar, potencia);
    }
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
      public boolean  ataque(int x,int y , int x_actual,int y_actual){
          boolean t=false;
          return t;
      }
    
}
