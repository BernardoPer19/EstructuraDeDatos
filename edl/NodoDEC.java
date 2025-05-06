package edl;

public class NodoDEC<T>{

    private T dato;
    private NodoDEC<T> siguiente;
    private NodoDEC<T> anterior;

    public NodoDEC(){
        siguiente = null;
        anterior = null;
    }

    public NodoDEC(T valor){
        dato = valor;
        siguiente = new NodoDEC<T>();
        anterior = new NodoDEC<T>();
    }

    public NodoDEC<T> getSiguiente(){
        return siguiente;
    }

    public NodoDEC<T> getAnterior(){
        return anterior;
    }    

    public void setSiguiente(NodoDEC<T> newNodo){
        siguiente = newNodo;
    }

    public void setAnterior(NodoDEC<T> newNodo){
        anterior = newNodo;
    }    

    public boolean vacio(){
        boolean res = false;
        if(dato == null){
            res = true;
        }
        return res;
    }

}
