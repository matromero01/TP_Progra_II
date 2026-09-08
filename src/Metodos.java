import Implementaciones.PilaEstaticaA;
import TDAs.PilaTDA;

public class Metodos {
    // SECCION METODOS PILA
    // # Aclaración: siempre que creamos una Pila utilizamos PilaEstaticaA, pero todos los metodos funcionan
    // de igual manera con PilaEstaticaB.

    public static PilaTDA pasarPila(PilaTDA origen) {
        PilaTDA aux = new PilaEstaticaA(100);
        PilaTDA nuevaPila = new PilaEstaticaA(100);

        // 1. Apila el tope de origen en aux y desapila origen
        while (!origen.esVacia()) {
            aux.apilar(origen.tope());
            origen.desapilar();
        }

        // 2. Lo mismo que antes pero de aux a la nuevaPila
        while (!aux.esVacia()) {
            nuevaPila.apilar(aux.tope());
            aux.desapilar();
        }

        return nuevaPila;
    }

    public static PilaTDA copiarPila(PilaTDA p){
        PilaTDA aux = new PilaEstaticaA(100);
        PilaTDA copiaPila = new PilaEstaticaA(100);

        // 1. Apila el tope de p en aux y lo desapila
        while (!p.esVacia()) {
            aux.apilar(p.tope());
            p.desapilar();
        }

        // 2. Lo mismo que antes pero de aux a la nuevaPila
        while (!aux.esVacia()) {
            copiaPila.apilar(aux.tope());
            p.apilar(aux.tope());
            aux.desapilar();
        }

        return copiaPila;
    }

    public static PilaTDA invertirPila(PilaTDA p){
        PilaTDA pilaInvertida = new PilaEstaticaA(100);
        invertirRecursivo(p, pilaInvertida);
        return pilaInvertida;
    }

    private static void invertirRecursivo(PilaTDA p, PilaTDA pilaInvertida) {
        // 1. Tomamos el tope de p y lo desapilamos
        if (!p.esVacia()) {
            int elem = p.tope();
            p.desapilar();

            // 2. Lo apilamos de forma inversa
            pilaInvertida.apilar(elem);

            // 3. Llamada recursiva
            invertirRecursivo(p, pilaInvertida);

            // 4. Volvemos a apilar p al terminar toda la recursion
            p.apilar(elem);
        }
    }

    public static boolean masDeUnaOcurrencia(PilaTDA p){
        PilaTDA copia = copiarPila(p); // Usamos el metodo copiarPila(p) anterior
        boolean duplicado = false;

        // 1. Tomamos el tope de la copia de p
        while (!copia.esVacia() && !duplicado){
            int actual = copia.tope();
            copia.desapilar();

            PilaTDA aux = new PilaEstaticaA(100);

            // 2. Lo comparamos con todos los elementos de copia
            while (!copia.esVacia()) {
                int elem = copia.tope();
                copia.desapilar();

                if (elem == actual)
                    duplicado = true;

                // 3. Guardamos todos los elementos en una pila auxiliar, para poder reconstruir la original mas tarde
                aux.apilar(elem);
            }

            // 4. Reconstruimos copia y vaciamos aux
            while (!aux.esVacia()) {
                copia.apilar(aux.tope());
                aux.desapilar();
            }
        }

        return duplicado;
    }

    public static PilaTDA eliminarImpares(PilaTDA  p){
        PilaTDA pilaPares = new PilaEstaticaA(100);
        // 1. Invertimos p, para despues poder apilar los pares en el orden correcto
        PilaTDA pilaInvertida = invertirPila(p);

        // 2. Si tope es par, se apila y sino se descarta. Al final desapilamos en cualquier caso
        while (!pilaInvertida.esVacia()) {
            int elemPar = pilaInvertida.tope();
            if (elemPar % 2 == 0)
                pilaPares.apilar(elemPar);

            pilaInvertida.desapilar();
        }

        return pilaPares;
    }


    // SECCION METODOS COLA














    // SECCION METODOS COLA CON PRIORIDAD
















}
