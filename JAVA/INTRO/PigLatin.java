
/**
 * Write a description of class PigLatin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PigLatin
{
    // instance variables - replace the example below with your own
    private String str;

    /**
     * Constructor for objects of class PigLatin
     */
    public PigLatin(String s)
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
    public String toPG()
    {
        
        int index= indexOfFirstLetter();
        char arr[]= str.toCharArray();
        int j=0;
        /*
         for(int i=index;i<str.length();i++)
        {
            pigLatin[j++]=str.charAt(i);
        }
         */
        
        String pg1=new String(arr,index, str.length() - index );
        
        String pg2=new String(arr,0,index);
        String pg=new String();
        if(index!=0){pg = pg1 + pg2 + "AY";}
        else { pg=pg1+pg2;}
        
        /*
         
        for(int i=0;i<index;i++)
        {
            pigLatin[j++]=str.charAt(i);
        }
         String pg=new String(pigLatin);
         
         if(index != 0 ) pg=pg + "AY";
         
         */
         
         return pg;
    }
   
    public boolean isVowel(char c)
    {
        switch(c)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
                
        }
        return false;
    }
    
    public int indexOfFirstLetter()
    {
        int index=0;
        for(int i=0;i<str.length();i++)
        {
            if(  isVowel( str.charAt(i) ) )
          
            {
                index=i;
                return index;
            }
        }
        return 0;
    }        
}
