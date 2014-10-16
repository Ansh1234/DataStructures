package Stack;

/**
 * Created by anshul on 27/9/14.
 */
public class StackImp implements StackI{

    private int top;
    private int[] arr;
    private int size;
    StackImp(int size){
        top=-1;
        arr = new int[size];
        this.size=size;
    }

    public void pop(){

        if(top==-1){
            System.out.println("Stack is already empty");
        }
        else {
            top--;
        }
    }

    @Override
    public void peep() {

        for(int i=0;i<=top;i++) {
            System.out.println(arr[i]);
        }

    }

    public void push(int element){

        if(top==(size-1)){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top]=element;
        }
    }


}
