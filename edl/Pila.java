package edl;

/**
 * Write a description of class Pila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pila<T>{

    private NodoSE<T> tope;

    public Pila(){
        tope = null;
    }

    public boolean isEmpty(){
        return tope == null;
    }

    public void push(T dato){
        NodoSE<T> nuevoTope = new NodoSE<T>(dato);
        if(tope == null){
            tope = nuevoTope;
        }else{
            nuevoTope.setSiguiente(tope);
            tope = nuevoTope;
        }
    }

    public T pop(){
        T  res = null;
        if(tope != null){
            res = tope.getDato();
            tope = tope.getSiguiente();
        }
        return res;
    }

    public T peek(){
        T res = null;
        if(tope != null){
            res = tope.getDato();
        }
        return res;
    }

}
