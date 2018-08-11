package lab4_manuel_andrea;

public class EVA02 extends EVA {
private int cont = 5;

 public void setCont(int cont) {
        this.cont = cont;
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
