package Queue;

/**
 * Created by anshul on 27/9/14.
 */
public class QueueImp implements QueueI {

    private int front=-1, rear=-1,size;
    private int arr[];

    public QueueImp(int size) {

        this.size=size;
        arr = new int[size];

    }
    public void enqueue(int element){

        if(front == -1){
            front++;
        }
        if(rear < size-1) {
            rear++;
            arr[rear] = element;
        }
        else {
            System.out.println("Queue is almost full");
        }

    }

    public void dequeue(){

        if(isEmpty() || (front>rear)) {
            System.out.println("Queue is already empty");
        }
        else {
            front ++;
        }

    }

    @Override
    public boolean isEmpty() {
        if(front == -1) return true;
        return false;
    }

}
