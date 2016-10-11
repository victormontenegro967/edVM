

package ejercicio;


public class Principal {
    public static void main(String[] args){
        
        Lista coleccion1 = new Lista();
        
        coleccion1.agregarInicio(100);
        coleccion1.agregarInicio(56);
        coleccion1.agregarInicio(15);
        coleccion1.agregarInicio(65);
        coleccion1.agregarInicio(89);
        coleccion1.agregarInicio(400);
        coleccion1.ordenarAscendente();
        System.out.println("\nLista 1:");
        coleccion1.imprimir();
        
        Lista coleccion2 = new Lista();
        coleccion2.agregarInicio(8);
        coleccion2.agregarInicio(78);
        coleccion2.agregarInicio(111);
        coleccion2.agregarInicio(643);
        coleccion2.agregarInicio(99);
        coleccion2.agregarInicio(5);
        coleccion2.ordenarAscendente();
        System.out.println("\nLista 2");
        coleccion2.imprimir();
        
        Lista coleccion3 = new Lista();
        
        for(int cont1 = 0; cont1 < coleccion1.contar(); cont1 ++){
            coleccion3.agregarInicio(coleccion1.valorIndice(cont1));
        }
        for(int cont1 = 0; cont1 < coleccion2.contar(); cont1 ++){
            coleccion3.agregarInicio(coleccion2.valorIndice(cont1));
        }
        
        coleccion3.ordenarDescendente();
        System.out.println("\nLista 3");
        coleccion3.imprimir();
    }
}
