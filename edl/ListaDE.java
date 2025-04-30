
package edl;

public class ListaDE<T>{

    private NodoDE<T> ini;
    private NodoDE<T> fin;
    private int size;

    public ListaDE() {
        ini = null;
        fin = null;
        size = 0;
    }

    public boolean vacio() {
        return ini == null;
    }

    public ListaDE(NodoDE<T> nodo) {
        ini = nodo;
        fin = nodo;
        size = 1;
    }

    public void AgregarNodo(T dato){
        NodoDE<T> nuevo = new NodoDE<T>(dato);

        if(vacio()){
            ini = nuevo;
            fin = nuevo;
            size ++;
        }else if(ini == fin){
            ini.setSiguiente(nuevo);
            nuevo.setAnterior(ini);
            fin = nuevo;
        }else{
            nuevo.setAnterior(fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

public NodoDE<T> Buscado(T dato){
    NodoDE<T> aux = ini;
    if(vacio()) {
        return null;
    }
    while(aux != null){
        if(aux.getDato() != null && aux.getDato().equals(dato)){
            return aux;
        }
        aux = aux.getSiguiente();
    }
    return null;
}


    public int IndexOf(T dato){
        NodoDE<T> aux = ini;
        int pos = -1;
        if(!vacio()){ 
            pos = 0; 
            while(pos < size && !aux.getDato().equals(dato)){
                aux  = aux.getSiguiente();
                pos++;
            }   
        }
        return pos;      
    }

}
