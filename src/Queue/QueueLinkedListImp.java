package Queue;

import List.*;
import java.util.ArrayList;

/**
 * Created by anshul on 30/9/14.
 */

public class QueueLinkedListImp implements QueueI {

    LinkedListImp list = new LinkedListImp();
    private LinkedListNode front, rear = null;

    @Override
    public void enqueue(int element) {

        list.insert(element);
        if(front == null) {
           front = list.returnHead();
            rear = list.returnHead();
        }
        else {
            rear = rear.next;
        }
    }

    @Override
    public void dequeue() {

        if((front != null) && (front != rear)) {
            front = front.next;
        }
    }

    @Override
    public boolean isEmpty() {

        if(front == null) return true;

        return false;
    }

    @Override
    public void display() {

        LinkedListNode tempNode = front;
        while(tempNode != rear) {
            System.out.println(tempNode.element);
            tempNode = tempNode.next;
        }
        System.out.println(rear.element);
    }


}