package javaapplication16;

public class Carro {
    private String nombre;
    private int posicion;
    private int velocidad;
    private boolean terminado;

    public Carro(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.posicion = 0;
        this.terminado = false;
    }

    public void avanzar() {
        if (!terminado) {
            posicion += velocidad;
        }
    }

    public String getNombre() { return nombre; }
    public int getPosicion() { return posicion; }
    public int getVelocidad() { return velocidad; }
    public boolean isTerminado() { return terminado; }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
}

