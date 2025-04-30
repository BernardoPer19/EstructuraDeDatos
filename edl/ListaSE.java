package edl;

public class ListaSE<T>{
    private NodoSE<T> ini;
    private int size;

    public ListaSE(){
        ini = new NodoSE<T> ();
        size = 0;
    }

    public T get(int pos){
        T res = null; 
        if(pos>=0 && pos < size){
            NodoSE<T> ac = ini;
            while(pos > 0){
                ac = ac.getSiguiente();
                pos --;
            }
            res = ac.getDato();
        }
        return res;
    }

    public T remove(int pos){
        T res = null;
        if(pos >= 0 && pos<size){
            NodoSE<T> ant = null;
            NodoSE<T> act = ini;

            while(pos>0){
                ant = act;
                act = act.getSiguiente();
                pos --;
            }
            res = act.getDato();
            if(ant == null){
                ini = ini.getSiguiente();
            }else{
                ant.setSiguiente(act.getSiguiente());
            }
            size--;
        }
        return res;
    }

    public int indexOf(T dato){
        int pos = -1;
        if(!ini.vacio()){
            NodoSE<T> act = ini;
            pos = 0;

            while(pos < size && !act.getDato().equals(dato)){
                act = act.getSiguiente();
                pos++;
            }
            if(pos == size){
                pos = -1;
            }

        }

        return pos;
    }

    public boolean remove(T dato){
        int index = indexOf(dato);
        boolean res = false;
        if(index >= 0){
            remove(index);
            res = true;
        }
        return res;
    }

    public void add(T valor){
        NodoSE<T> aux = ini; 
        while(!aux.vacio()){
            aux = aux.getSiguiente();
        }
        aux.setDato(valor);
        aux.setSiguiente(new NodoSE<T>());
        size++;
    }
}
