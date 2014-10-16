package List;

/**
 * Created by anshul on 16/10/14.
 */
public class DoubleLinkedListImp implements DoubleLinkedListI {

    DoubleLinkedListNode head = null;

    @Override
    public void insert(int elementToBeInserted) {

        DoubleLinkedListNode node = new DoubleLinkedListNode();
        node.element = elementToBeInserted;
        node.next = null;
        node.previous = null;


        if(head == null) {
            head = node;
        }
        else {
            DoubleLinkedListNode tempNode = head;
            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            if(tempNode.next != null)
                tempNode.next.previous=node;
            tempNode.next = node;
            node.previous = tempNode;
        }
    }

    @Override
    public void insertAt(int index, int elementToBeInserted) {

        if(index > size()) {
            System.out.println("Element cannot be inserted at the given index");
        }
        else if(index ==0) {
            DoubleLinkedListNode tempNode = new DoubleLinkedListNode();
            tempNode.element=elementToBeInserted;
            head.previous = tempNode;
            tempNode.next = head;
            tempNode.previous = null;
            head = tempNode;
        }
        else {
            int count = 0;
            DoubleLinkedListNode tempNode = head;
            while(count != (index-1)) {
                count ++;
                tempNode = tempNode.next;
            }

            DoubleLinkedListNode node = new DoubleLinkedListNode();
            node.element = elementToBeInserted;
            node.next = tempNode.next;
            node.previous = tempNode;
            if(tempNode.next != null)
                tempNode.next.previous=node;
            tempNode.next = node;

        }
    }

    @Override
    public void insertAfter(int element, int elementToBeInserted) {

        DoubleLinkedListNode tempNode = head;
        DoubleLinkedListNode node = null;
        boolean found = false;
        while(tempNode !=null) {
            if(tempNode.element==element) {
                node = new DoubleLinkedListNode();
                node.element = elementToBeInserted;
                node.previous = tempNode;
                node.next = tempNode.next;
                if(tempNode.next != null)
                    tempNode.next.previous=node;
                tempNode.next = node;

                found = true;
                break;
            }
            tempNode=tempNode.next;
        }

        if(found==false) {
            System.out.println("Cannot find the element after which the given Element is to be inserted..");
        }
    }


    @Override
    public void remove(int element) {

        DoubleLinkedListNode tempNode = head;
        while(tempNode != null) {
            if(tempNode.element==element) {
                if(tempNode.previous != null) {
                    tempNode.previous.next = tempNode.next;
                    if(tempNode.next != null)
                        tempNode.next.previous = tempNode.previous;
                }
                else
                    head = tempNode.next;
                break;
            }
            tempNode = tempNode.next;
        }

    }

    @Override
    public void removeAt(int index) {

        if(index > (size()-1)) {
            System.out.println("Cannot delete at the following index");
        }
        else {
            int count = 0;
            DoubleLinkedListNode tempNode= head;
            while(count != index) {
                tempNode = tempNode.next;
                count++;
            }
            if(tempNode.previous != null) {
                tempNode.previous.next = tempNode.next;
            }
            else {
                head=head.next;
            }
            if(tempNode.next != null) {
                tempNode.next.previous = tempNode.previous;
            }


        }
    }

    @Override
    public void removeAfter(int element) {

        DoubleLinkedListNode tempNode = head;
        while(tempNode != null) {
            if(tempNode.element == element) {
                if(tempNode.next != null) {
                    tempNode.next = tempNode.next.next;
                    if(tempNode.next.next != null)  {
                        tempNode.next.next.previous = tempNode;
                    }
                }
                else {
                    System.out.println("No element found after the given element");
                }

            }
            tempNode = tempNode.next;
        }
    }

    @Override
    public int size() {

        DoubleLinkedListNode tempNode = head;
        int count = 0;
        while(tempNode != null) {
            tempNode = tempNode.next;
            count++;
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

    @Override
    public void display() {

        DoubleLinkedListNode tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.element);
            tempNode = tempNode.next;
        }

    }

    public String toString() {
        DoubleLinkedListNode currNode = head;

        StringBuilder sb = new StringBuilder(" [ ");

        while(currNode != null) {

            sb.append(currNode.element+" = ");
            currNode = currNode.next;

        }
        int index = sb.lastIndexOf("=");
        sb = new StringBuilder(sb.substring(0,index));
        sb.append(" ] ");

        return sb.toString();
    }

    @Override
    public DoubleLinkedListNode returnHead() {
        return head;
    }

    @Override
    public int getElement(DoubleLinkedListNode currNode) {
        return 0;
    }

    @Override
    public DoubleLinkedListNode getNext(DoubleLinkedListNode currNode) {
        return null;
    }


    @Override
    public void reverse() {

        DoubleLinkedListNode tempNode = head;
        while(tempNode.next != null) {
            tempNode = tempNode.next;
        }
        head=tempNode;
        while(tempNode != null) {
            DoubleLinkedListNode temp = tempNode.next;
            tempNode.next = tempNode.previous;
            tempNode.previous = temp;
            tempNode = tempNode.next;
        }

    }


}
