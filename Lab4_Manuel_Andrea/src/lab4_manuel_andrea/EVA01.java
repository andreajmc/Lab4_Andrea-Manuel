package lab4_manuel_andrea;

public class EVA01 extends EVA {

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

}
