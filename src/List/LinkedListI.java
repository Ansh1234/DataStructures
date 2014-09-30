package List;

/**
 * Created by anshul on 30/9/14.
 */
public interface LinkedListI {

    public void insert(int elementToBeInserted);
    public void insertAt(int index, int elementToBeInserted);
    public void insertAfter(int element, int elementToBeInserted);
    public void remove(int element);
    public void removeAt(int index);
    public void removeAfter(int element);
    public int size();
    public boolean isEmpty();
}
