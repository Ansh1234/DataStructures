package Stack;

import List.LinkedListNode;
import List.LinkedListImp;

/**
 * Created by anshul on 16/10/14.
 */
public class StackLinkedListImp implements StackI{

    LinkedListImp list = new LinkedListImp();
    @Override

    public void push(int element) {
        list.insert(element);

    }

    @Override
    public void pop() {
        list.removeAt(list.size()-1);
    }

    @Override
    public void peep() {
        list.display();
    }
}
