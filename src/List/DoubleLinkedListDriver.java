package List;

/**
 * Created by anshul on 16/10/14.
 */
public class DoubleLinkedListDriver {

    public static void main(String[] args) {
        int arr[] = {1,2};

        DoubleLinkedListImp dllist = new DoubleLinkedListImp();
        for(int i=0;i<arr.length;i++) {
            dllist.insert(arr[i]);
        }

        /*dllist.insertAt(3,89);
        dllist.insertAt(0,34);
        dllist.insert(45);
        dllist.insertAfter(56, 98);
        dllist.insertAfter(5,90);

        dllist.removeAt(0);
        dllist.removeAt(9);
        dllist.removeAt(5);*/
        dllist.display();
        dllist.reverse();
        dllist.display();

        //System.out.println(dllist.toString());
    }
}
