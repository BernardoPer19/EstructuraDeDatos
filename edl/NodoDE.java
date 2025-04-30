package edl;

public class NodoDE<T>{
    private T dato;
    private NodoDE<T> Siguiente;
    private NodoDE<T> Anterior;
    public NodoDE(){
        dato = null;
        Siguiente = null;
        Anterior = null;
    }

    public NodoDE(T valor){
        dato =  valor;
        this.Siguiente = new NodoDE<T>();
        this.Anterior = new NodoDE<T>();
    }

    public NodoDE<T> getSiguiente(){
        return Siguiente;
    }

    public T getDato(){
        return dato;
    }

    public void setDato(T nuevoDato){
        dato = nuevoDato;
    }

    public NodoDE<T> getAnterior(){
        return Anterior;
    }

    public void setSiguiente(NodoDE<T> dato){
        Siguiente = dato;
    }

    public void setAnterior(NodoDE<T> dato){
        Anterior = dato;
    }

    public boolean vacio(){
        boolean res = false;
        if(dato == null){
            res = true;
        }
        return res;
    }
}
