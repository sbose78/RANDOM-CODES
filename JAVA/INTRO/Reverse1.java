
/**
 * Write a description of class Reverse1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.StringTokenizer;
public class Reverse1
{
    // instance variables - replace the example below with your own
    private String str;

    /**
     * Constructor for objects of class Reverse1
     */
    public Reverse1(String str)
    {
        // initialise instance variables
        this.str=str;
    }
    public void print()
    {
        StringTokenizer tok=new StringTokenizer(str);
        int noOfWords=tok.countTokens();
        
        String sentence[]=new String[ noOfWords];
        
        for(int i=0;i<noOfWords; i ++)
        {
                sentence[i]=tok.nextToken();
        }
        
        for(int i= noOfWords-1; i >= 0 ; i--)
        {
            System.out.print(sentence[i]+" ");
        }
    }
}
            
            
            
        
        
