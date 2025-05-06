
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

    public ListaDE(NodoDE<T> nodo) {
        ini = nodo;
        fin = nodo;
        size = 1;
    }

    public boolean vacio() {
        return ini == null;
    }


    public int getlength(){
        return size;
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

    public void insertAtPosition(int pos, T dato){
        NodoDE nuevo = new NodoDE<T>(dato);
        if(vacio()){
            nuevo = ini;
            nuevo = fin;
        }else if(pos == 0){
            nuevo.setSiguiente(ini);
            ini.setAnterior(nuevo);
            ini = nuevo;

        }else if(pos == size){
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }else{

            NodoDE<T> actual = ini;

            for(int i = 0; i < pos ; i++){
                actual = actual.getSiguiente();
            }

            NodoDE<T> anterior = actual.getAnterior();

            nuevo.setAnterior(anterior);
            nuevo.setSiguiente(actual);
            anterior.setSiguiente(nuevo);
            actual.setAnterior(nuevo);
        }

        size++;

    }

    public boolean deleteAtPosition(int pos) {
        if (vacio()) return false;
        if(pos < 0 || pos > size){
            return false;
        }

        if(ini == fin){
            ini = null;
            fin = null;
            size = 0;
        }else if(pos == 0){
            ini = ini.getSiguiente();
            ini.setAnterior(null);
            size--;
        }else if(pos == size - 1){
            fin = fin.getAnterior();
            fin.setSiguiente(null);
            size--;
        }else {
            NodoDE<T> actual = ini;

            for(int i = 0; i < pos ; i++){
                actual = actual.getSiguiente();
            }

            NodoDE<T> anterior = actual.getAnterior();
            NodoDE<T> siguiente = actual.getSiguiente();

            anterior.setSiguiente(siguiente);
            siguiente.setAnterior(siguiente);

        }

        size--;
        return true;
    }

}
