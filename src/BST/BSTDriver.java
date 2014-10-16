package BST;

/**
 * Created by anshul on 30/9/14.
 */
public class BSTDriver {

    public static void main(String[] args) {

        BinarySearchTreeImp obj = new BinarySearchTreeImp();
        int arr[] = {34,56,12,78,9,4,14,46};

        for(int i =0; i<arr.length;i++) {
            obj.insert(arr[i]);
        }

        obj.remove(34);
        obj.remove(14);
        obj.remove(56);
        obj.remove(12);
        obj.remove(9);
        obj.remove(4);
        obj.remove(46);
        obj.remove(78);
        obj.remove(89);

     




    }
}
