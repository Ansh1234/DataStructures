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


        if(element == head.element) {
            head = head.next;
        }
        else {
            if(!removeElement(element,head)) {
                System.out.println("Element not found..");
            }
        }


    }



    private boolean removeElement(int element, LinkedListNode node) {

        if(node.element == element) {
            return true;
        }
        else {
            if(node.next != null) {
                if(removeElement(element, node.next)) {
                    node.next = node.next.next;
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void removeAt(int index) {
       int count = 0;

        if(index>(size()-1)) {
            System.out.println("Cannot remove element from the given index");
        }
        else if(index ==0) {
            head=head.next;
        }
        else {
            LinkedListNode node = head;

            while(node.next != null) {

                if((index - 1) == count) {
                    break;
                }
                else {
                    count++;
                    node=node.next;
                }

            }
            System.out.println(node.element);
            System.out.println(node.next.element);
            System.out.println(node.next.next);
            node.next = node.next.next;

        }

    }

    @Override
    public void removeAfter(int element) {

        boolean found = false;

        LinkedListNode node = head;
        while(node != null) {
            if(node.element == element) {
                if(node.next != null) {
                    node.next = node.next.next;

                }
                found = true;
                break;
            }
            else {
                node = node.next;
            }
        }

        if(!found) {
            System.out.println("No such element exists");
        }

    }

    @Override
    public int size() {
        LinkedListNode currNode = head;
        int count = 0;

        while(currNode != null) {
            count ++;
            currNode = currNode.next;
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

    public void display() {

        LinkedListNode currNode = head;

        while(currNode != null) {

            System.out.println(currNode.element);
            currNode = currNode.next;
        }
    }

    public String toString() {

        LinkedListNode currNode = head;

        StringBuilder sb = new StringBuilder(" [ ");

        while(currNode != null) {

            sb.append(currNode.element+" -> ");
            currNode = currNode.next;

        }
        sb.append(" ] ");
        return sb.toString();
    }

    @Override
    public LinkedListNode returnHead() {
        return head;
    }

    @Override
    public int getElement(LinkedListNode currNode) {
        return currNode.element;
    }

    @Override
    public LinkedListNode getNext(LinkedListNode currNode) {
        return currNode.next;
    }

    @Override
    public void reverse() {

        reverseNode(head).next = null;
    }

    public LinkedListNode reverseNode(LinkedListNode node) {

        if(node.next == null) {
            head = node;
        }
        else {
             LinkedListNode tempNode;
             tempNode = reverseNode(node.next);
             tempNode.next = node;
        }

        return node;

    }


}
