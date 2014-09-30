package BST;

/**
 * Created by anshul on 30/9/14.
 */
public class BSTDriver {

    public static void main(String[] args) {

        BinarySearchTreeImp obj = new BinarySearchTreeImp();
        int arr[] = {34,12,67,45,11,90,93};

        for(int i =0; i<arr.length;i++) {
            obj.insert(arr[i]);
        }

       // obj.display();
       // System.out.println(obj.sizeOfTree());

        obj.remove(67);
        System.out.println("displaying");
        obj.display();
    }
}
