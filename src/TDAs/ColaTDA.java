package TDAs;

public abstract class ColaTDA {
    //Dominio:
    //Cola = Secuencia de elementos ordenados por llegada, donde el primer lugar se encuentra en el primer elemento que entró (FIFO).

    //Operaciones:
    //crear() → Cola
    //post: devuelve una cola vacía

    public abstract void encolar(int elemento);
    //pre: la cola no debe estar llena
    //post: debe agregar el elemento a la cola

    public abstract void desencolar();
    //pre: la cola no debe estar vacía
    //post: debe eliminar el primer elemento de la cola

    public abstract int primero();
    //pre: la cola no debe estar vacía
    //post: devuelve el elemento que esta en el frente de la cola

    public abstract boolean esVacia();
    //post: devuelve true si esta vacia, devuelve false si tiene elementos
}

