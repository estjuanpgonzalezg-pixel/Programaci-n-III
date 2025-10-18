package javaapplication16;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private List<Carro> carros;
    private int meta;
    private List<Carro> llegadas;

    public Carrera(int meta) {
        this.meta = meta;
        this.carros = new ArrayList<>();
        this.llegadas = new ArrayList<>();
    }

    public void agregarCarro(Carro carro) {
        carros.add(carro);
    }

    public void avanzar() {
        for (Carro c : carros) {
            if (!c.isTerminado()) {
                c.avanzar();
                if (c.getPosicion() >= meta) {
                    c.setTerminado(true);
                    llegadas.add(c);
                }
            }
        }
    }

    public boolean todosLlegaron() {
        return llegadas.size() == carros.size();
    }

    public List<Carro> getLlegadas() {
        return llegadas;
    }

    public List<Carro> getCarros() {
        return carros;
    }
}
