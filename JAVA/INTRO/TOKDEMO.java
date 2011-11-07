import java.util.*;
import java.io.*;
public class TOKDEMO
{
    // instance variables - replace the example below with your own
    private String str;

    /**
     * Constructor for objects of class TOKDEMO
     */
    public TOKDEMO(){
        str=new String();
    }
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void printSCBOSE()throws IOException
    {
        // put your code here
       
        System.out.println("ENTER STRING: ");
        str=br.readLine();
        StringTokenizer s=new StringTokenizer(str);

        System.out.println(s.countTokens());
        String word=new String();
        
        int blocks=s.countTokens();
        for(int count=1; count<=s.countTokens() ;count++)
        { 
           word = s.nextToken();
           
           if(count==blocks) 
           {   
               System.out.println(word);
            }
           else{
               
               System.out.println(word.charAt(0)+ ". ");
           
            }
        }
    }
    
    public void printBOSESC() throws IOException{ 
        System.out.println("ENTER STRING: ");
        str=br.readLine();
        StringTokenizer s=new StringTokenizer(str);

        System.out.println(s.countTokens());
        String word=new String();
        
        int blocks=s.countTokens();
        
        word = s.nextToken();
        for(int count=1; count!=blocks ;count++,word = s.nextToken());
        System.out.print(word+"  ");
        
        s=new StringTokenizer(str);
        for(int count=1; count<blocks ;count++)
        { 
           word = s.nextToken();
           System.out.print(word.charAt(0)+ ". ");
        }
    }
}