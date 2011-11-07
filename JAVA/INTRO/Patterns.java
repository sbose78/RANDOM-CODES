
/**
 * Write a description of class Patterns here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patterns
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Patterns
     */
    public Patterns(int x)
    {
        // initialise instance variables
        this.x = x;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void Pattern1()
    {
        // put your code here
        for(int i=1;i<=x;i++){
                for(int j=1;j<=i;j++)
                {
                        System.out.print(j+"\t ");
                }
                    System.out.println();
         }
         for(int i= x-1 ;i>0  ;i--){
             for(int j=1;j<=i;j++){
                 System.out.print(j+"\t");
                }System.out.println();
            }
            
    }
    public void Pattern2(){
        char c='a';
        for(int i=1;i<=x;i++){
            int spaces= x-i;
            int limit = x + (i-1) ;
            
            for(int j=1;j<=limit ; j++){
                    if( j<=spaces) 
                    {
                        System.out.print(" ");
                        continue;
                    }
                    
                    if( i % 2 != 0 )
                        {
                        if( j%2 == 0 )
                            {
                                System.out.print(c+" ");
                            }
                       }
                       
                       else {
                            if(j%2 != 0 )
                            {
                                System.out.print(c+" ");
                            }
                        }
                    }System.out.println();
                }
            }
                    
            
                    
        
}
