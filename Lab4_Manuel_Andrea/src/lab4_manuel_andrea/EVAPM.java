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
        
        return t;
    }

}
