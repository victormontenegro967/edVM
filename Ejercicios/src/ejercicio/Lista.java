
package ejercicio;

public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = fin = null;
    }
    
    public void agregarInicio(int dato){
        
        Nodo nuevo = new Nodo(dato, inicio);
        
        if(inicio == fin && inicio == null){
            inicio = fin = nuevo;
        }
        else{
            inicio = nuevo;
        }
    }
    
    public void imprimir(Nodo actual){
        
        if(actual != null){
            System.out.println(actual.getDato() + " ");
            imprimir(actual.getSiguiente());
        }      
    }
    
    public void imprimir(){
        imprimir(inicio);
    }
    
    public void buscar(int buscar1, int buscar2){
        
        Nodo aux = inicio;
        int control = 0;
        
        while(aux.getSiguiente() != null && control == 0){
            
            if(aux.getDato() == buscar1){
                if(aux.getSiguiente().getDato() == buscar2){
                    control = 1;
                    
                    int resta = (buscar1 - buscar2);
                    
                    if(resta < 0){
                        resta =resta * (-1);
                    }
                    
                    Nodo reemplazo = new Nodo(resta,aux.getSiguiente());
                    aux.setSiguiente(reemplazo);
                    
                }
                else{
                    aux = aux.getSiguiente();
                }
            }
            else{
                aux = aux.getSiguiente();     
            }
        }
        if(control == 0){
            System.out.println("La secuencia no existe en esta lista");            
        }
    }
    

}
