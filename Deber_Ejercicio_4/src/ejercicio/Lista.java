

package ejercicio;


public class Lista {
     private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = fin = null;
    }
    
    public void agregarInicio(int datos){
        Nodo nuevo = new Nodo(datos, inicio);
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
    
    public int contar(Nodo actual){
        
        
        if(actual != null){

            return contar(actual.getSiguiente())+1;
            
            
        }
        return 0;            

    }
    
    public int contar(){
        return contar(inicio);
    }
    
    
    public int valorIndice(int indice){
        
        int cont = 0;
        Nodo aux = inicio;
        
        while(cont < indice){
            aux = aux.getSiguiente();
            cont ++;
        }
        return aux.getDato();
    }
    
    public void cambiarValor(int indice, int valor){
         
        int cont = 0;
        Nodo aux = inicio;
        
        while(cont < indice){
            aux = aux.getSiguiente();
            cont ++;
        }
        aux.setDato(valor);
    }
    
    public void ordenarAscendente(){
        
        int aux = 0;
        
        for(int cont1 = 0; cont1 < contar(); cont1 ++){
            for(int cont2 = (cont1+1); cont2 < contar(); cont2 ++){
                if(valorIndice(cont1)>valorIndice(cont2)){
                    aux = valorIndice(cont1);
                    cambiarValor(cont1, valorIndice(cont2));
                    cambiarValor(cont2, aux);
                }
            }
        }
    }
    
    public void ordenarDescendente(){
        
        int aux = 0;
        
        for(int cont1 = 0; cont1 < contar(); cont1 ++){
            for(int cont2 = (cont1+1); cont2 < contar(); cont2 ++){
                if(valorIndice(cont1)<valorIndice(cont2)){
                    aux = valorIndice(cont1);
                    cambiarValor(cont1, valorIndice(cont2));
                    cambiarValor(cont2, aux);
                }
            }
        }
    }
    
    
    
}
