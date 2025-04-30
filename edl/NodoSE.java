package edl;

public class NodoSE<T>{
    private T dato;
    private NodoSE<T> Siguiente;

    public NodoSE(){
        dato = null;
        Siguiente = null;

    }

    public NodoSE(T valor){
        dato  = valor;
        Siguiente = new NodoSE<T> ();
    }

    public NodoSE<T> getSiguiente(){
        return Siguiente;
    }

    public T getDato(){
        return dato;
    }

    public void setDato(T valor){
        dato = valor;
    }

    public void setSiguiente(NodoSE<T> otro){
        Siguiente = otro;
    }

    public boolean vacio(){
        boolean res = false;
        if(dato == null){
            res = true;
        }
        return res;
    }

}
