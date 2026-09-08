package Implementaciones;

import TDAs.ColaTDA;

public class ColaEstaticaA extends ColaTDA {
    private int[] datos;
    private int inicio;     // indice del primer elemento
    private int fin;        // indice del proximo lugar libre
    private int cantidad;   // cuantos elementos hay actualmente
    private int capacidad;

    public ColaEstaticaA(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new int[capacidad];
        this.inicio = 0;
        this.fin = 0;
        this.cantidad = 0;
    }

    // esVacia(c) -> boolean
    public boolean esVacia() {
        return cantidad == 0;
    }

    public void encolar(int x) {
        if (cantidad == capacidad) {
            throw new RuntimeException("Cola llena");
        }
        datos[fin] = x;
        fin = (fin + 1) % capacidad;   // clave: circular, "da la vuelta" al 0
        cantidad++;
    }

    // desencolar(c) -> Cola
    public void desencolar() {
        if (esVacia()) {
            throw new RuntimeException("Cola vacia");
        }
        inicio = (inicio + 1) % capacidad;  // clave: circular
        cantidad--;
    }

    // primero(c) -> elemento
    public int primero() {
        if (esVacia()) {
            throw new RuntimeException("Cola vacia");
        }
        return datos[inicio];
    }

}
