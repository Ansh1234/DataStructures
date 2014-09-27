package Stack;

/**
 * Created by anshul on 27/9/14.
 */
public class StackImp{

    public int top;
    int[] arr;
    int size;
    StackImp(int size){
        top=-1;
        arr = new int[size];
        this.size=size;
    }

    public void pop(){

        if(top==-1){
            System.out.println("Stack is already empty");
            top--;
        }
    }

    public void push(int element){

        if(top==(size-1)){
            System.out.println("Stack is full");
        }
        else{
            arr[top++]=element;
        }
    }


}
