
/**
 * Write a description of class SCBOSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SCBOSE
{
    // instance variables - replace the example below with your own
    private String str;

    /**
     * Constructor for objects of class SCBOSE
     */
    public SCBOSE(String s)
    {
        // initialise instance variables
        str=s;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int indexOfLastWord()
    {
        // put your code here
        int index=0;
        for(int i = str.length()-1 ; i>=0; i--)
        {
            if( Character.isLetter(str.charAt(i) ) && Character.isWhitespace(str.charAt(i-1)))
            { index=i;
                break;
            }
        }
        return index;
    }
    
    public void printWord(){
        char arr[]=new char[str.length()];
        arr=str.toCharArray();
        
        int index= indexOfLastWord();
        for(int i=0 ; i<str.length(); i++)
        {
            
            if( i==0 && Character.isLetter(arr[i])  )
            {
                System.out.print(arr[i]+".  ");
                continue;
            }
            if(Character.isWhitespace(arr[i]) && Character.isLetter(arr[i+1]))
            {
                i++;
                if(i == index )
                {
                    while( i< str.length()){
                         System.out.print(arr[i]);
                         i++;
                    }
                 }
                 else
                 {
                     System.out.print(arr[i]+".  ");
                    
                 }
           }
       
        }
    }
}
                        
          