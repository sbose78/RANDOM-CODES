
/**
 * Write a description of class Queue here.
 * 
 * SHOUBHIK BOSE
 */
public class Queue
{
    // instance variables - replace the example below with your own
    private int arr[];
    int size;
    int front;
    int rear;
    
    public Queue(int size)
    {
       arr=new int[this.size=size];
        front=rear=size;
    }

    public int addData(int n)
    {
        displayQueue();
        if(!isFull()){
            if(isEmpty()) front--;
            rear--;
            arr[rear]=n;
            
            displayQueue();
            return 1;
        }
        else{
            
            displayQueue();
            return 0;
        }
    }
    public  int removeData(){
        displayQueue();
        int n=0;
        if(!isEmpty()){
            n=arr[front];
            arr[front]=0;
            front--;
        }
        else System.out.println("QUEUE WAS EMPTY");
        displayQueue();
        return n;
    }
    public boolean isFull(){
        if(rear==0 && front==size-1)return true;
        return false;
    }
    public boolean isEmpty(){
        if(rear==front+1 || (front==rear && front==size))return true;
        return false;
    }
    public void displayQueue()
    {
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }System.out.println();
    }
            
            
}