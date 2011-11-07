
/**
 * Write a description of class Permute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Permute
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Permute
     */
    public Permute()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void permute(char list[],int k,int m)
    {
         int i=0;
         if(k==m)
         {
             print(list);
         }
         else{
              for(i=k;i<m;i++)
              {
                  swap(list,k,i);
                  permute(list,k+1,m);
                  swap(list,k,i);
                
              }    
         }
    }
    
    public static void print(char list[])
    {
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]);
        }
        System.out.print(",");
    }
    
    public static void swap(char list[],int i,int j)
    {
        char temp=list[i]; 
        list[i]=list[j];
        list[j]=temp;
    }
    
    public static void main(String args[])
    {
        String s=args[0];// value passed as a command line argument
        char d[]=s.toCharArray();
        permute(d,0,s.length());
    }
}
