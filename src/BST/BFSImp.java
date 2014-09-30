package BST;

import Queue.QueueImp;

/**
 * Created by anshul on 30/9/14.
 */
public class BFSImp {

    public static void main(String[] args) {

        BinarySearchTreeImp bstree = new BinarySearchTreeImp();
        int arr[] = {12,45,65,23,78,54,24,100};

        for(int i=0;i<arr.length;i++) {
            bstree.insert(arr[i]);
        }
        

    }

}
