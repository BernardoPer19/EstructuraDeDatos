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
        if(pos<0 || pos > size){
            System.out.println("no"); 
        }

        NodoDEC<T> nuevo = new NodoDEC<T>(dato);
        NodoDEC<T> siguiente = new NodoDEC<T>(dato);
        if(isEmpty()){
            inicio = fin = nuevo;
            nuevo.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);
            size++;
        }else if(pos == 0){
            nuevo.setAnterior(fin);
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            fin.setSiguiente(nuevo);
            inicio = nuevo;
        }else if(pos == size - 1){
            nuevo.setAnterior(fin);
            nuevo.setSiguiente(inicio);
            fin.setSiguiente(nuevo);
            inicio.setAnterior(nuevo);
            fin = nuevo;
        }else{
            NodoDEC<T> actual = inicio;

            for(int i = 0; i <= pos; i++){
                actual = actual.getSiguiente();
            }

            NodoDEC<T> anterior = actual.getAnterior();

            nuevo.setSiguiente(actual);
            actual.setAnterior(nuevo);
            nuevo.setAnterior(anterior);
            anterior.setSiguiente(nuevo);

        }
        size++;
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
    
        
        
        if(isEmpty()){
        return null;
        }else if(inicio == fin){
            inicio = null;
            fin = null;
        }else if(pos == size - 1){
            fin = fin.getAnterior();
            
        }
        
        
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
