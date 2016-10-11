

package ejercicio;


public class Principal {
    public static void main(String[] args){
        
        Lista coleccion = new Lista();
        
        System.out.println("Lista original");
        coleccion.agregarInicio(56);
        coleccion.agregarInicio(100);
        coleccion.agregarInicio(69);
        coleccion.agregarInicio(170);
        coleccion.agregarInicio(25);
        coleccion.agregarInicio(30);
        coleccion.imprimir();
        System.out.println("Lista despues de agregar la diferencia de nodos");
        coleccion.buscar(69, 100);
        coleccion.imprimir();
        
    }
}
