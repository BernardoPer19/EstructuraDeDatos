package edl;

public class ColaPrioridad<T extends Comparable<T>> extends Cola<T> {

    public void offer(T dato){
        if(isEmpty()){
            cola.add(dato);
        }else{
            boolean bb = false;            
            for(int i = 0; i<cola.size(); i++){
                T actual = (T)cola.get(i);
                if(dato.compareTo(actual) == 1){
                    cola.add(i,dato);
                    bb = true;
                }
            }

            if(!bb){
                cola.add(dato);
            }

        }
    }
    
}
