package Stack;

/**
 * Created by anshul on 16/10/14.
 */
public class StackDriver {

    public static void main(String[] args) {

        StackLinkedListImp stack = new StackLinkedListImp();
        stack.pop();
        stack.push(8);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(7);
        stack.push(0);
        stack.push(1);
        stack.push(34);
        stack.pop();
        stack.peep();
    }
}
