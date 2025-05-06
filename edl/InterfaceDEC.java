package edl;

public interface InterfaceDEC<T> {
    void addAtBeginning(T dato);
    void addtData(T dato);
    void addPositionAndData(int pos, T dato); // agregado segundo parámetro

    void deleteFromBeginning();
    void deleteFromEnd();
    T deleteAtPosition(int pos);

    int size();
    boolean isEmpty();
}
