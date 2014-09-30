package List;

/**
 * Created by anshul on 30/9/14.
 */
public class LinkedListImp implements LinkedListI {

    LinkedListNode head = null;

    @Override
    public void insert(int element) {

        LinkedListNode tempNode = new LinkedListNode();
        tempNode.next = null;
        tempNode.element = element;
        
        if (head == null) {
            head = tempNode;
        }
        else {
            LinkedListNode currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = tempNode;
        }
    }

    @Override
    public void insertAt(int index, int elementToBeInserted) {

        if (index > (size())) {
            return;
        }

        LinkedListNode tempNode = new LinkedListNode();
        tempNode.next = null;
        tempNode.element = elementToBeInserted;

        int iterate = 1;
        LinkedListNode currNode = head;

        while (iterate != (index - 1) ) {

            currNode = currNode.next;
            iterate ++;
        }




    }

    @Override
    public void insertAfter(int element, int elementToBeInserted) {

        if(isEmpty()) return;


        LinkedListNode currNode = head;
        boolean found = false;

        while ( (currNode != null) && (currNode.element != element) ) {

            currNode = currNode.next;
            found = true;
        }

        if(found) {

            LinkedListNode tempNode = new LinkedListNode();
            tempNode.next = null;
            tempNode.element = elementToBeInserted;
            tempNode.next = currNode.next;
            currNode.next = tempNode;
        }


    }

    @Override
    public void remove(int element) {

    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public void removeAfter(int element) {

    }

    @Override
    public int size() {

        LinkedListNode currNode = head;
        int count = 0;

        while(currNode != null) {
            count ++;
        }

        return count;
    }

    @Override
    public boolean isEmpty() {
        if(head == null)
            return true;
        else
            return false;
    }
}
