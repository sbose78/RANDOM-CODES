
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    private int arr[];

    /**
     * Constructor for objects of class test
     */
    public test()
    {
        arr=new int[5];
    }

    public void fill(int a[])
    {
        // put your code here
        for(int i=0;i<a.length;i++)
        {
            a[i]=i;
        }
    }
    void print(){
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
    void control(){
        fill(arr);
        print();
    }
        
}
    