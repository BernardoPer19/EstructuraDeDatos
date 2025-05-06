package edl;

public class ListaDEC<T> implements InterfaceDEC<T> {

    private NodoDEC<T> inicio;
    private NodoDEC<T> fin;
    private int size;

    public ListaDEC() {
        fin = null;
        inicio = null;
        size = 0;
    }

    public ListaDEC(NodoDEC<T> nodo) {
        inicio = nodo;
        fin = nodo;
        size = 1;
    }

    @Override
    public void addAtBeginning(T dato) {
        // implementación pendiente
    }

    @Override
    public void addtData(T dato) {
        NodoDEC<T> nuevo = new NodoDEC<T>(dato);
        if(isEmpty()){
            nuevo = inicio;
            nuevo = fin;

            size++;
        }else if(inicio == fin){
            inicio.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
            inicio.setAnterior(fin);
            fin.setSiguiente(inicio);
            
            size++;
        }else {
            nuevo.setAnterior(fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
            size++;
        }

    }

    @Override
    public void addPositionAndData(int pos, T dato) {
        // implementación pendiente
    }

    @Override
    public void deleteFromBeginning() {
        // implementación pendiente
    }

    @Override
    public void deleteFromEnd() {
        // implementación pendiente
    }

    @Override
    public T deleteAtPosition(int pos) {
        // implementación pendiente
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
