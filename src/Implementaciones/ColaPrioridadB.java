package Implementaciones;

import TDAs.ColaPrioridadTDA;

public class ColaPrioridadB extends ColaPrioridadTDA {

        private int[] valores;
        private int[] prioridades;
        private int cantidad;

        public ColaPrioridadB(int capacidad) {
            this.valores = new int[capacidad];
            this.prioridades = new int[capacidad];
            this.cantidad = 0;
        }

        @Override
        public boolean esVacia() {
            return cantidad == 0;
        }


        @Override
        public void insertar(int elemento, int p) {
            int i = cantidad - 1;

            while (i >= 0 && prioridades[i] >= p) {
                prioridades[i + 1] = prioridades[i];
                valores[i + 1] = valores[i];
                i--;
            }
        prioridades[i + 1] = p;
        valores[i + 1] = elemento;
        cantidad++;
    }

    public int verMax() {
        return valores[cantidad - 1];
    }
    public int extraerMax() {
        cantidad--;
        return valores[cantidad];
    }

}
