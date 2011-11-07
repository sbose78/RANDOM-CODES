
/**
 * Write a description of class PERMUTE3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PERMUTE3
{
    // instance variables - replace the example below with your own
    private String str;

    /**
     * Constructor for objects of class PERMUTE3
     */
    public PERMUTE3(String str)
    {
        // initialise instance variables
        this.str=str;
    }

    public void permute()
    {
         int i,j,k,l;
        String s=new String();
        int count=0;
        for(i=0;i<3;i++){
                char c= str.charAt(i);
               for(j=0;j<3;j++){
                   
                   if(j!=i){
                    char d=str.charAt(j);
                    
                    for(k=0;k<3;k++){
                        
                        if(k!=j && k!=i){
                            char e=str.charAt(k);
                                    s=Character.toString(c)+Character.toString(d)+ Character.toString(e);
                                    System.out.println(s);
                                    s=new String();
                                
                            }
                        }
                    }
                }
            }
        }

}
            
                
        
        


