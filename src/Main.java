import Implementaciones.ColaEstaticaA;
import Implementaciones.PilaEstaticaA;
import TDAs.ColaTDA;
import TDAs.PilaTDA;

public class Main {

    public static void main(String[] args) {
        // Pruebas de los métodos de Pila (está incompleto) -- "ES OPCIONAL, LO HICE POR NECESIDAD"
        PilaTDA p1 = new PilaEstaticaA(100);
        p1.apilar(1);
        p1.apilar(4);
        p1.apilar(6);
        p1.apilar(7);

        System.out.println("Pila: " + p1);
        System.out.println("Tope: " + p1.tope());

        PilaTDA p2 = Metodos.pasarPila(p1);

        System.out.println("Pila: " + p2);
        System.out.println("Tope: " + p2.tope());


        ColaTDA c1 = new ColaEstaticaA(100);
        c1.encolar(3);
        c1.encolar(3);
        c1.encolar(1);

        ColaTDA c2 = new ColaEstaticaA(100);
        c2.encolar(3);
        c2.encolar(3);
        c2.encolar(3);

        System.out.println(Metodos.finalCoincide(c1,c2,3));

        //System.out.println(c1.primero());
        //System.out.println(c2.primero());


    }
}
