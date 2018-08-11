package lab4_manuel_andrea;

public class Piloto {
    protected String nombre;
    protected int edad;
    protected String fam;
    protected String encargado;
    protected String escuela;
    protected double sinc;
    protected EVA asignado;

    public Piloto() {
    }

    public Piloto(String nombre, int edad, String fam, String encargado, String escuela, double sinc, EVA asignado) {
        this.nombre = nombre;
        this.edad = edad;
        this.fam = fam;
        this.encargado = encargado;
        this.escuela = escuela;
        this.sinc = sinc;
        this.asignado = asignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getSinc() {
        return sinc;
    }

    public void setSinc(double sinc) {
        this.sinc = sinc;
    }

    public EVA getAsignado() {
        return asignado;
    }

    public void setAsignado(EVA asignado) {
        this.asignado = asignado;
    }

    @Override
    public String toString() {
        return "Piloto{" + "Nombre: " + nombre + ", Edad: " + edad + ", Familiar: " + fam + ", Encargado: " + encargado + ", Escuela: " + escuela + ", Sincronización: " + sinc + ", Asignado: " + asignado + '}';
    }
    
    
    
    
}
