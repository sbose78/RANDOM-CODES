
/**
 * Write a description of class Cryptography here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cryptography
{
    // instance variables - replace the example below with your own
    private String str;

    /**
     * Constructor for objects of class Cryptography
     */
    public Cryptography(String s)
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
    public String encode(int move)
    {
        // put your code here
        char s[]=str.toCharArray();
        
        for(int i=0;i<str.length();i++){
            
                char c=s[i];
                if(Character.isLetter(s[i])){
                    s[i]+=move;
                    
                    if( (c+move) > 'Z' )
                    {
                        move=( (c+move) - 'A' )%26 ;
                        s[i]= (char)('A' + move -1)  ;
                    }
                    else c+=move;
                }
            }
            
        String encoded=new String(s);
        return encoded;
    }
}
