package lab4_manuel_andrea;

public class EVAPM extends EVA {

    public boolean movimiento(int x, int y, int x_actual, int y_actual) {
        boolean t=false;
        if (x>=0 && x<=9 && y>=0 && y<=9) {
            t=true;
        }
        return t;
    }

    public boolean ataque(int x, int y, int x_actual, int y_actual) {
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

}
