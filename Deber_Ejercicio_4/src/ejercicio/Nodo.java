

package ejercicio;

public class Nodo {
    private int dato;
    private Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        siguiente = null;
    }

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
