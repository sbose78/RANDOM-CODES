
/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stack
{
    // instance variables - replace the example below with your own
    private int tos;
    private int arr[];
    private int size;

    /**
     * Constructor for objects of class Stack
     */
    public Stack(int size)
    {
        // initialise instance variables
        tos = -1;
        arr=new int[this.size=size];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void push(int n)
    {
        tos++;
        if((tos+1)>size)
        {
            System.out.println("STACK OVERFLOW !!! " );
        }
        else{    
            arr[tos]=n;
        }
    }
    
    public int pop(){
        
        int n;
       if(tos==size) size--;
        if(tos<0)
        {
            System.out.println("STACK UNDERFLOW");
            return 0;

        }else{
            n=arr[tos];
             tos--;
             System.out.println(n);
            return n;
        }
    }
            
}
