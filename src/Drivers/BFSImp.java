package Drivers;

import BST.BinarySearchTreeImp;
import List.LinkedListNode;
import Queue.QueueLinkedListImp;


/**
 * Created by anshul on 30/9/14.
 */
public class BFSImp {

    public static void main(String[] args) {

        BinarySearchTreeImp bstree = new BinarySearchTreeImp();
        int arr[] = {45,32,56,29,9,49,89};

        for(int i=0;i<arr.length;i++) {
            bstree.insert(arr[i]);
        }

        QueueLinkedListImp queue = new QueueLinkedListImp();
        queue.enqueue(bstree.getRoot().element);


        while(!queue.isEmpty()) {
            do {
                LinkedListNode front = queue.returnFront();
                if(front != null) {
                    System.out.println(front.element);
                    if (bstree.returnNode(front.element).left != null)
                        queue.enqueue(bstree.returnNode(front.element).left.element);
                    if (bstree.returnNode(front.element).right != null)
                        queue.enqueue(bstree.returnNode(front.element).right.element);
                    queue.dequeue();
                }
            }while(queue.returnFront() != queue.returnRear());
        }
    }

}
