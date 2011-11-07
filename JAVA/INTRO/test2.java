
public class test2
{
    // instance variables - replace the example below with your own
    public int x;

    /**
     * Constructor for objects of class test2
     */
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public static void change_val(int n){
        n= n+10;
    }
    
    public static void change_ref(test2 object){
        object.x+=10;
    }
    public static void main(String args[])
    {
        test2 obj=new test2();
        obj.x=12;
        
        int a=5;
        
        change_val(a);
        change_ref(obj);
        
        System.out.println("VALUE 1: "+obj.x);
        System.out.println("VALUE 2: "+a);
    }
}
        
        