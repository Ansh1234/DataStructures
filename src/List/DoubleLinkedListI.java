package List;

/**
 * Created by anshul on 16/10/14.
 */
public interface DoubleLinkedListI {

    public void insert(int elementToBeInserted);
    public void insertAt(int index, int elementToBeInserted);
    public void insertAfter(int element, int elementToBeInserted);
    public void remove(int element);
    public void removeAt(int index);
    public void removeAfter(int element);
    public int size();
    public boolean isEmpty();
    public void display();
    public String toString();
    public DoubleLinkedListNode returnHead();
    public int getElement(DoubleLinkedListNode currNode);
    public DoubleLinkedListNode getNext(DoubleLinkedListNode currNode);
    public void reverse();

}
