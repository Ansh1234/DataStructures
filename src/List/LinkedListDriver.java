package List;

/**
 * Created by anshul on 30/9/14.
 */
public class LinkedListDriver {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        LinkedListImp list = new LinkedListImp();

        for (int i =0; i< arr.length; i++) {
            list.insert(arr[i]);
        }




        System.out.println(list.toString());
    }
}
